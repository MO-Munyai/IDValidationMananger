/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author mukon
 */
public class StartDataSessionServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession(true);
        String name = request.getParameter("user");
        Integer empID = Integer.parseInt(request.getParameter("empID"));
        
        session.setAttribute("name", name);
        session.setAttribute("empID", empID);
        RequestDispatcher disp = request.getRequestDispatcher("data_cap_menu.jsp");
        disp.forward(request, response);
    }

    

}
