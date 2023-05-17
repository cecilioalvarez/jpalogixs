package es.logixs;

import javax.persistence.*;
import java.util.List;

public class App4 {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("logixs");
        EntityManager em = emf.createEntityManager();

        TypedQuery<User> query= em.createQuery("select u from User u", User.class);
        List<User> list=query.getResultList();


        for (User u:list) {

            System.out.println(u.getObjectId());
            System.out.println(u.getName());
            System.out.println(u.getLastName());
            System.out.println(u.getEmail());
        }

    }
}
