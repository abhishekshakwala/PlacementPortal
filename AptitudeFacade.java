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
public class AptitudeFacade extends AbstractFacade<Aptitude> {
    @PersistenceContext(unitName = "ShreeGanesh-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AptitudeFacade() {
        super(Aptitude.class);
    }

     public void persist(Aptitude a) 
    {
      em.persist(a);  
    }

    
      public void delete(String id)
    {
        em.remove(em.find(Aptitude.class, id));
    }
    
    public Aptitude load(String id)
    {
        Aptitude a = em.find(Aptitude.class, id);
        return a;
    }
    public List retrieveComp(String compname)
    {
        Query q = em.createQuery("Select t from Aptitude t where t.compname = :Compname", Aptitude.class);
        q.setParameter("Compname", compname);
        return q.getResultList();
    }

}
