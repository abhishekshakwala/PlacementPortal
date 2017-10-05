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
public class StuRegFacade extends AbstractFacade<StuReg> {
    @PersistenceContext(unitName = "ShreeGanesh-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StuRegFacade() {
        super(StuReg.class);
    }
    public void persist(StuReg student) 
    {
      em.persist(student);  
    }
    
      public void delete(String greno)
    {
        em.remove(em.find(StuReg.class, greno));
    }
    
    public StuReg load(String greno)
    {
        StuReg student = em.find(StuReg.class, greno);
        return student;
    }
}
