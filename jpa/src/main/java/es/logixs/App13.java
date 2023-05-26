package es.logixs;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import java.util.UUID;

public class App13 {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("logixs");

        CompanyRepository repo= new CompanyRepository(emf.createEntityManager());
        List<Company> list = repo.findAllByName("name1");

        //n+1 queries
        for (Company c : list) {

            System.out.println(c.getObjectId());
            System.out.println(c.getLimitUsers());
            System.out.println(c.getState());
        }


    }
}
