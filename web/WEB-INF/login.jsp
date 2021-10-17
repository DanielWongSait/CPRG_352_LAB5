<%-- 
    Document   : login
    Created on : 16-Oct-2021, 10:17:36 PM
    Author     : Daniel Wong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <form method="POST" action="login">
            <div>
                <label>Username: </label>
                <input type="text" name="username" value="${username}">
            </div>
            <div>
                <label>Password: </label>
                <input type="text" name="password" value="${password}">
            </div>
            <div>
                <input type="submit" value="Log In">
            </div>
            <div>
                <c:if test="${getOut}">
                    <p>You have been logged out!</p>
                </c:if>
            </div>
            <div>
                <c:if test="${wrongCreds}">
                    <strong>*** Please enter valid username or password ***</strong>
                </c:if>
            </div>
        </form>
    </body>
</html>
