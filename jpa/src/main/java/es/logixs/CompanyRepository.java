package es.logixs;

import javax.persistence.EntityManager;
import java.util.List;

public class CompanyRepository {

    private EntityManager em;

    public CompanyRepository(EntityManager em) {
        this.em = em;
    }

    public List<Company> findAll() {

       return em.createNamedQuery("Company.findAll").getResultList();
    }

    public void persist(Company company) {
        em.getTransaction().begin();
        em.persist(company);
        em.getTransaction().commit();
    }
}
