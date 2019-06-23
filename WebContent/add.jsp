<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="add" method="post">
	Inter number 1: <input type="text" name="number1"><br />
	Inter number 2: <input type="text" name="number2"><br />
	<input type="submit" value="Add">
</form>

num1: <%=config.getInitParameter("num1") %>
</body>
</html>