package es.logixs;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App2 {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("logixs");
        EntityManager em = emf.createEntityManager();

        User user1= em.find(User.class,"2A");

        System.out.println(user1.getName());
        System.out.println(user1.getObjectId());
        System.out.println(user1.getLastName());
        System.out.println(user1.getEmail());


    }
}
