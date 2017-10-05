/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author abhishek
 */
@Stateless
public class CriteriaFacade extends AbstractFacade<Criteria> {
    @PersistenceContext(unitName = "ShreeGanesh-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CriteriaFacade() {
        super(Criteria.class);
    }

     public void persist(Criteria c) 
    {
      em.persist(c);  
    }

    
      public void delete(String compid)
    {
        em.remove(em.find(Criteria.class, compid));
    }
    
    public Criteria load(String compid)
    {
        Criteria c = em.find(Criteria.class, compid);
        return c;
    }
    
     public List retrieveCompCri(String compname)
    {
        Query q = em.createQuery("Select t from Criteria t where t.compname = :Compname", Criteria.class);
        q.setParameter("Compname", compname);
        return q.getResultList();
    }
}
