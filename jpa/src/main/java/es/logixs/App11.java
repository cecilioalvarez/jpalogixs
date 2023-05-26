package es.logixs;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class App11 {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("logixs");

        CompanyRepository repo= new CompanyRepository(emf.createEntityManager());
        List<Company> list = repo.findAll();

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


    }
}
