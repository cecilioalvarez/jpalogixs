package es.logixs;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App3 {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("logixs");
        EntityManager em = emf.createEntityManager();

        User user1= em.find(User.class,"2A");

        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.remove(user1);
        tx.commit();


    }
}
