<%-- 
    Document   : data_cap_signin
    Created on : May 26, 2025, 8:44:01 PM
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
        <h1>Welcome To The data capturer sign in Page!</h1>
        <form action="StartDataSessionServlet.do" method="POST">
            <table>
                <tr>
                    <td>Enter your Name:</td>
                    <td><input type="text" name="user"></td>
                </tr>
                <tr>
                    <td>Enter your Employee ID:</td>
                    <td><input type="text" name="empID"></td>
                </tr>
                <tr>
                    <td><input type="submit" name="data_login"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
