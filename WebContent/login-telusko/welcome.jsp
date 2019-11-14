<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>

<%
	if(session.getAttribute("username") == null) {
		response.sendRedirect("login-telusko/login.jsp");
	}
%>
Welcome ${username}
<a href="video.jsp" />Video Page
</body>
</html>