<%-- 
    Document   : login
    Created on : May 26, 2025, 6:55:23 PM
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
        <h1>Welcome To The Login Page!</h1>
        <form action="j_security_check" method="POST">
            <table>
                <tr>
                    <td>Enter your Name:</td>
                    <td><input type="text" name="j_username"></td>
                </tr>
                <tr>
                    <td>Enter your Password :</td>
                    <td><input type="text" name="j_password"></td>
                </tr>
                <tr>
                    <td><input type="submit" name="login"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
