<%-- 
    Document   : home
    Created on : 16-Oct-2021, 10:17:42 PM
    Author     : Daniel Wong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <div>
            <h1>Home Page</h1>
        </div>
        <div>
            <strong>Hello ${displayUser}.</strong>
        </div>
        <div>
            <a href="login?exit">Log Out</a>
        </div>
    </body>
</html>
