package es.logixs;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import java.util.UUID;

public class App12 {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("logixs");

        CompanyRepository repo= new CompanyRepository(emf.createEntityManager());
        repo.persist(new Company(UUID.randomUUID(),"1","2","2",1));


    }
}
