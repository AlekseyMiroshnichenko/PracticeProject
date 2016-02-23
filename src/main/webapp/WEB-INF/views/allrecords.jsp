<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	<table>
            <c:out value="${records.get(0). getNamesOfColumnForHTML()}" escapeXml="false"/>
            <c:forEach items="${records}" var="record">
                ${record.getRecordForHTML()}
            </c:forEach>
	</table>
	<br/>
	<a href="<c:url value='/new' />">Add new record</a>
</body>
</html>