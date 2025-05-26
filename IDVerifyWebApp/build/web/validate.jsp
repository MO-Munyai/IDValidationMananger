<%-- 
    Document   : validate
    Created on : May 26, 2025, 9:10:28 PM
    Author     : mukon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            
            String name = (String)session.getAttribute("name");
            
        %>
        <h1>Hello <%=name%></h1>
        <form action="ValidateIDServlet.do" method="POST">
            <table>
                <tr>
                    <td>Enter ID Number:</td>
                    <td><input type="text" name="clientID"></td>
                </tr>
                <tr>                  
                    <td><input type="submit" name="verify"></td>
                </tr>
            </table>
        </form>
    
    </body>
</html>
