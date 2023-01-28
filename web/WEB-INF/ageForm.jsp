<%-- 
    Document   : age
    Created on : Jan 26, 2023, 10:24:45 PM
    Author     : Majid
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        
        <form action="age" method="post">
            Enter your age: <input type="text" name="age" value="${age}"><br>
            <input type="submit" value="Age next birthday"><br>
            <p>${message}.</p>
            <a href="arithmetic" >Arithmetic Calculator</a>
        </form>
    </body>
</html>
