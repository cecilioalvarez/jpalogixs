package es.logixs;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class App7 {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("logixs");
        EntityManager em = emf.createEntityManager();

        TypedQuery<User> query= em.createQuery("select u from User u  order by u.name", User.class);

        List<User> list=query.getResultList();


        for (User u:list) {

            //System.out.println(u.getObjectId());
            System.out.println(u.getName());
            //System.out.println(u.getLastName());
            //System.out.println(u.getEmail());
        }

    }
}
