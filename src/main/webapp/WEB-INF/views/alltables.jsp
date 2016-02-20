<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Informsystem</title>
    </head>
    <body>
        <h1>Chose table</h1>
        <form:form method="GET" commandName="employees">
            <form:select path="id">
                <form:option value="" label="-- Choose one--" />
                <form:options items="${employees}"/>
            </form:select>
               
        
      
            
        </form:form>
    </body>
</html>
