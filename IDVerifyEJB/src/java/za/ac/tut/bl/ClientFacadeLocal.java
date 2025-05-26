/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entity.Client;

/**
 *
 * @author mukon
 */
@Local
public interface ClientFacadeLocal {
    //create rec
    void create(Client client);
    
    //get all verified id
    List<Client> findAll();
    
    //find count all records by specific empID
    Long numbOfRecords(Integer empID);
   
    
}
