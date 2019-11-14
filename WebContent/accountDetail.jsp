<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*" isELIgnored="false" errorPage="error.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Name: ${requestScope.employee.name}

<%=pageContext.findAttribute("add") %>

<%=pageContext.getAttribute("add", PageContext.APPLICATION_SCOPE) %>
${pageScope.add} 
${requestScope.add}
${applicationScope.add} </br>
session scope: ${sessionScope["add"]}

<%
	int k = 1/1;
%>

</br>UserName: <c:out value="${username}" />

<c:if test="${username}">
</br>UserName: <c:out value="${username}" />
</c:if>

<!-- forEach -->
</br>List of Employee: 
<c:forEach items="${listEmployee}" var="employee">
${employee.name} </br>
</c:forEach>

</body>
</html>