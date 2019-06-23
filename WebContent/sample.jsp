<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
num1: <%=config.getInitParameter("num1") %>

<%=request.getLocalName() %>
<%=application.getServletContextName()%> <!-- context -->
<%out.print("HEHE"); %>
<%pageContext.setAttribute("name", "Quan", PageContext.SESSION_SCOPE); %>

<%=pageContext.getAttribute("name") %>

</body>
</html>