package es.logixs;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class App6 {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("logixs");
        EntityManager em = emf.createEntityManager();

        TypedQuery<User> query= em.createQuery("select u from User u where u.name=:name and u.lastName= :lastName", User.class);
        query.setParameter("name","John");
        query.setParameter("lastName","Doe");
        List<User> list=query.getResultList();


        for (User u:list) {

            System.out.println(u.getObjectId());
            System.out.println(u.getName());
            System.out.println(u.getLastName());
            System.out.println(u.getEmail());
        }

    }
}
