<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Account Result</title>
</head>
<body>
	<%
		String username = (String)request.getParameter("username");
	    String password = (String)request.getParameter("password");
	    out.print("username:" + username);
	    out.print("password:" + password);
	%>
</body>
</html>