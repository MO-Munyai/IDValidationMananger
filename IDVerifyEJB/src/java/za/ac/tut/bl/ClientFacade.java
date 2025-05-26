/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.bl;

import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import za.ac.tut.entity.Client;

/**
 *
 * @author mukon
 */
@Stateless
public class ClientFacade extends AbstractFacade<Client> implements ClientFacadeLocal {

    @PersistenceContext(unitName = "IDVerifyEJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ClientFacade() {
        super(Client.class);
    }
    
    @RolesAllowed("manager")
    @Override
    public Long numbOfRecords(Integer empID) {
        String queryStr = "Select count(c) From Client c Where c.empID =?1"; 
        Query query = em.createQuery(queryStr);
        query.setParameter(1, empID);
        Long count = (Long)query.getSingleResult();
        return count;
    }
    
}
