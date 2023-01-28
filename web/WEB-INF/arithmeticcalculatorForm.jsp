<%-- 
    Document   : arithmeticcalculatorForm
    Created on : Jan 27, 2023, 8:33:28 AM
    Author     : Majid
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="post">
            First: <input type="text" name="firstnumber" value="${firstnumber}"><br>
            Second: <input type="text" name="secondnumber" value="${secondnumber}"><br>
            <input type="submit" name="operator" value="+">
            <input type="submit" name="operator" value="-">
            <input type="submit" name="operator" value="*">            
            <input type="submit" name="operator" value="%"><br>
            <br>            
        </form>
        Result: <a> ${result}</a><br>
        <a href="age" >Age Calculator</a>
    </body>
</html>
