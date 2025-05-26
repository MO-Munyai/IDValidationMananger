/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.bl.ClientFacadeLocal;
import za.ac.tut.entity.Client;

/**
 *
 * @author mukon
 */
public class ValidateIDServlet extends HttpServlet {
    
    @EJB
    private ClientFacadeLocal cfl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        String name = (String)session.getAttribute("name"); 
        Integer empID = (Integer)session.getAttribute("empID");
        Long clientID = Long.parseLong(request.getParameter("clientID"));
        
        boolean valid = Valid(clientID);
        Client client = createClient(name, empID, clientID);
        
        if(valid=true){
            cfl.create(client);
            RequestDispatcher disp = request.getRequestDispatcher("validate_output.jsp");
            disp.forward(request, response);
        }else{
            RequestDispatcher disp = request.getRequestDispatcher("validate_error_output.jsp");
            disp.forward(request, response);
        }
        
    }
    
    private boolean Valid(Long clientID){
    boolean valid = false;  
    String id = Long.toString(clientID);
    Integer sum =0;
    if(id.length()==13){
        for(int x =0; x<id.length();x++){
             int digit = Character.getNumericValue(id.charAt(x));

            // Positions are 1-based in description, so even index means odd position
            if ((x + 1) % 2 == 0) { // Even position
                digit *= 2;
                if (digit > 9) {
                    digit = digit % 9; // or digit -= 9;
                }
            }

            sum += digit;
        
        }
        if((sum%10)==0){
            valid = true;
        }else{valid=false;}
        
    }else{valid=false;}
    
    return valid;
    }
    
    private Client createClient(String name,Integer empID,Long clientID){
        Client c = new Client();
        c.setName(name);
        c.setEmpID(empID);
        c.setClientID(clientID);
        c.setCreatedAt(new Date());
        return c;
    }
}
