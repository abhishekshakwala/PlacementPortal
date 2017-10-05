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
 * @author Pooja
 */
@Stateless
public class CompanyInfoFacade extends AbstractFacade<CompanyInfo> {
    @PersistenceContext(unitName = "ShreeGanesh-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CompanyInfoFacade() {
        super(CompanyInfo.class);
    }

        public void persist(CompanyInfo company) 
    {
      em.persist(company);  
    }
    
      public void delete(String compId)
    {
        em.remove(em.find(CompanyInfo.class, compId));
    }
    
    public CompanyInfo load(String compId)
    {
        CompanyInfo company = em.find(CompanyInfo.class, compId);
        return company;
    }
}
