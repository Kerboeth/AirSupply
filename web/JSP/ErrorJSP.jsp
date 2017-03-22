<%-- 
    Document   : errorJsp
    Created on : 22 mars 2017, 16:06:04
    Author     : Yoann & Matthew
    Purpose    : this is an erro message for the sign in screen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%if ( request.getAttribute("passError") != null){%>
        <h1>There is an error with your password</h1><br>
        <p><a href="signIn">Please return and re-enter it</a></p>
        <%}%>
        <%if ( request.getAttribute("emailError") != null){%>
            <h1>There is an error with your email</h1><br>
            <p>If you do not have an account please contact 
            the Airsupply Administrator at </p> 
        <%}%>
        
    </body>
</html>