package es.logixs;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.UUID;

public class App2 {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("logixs");
        EntityManager em = emf.createEntityManager();


        User user1= em.find(User.class, UUID.fromString("59f182aa-495c-4741-a309-9f3c7831ca22"));

        System.out.println(user1.getName());
        System.out.println(user1.getObjectId());
        System.out.println(user1.getLastName());
        System.out.println(user1.getEmail());


    }
}
