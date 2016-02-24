<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Information System</title>

	<style>
		tr:first-child{
			font-weight: bold;
			background-color: #C6C9C4;
		}
	</style>

</head>


<body>
    <h2>List of <c:out value="${tableName}" /></h2>
    <c:url var="sort" value="/sort"/>
   <form:form method="POST" modelAtribute="worker" action="${sort}">
       <input type="hidden" name="tableName" value="${tableName}"> 
        <input type="submit" value="Sotr by"/>
        
        <select name="columnSelect">
        <c:forEach items="${records.get(0).getNamesOfColumn()}" var="column">
                <option value=<c:out value="${column}"/>>
                    <c:out value="${column}"/>
                </option>
            </c:forEach>
        </select>
   <input type="checkbox" name="ascending" checked="checked"/> askending
    </form:form>
	<table>
            <c:out value="${records.get(0).getNamesOfColumnForHTML()}" escapeXml="false"/>
            <c:forEach items="${records}" var="record">
                ${record.getRecordForHTML()}
            </c:forEach>
	</table>
	<br/>
	<a href="<c:url value='/new' />">Add new record</a>
</body>
</html>