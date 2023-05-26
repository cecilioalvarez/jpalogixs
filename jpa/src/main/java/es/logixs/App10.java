package es.logixs;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class App10 {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("logixs");
        EntityManager em = emf.createEntityManager();

        TypedQuery<Company> query = em.createQuery("select distinct c from Company c join fetch c.users u  ", Company.class);

        List<Company> list = query.getResultList();

        //n+1 queries
        for (Company c : list) {

            System.out.println(c.getObjectId());
            System.out.println(c.getLimitUsers());

            /*

            for (User u : c.getUsers()) {

                System.out.println(u.getName());
            }
            System.out.println("***********************");
            */
        }
        em.close();

    }
}
