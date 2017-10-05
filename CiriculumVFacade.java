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
public class CiriculumVFacade extends AbstractFacade<CiriculumV> {
    @PersistenceContext(unitName = "ShreeGanesh-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CiriculumVFacade() {
        super(CiriculumV.class);
    }
    
     public void persist(CiriculumV c) 
    {
      em.persist(c);  
    }

    
      public void delete(String greno)
    {
        em.remove(em.find(CiriculumV.class, greno));
    }
    
    public CiriculumV load(String greno)
    {
        CiriculumV c = em.find(CiriculumV.class, greno);
        return c;
    }
    
    public List retrieveStudent(Float Per10, Float Per12, Integer AptTest, Float cgpa, Float dipaggre)
    {
        Query q = em.createQuery("Select c from CiriculumV c where ((c.cgpa >= :CGPA and c.per10 >= :Per10 and c.per12 >= :Per12 and c.apttest >= :Apttest) or (c.dipaggre >= :Dipaggre and c.per10 >= :Per10 and c.cgpa >= :CGPA and c.apttest >= :Apttest))", CiriculumV.class);
        q.setParameter("CGPA",cgpa);
        q.setParameter("Dipaggre",dipaggre);
        q.setParameter("Per10",Per10);
        q.setParameter("Per12",Per12);
        q.setParameter("Apttest",AptTest);
        return q.getResultList();
    }
    
     public List retrievePlacedStudent(Float Per10, Float Per12, Integer AptTest, Float cgpa, Float dipaggre,String status)
    {
        Query q = em.createQuery("Select c from CiriculumV c where ((c.cgpa >= :CGPA and c.per10 >= :Per10 and c.per12 >= :Per12 and c.apttest >= :Apttest and c.status = :Status) or (c.dipaggre >= :Dipaggre and c.per10 >= :Per10 and c.cgpa >= :CGPA and c.apttest >= :Apttest and c.status = :Status))", CiriculumV.class);
        q.setParameter("CGPA",cgpa);
        q.setParameter("Dipaggre",dipaggre);
        q.setParameter("Per10",Per10);
        q.setParameter("Per12",Per12);
        q.setParameter("Apttest",AptTest);
        q.setParameter("Status",status);
        return q.getResultList();
    }
}
