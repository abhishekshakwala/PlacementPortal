/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author abhishek
 */
@Stateless
public class CompRegFacade extends AbstractFacade<CompReg> {
    @PersistenceContext(unitName = "ShreeGanesh-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CompRegFacade() {
        super(CompReg.class);
    }

     public void persist(CompReg company) 
    {
      em.persist(company);  
    }
    
      public void delete(String compId)
    {
        em.remove(em.find(CompReg.class, compId));
    }
    
    public CompReg load(String compId)
    {
        CompReg company = em.find(CompReg.class, compId);
        return company;
    }
}
