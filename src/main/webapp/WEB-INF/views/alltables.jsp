<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Information system</title>
    <style>
        html, body {height:100%;}
        html {display:table; width:100%;}
        body {display:table-cell; text-align:center;}
    </style>
    </head>
    <body>
        <h3>Інформаційна системи автоматизації обліку дисципліни виконання</br>
            в підрозділах та окремими службовцями наказів та документообігу підприємства</h3>
        <h1>Виберіть таблицю</h1>
        <form:form method="POST" action="">
            <select name="table">
                <c:forEach items="${tables}" var="table">
                    <option value=<c:out value="${table}"/>>
                                <c:out value="${table}"/>
                    </option>
                </c:forEach>
            </select>
            <input type="submit" value="Вибрати"/>
        </form:form>        
    </body>
</html>
