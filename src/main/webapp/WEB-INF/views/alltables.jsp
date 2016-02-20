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
        <h1>Choose table</h1>
        <form:form method="GET" commandName="tables">
        <select name="tableSelect">
        <option value="-">Choose a Table</option>
        <c:forEach items="${tables}" var="table">
                <option value=<c:out value="${table.name}"/>>
                    <c:out value="${table.name}"/>
                </option>
            </c:forEach>
        </select>
           
               
        
      
            
        </form:form>
    </body>
</html>
