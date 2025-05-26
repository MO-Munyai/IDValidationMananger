<%-- 
    Document   : data_cap_menu
    Created on : May 26, 2025, 8:34:51 PM
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
        
        <p><a href="validate.jsp">Click Here To Validate ID</a></p>
    </body>
</html>
