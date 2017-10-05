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
public class TestFacade extends AbstractFacade<Test> {
    @PersistenceContext(unitName = "ShreeGanesh-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TestFacade() {
        super(Test.class);
    }
 public void persist(Test t)
    {
    em.persist(t);
    }
    
    public Test load(String qid)
    {
        Test t = em.find(Test.class,qid);
        return t;
    }
    
    public List retrieveTest(String compname)
    {
        Query q = em.createQuery("Select a from Aptitude a where a.compname = :Compname", Aptitude.class);
        q.setParameter("Compname", compname);
        return q.getResultList();
    }
    
    public List retrievePoints(String greno)
    {
        Query q = em.createQuery("Select t from Test t where t.greno = :Greno", Test.class);
        q.setParameter("Greno", greno);
        return q.getResultList();
    }    
}
