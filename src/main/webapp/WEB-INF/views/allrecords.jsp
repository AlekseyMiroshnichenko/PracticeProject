<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Information System</title>

	<style>
		th {
                    font-weight: normal;
                    border-bottom: 2px solid #6678b1;
                    border-right: 30px solid #fff;
                    border-left: 30px solid #fff;
                    color: #039;
                    padding: 8px 2px;
                  }
                  td {
                    border-right: 30px solid #fff;
                    border-left: 30px solid #fff;
                    color: #669;
                    padding: 12px 2px;
                  }
	</style>

</head>


<body>
    <h2>List of <c:out value="${param.tableName}" /></h2>
    <c:url var="sort" value="/sort"/>
    <form:form method="GET" modelAtribute="worker" action="${sort}">
       <input type="hidden" name="tableName" value="${param.tableName}"> 
       <input type="submit" value="Sotr by"/>
       
       <div>
           <c:if test="${!records.isEmpty()}">
                <select name="firstColumnSelected">
                <c:forEach items="${printer.getColumnList()}" var="column">
                    <c:choose>
                        <c:when test="${column.equals(param.firstColumnSelected)}">
                            <option value=<c:out value="${column}"/> selected>
                                <c:out value="${column}"/>
                            </option>
                        </c:when>
                        <c:otherwise>
                            <option value=<c:out value="${column}"/>>
                                <c:out value="${column}"/>
                            </option>
                        </c:otherwise>
                    </c:choose> 
                </c:forEach>
                </select>
                
               <c:if test="${param.firstIsAsc.equals('on')}"><c:set var="firstChecked" value="checked"/></c:if>
               <input type="checkbox" name="firstIsAsc" <c:out value="${firstChecked}"/>/> askending</br>
                
                <select name="secondColumnSelected">
                <c:forEach items="${printer.getColumnList()}" var="column">
                    <c:choose>
                        <c:when test="${column.equals(param.secondColumnSelected)}">
                            <option value=<c:out value="${column}"/> selected>
                                <c:out value="${column}"/>
                            </option>
                        </c:when>
                        <c:otherwise>
                            <option value=<c:out value="${column}"/>>
                                <c:out value="${column}"/>
                            </option>
                        </c:otherwise>
                    </c:choose> 
                </c:forEach>
                </select>
                
                <c:if test="${param.secondIsAsc.equals('on')}"><c:set var="secondChecked" value="checked"/></c:if>
                <input type="checkbox" name="secondIsAsc" <c:out value="${secondChecked}"/>/> askending</br>
            </c:if>
        </div>
    </form:form>
       
	<table>
            <c:out value="${printer.getNamesOfColumnForHTML()}" escapeXml="false"/>
            <c:out value="${printer.getRecordForHTML()}" escapeXml="false"/>
	</table>
	<br/>
	<a href="<c:url value='/' />">Change table</a>
</body>
</html>