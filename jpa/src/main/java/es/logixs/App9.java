package es.logixs;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class App9 {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("logixs");
        EntityManager em = emf.createEntityManager();

        TypedQuery<Company> query = em.createQuery("select c from Company c ", Company.class);

        List<Company> list = query.getResultList();


        for (Company c : list) {

            System.out.println(c.getObjectId());
            System.out.println(c.getLimitUsers());
            for (User u : c.getUserList()) {

                System.out.println(u.getName());
            }

        }


    }
}
