package es.logixs;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class CompanyRepository {

    private EntityManager em;

    public CompanyRepository(EntityManager em) {
        this.em = em;
    }

    public List<Company> findAll() {

       return em.createNamedQuery("Company.findAll").getResultList();
    }
    public List<Company> findAllByName(String name) {

      TypedQuery<Company> query=
          em.createNamedQuery("Company.findAllByName",Company.class);
      query.setParameter("name",name);
      return query.getResultList();
    }

    public List<Company> findAllOrderByState() {

        return em.createNamedQuery("Company.findAllOrderByState").getResultList();
    }

    public void persist(Company company) {
        em.getTransaction().begin();
        em.persist(company);
        em.getTransaction().commit();
    }
}
