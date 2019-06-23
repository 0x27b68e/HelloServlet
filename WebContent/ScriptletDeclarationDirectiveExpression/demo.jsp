<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	int i = 1;
	out.print(i);
%>

<h2>Hello World</h2>

<%
	int j = 2;
	out.print(j);
%>

<%= j %>

</body>
</html>