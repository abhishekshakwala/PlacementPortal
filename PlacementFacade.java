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
public class PlacementFacade extends AbstractFacade<Placement> {
    @PersistenceContext(unitName = "ShreeGanesh-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PlacementFacade() {
        super(Placement.class);
    }
    public void add(Placement p)
    {
    em.persist(p);
    }
    
    public Placement load(String username)
    {
       Placement p = em.find(Placement.class,username);
        return p;
    }
}
