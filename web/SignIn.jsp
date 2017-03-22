<%-- 
    Document   : signIn
    Created on : 22 mars 2017, 16:15:48
    Author     : Yoann & Matthew
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <form action="SignInControl" method="POST" >
                <input type="email" name="emailParam" required>Email<br>
                <br>
                <input type="password" name="passParam" required> PassWord<br>
                <input type="submit" value="submit">
            </form>
        </div>
    </body>
</html>