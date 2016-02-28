<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Information System</title>

	<style>
            html, body {height:100%;}
            html {display:table; width:100%;}
            body {display:table-cell; text-align:center;}
            table {
                width: 900px; 
                border: 1px solid #6678b1; 
                margin: auto; 
             }
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
             a {
                display: inline-block; /* преобразование ссылок во встроенные блоки */
                color: #6678b1; /* цвет ссылок */
                font-weight: bold; /* жирность шрифта */
                text-decoration: none; /* отмена подчеркивания */
                border: 2px #6678b1 solid; /* стили рамки */
                padding: 5px 10px; /* внутренние отступы */
               }
            a:hover {
                border: 2px #f00 solid; /* стили рамки ссылок под курсором мыши */
            }
	</style>

</head>


<body>
    <h2>Таблиця <c:out value="${param.tableName}" /></h2>
    <a href="<c:url value='/' />">Змінити таблицю</a></br></br> 
    <c:url var="sort" value="/sort"/>
    <form:form method="GET" modelAtribute="worker" action="${sort}">
       <input type="hidden" name="tableName" value="${param.tableName}"> 
       
       
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
                
               <c:if test="${not empty param.firstIsAsc}"><c:set var="firstChecked" value="checked"/></c:if>
              
               <input type="checkbox" name="firstIsAsc" <c:out value="${firstChecked}"/>/> зростання</br>
                
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
                
                <c:if test="${not empty param.secondIsAsc}"><c:set var="secondChecked" value="checked"/></c:if>
                <input type="checkbox" name="secondIsAsc" <c:out value="${secondChecked}"/>/> зростання</br>
            </c:if>
        </div><br/>
        <input type="submit" value="Сортувати"/>
    </form:form>
	<table>
            <c:out value="${printer.getNamesOfColumnForHTML()}" escapeXml="false"/>
            <c:out value="${printer.getRecordForHTML()}" escapeXml="false"/>
	</table>
	
        
	
</body>
</html>