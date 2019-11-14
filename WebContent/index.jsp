<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
</head>
<body>
<%@ include file="header.jsp" %>

<!-- demo jsp:param -->
<jsp:include page="header.jsp">
	<jsp:param value="6 btc" name="result"/>
</jsp:include>
	<a href="sample.jsp">Sample Page....</a><br />
	<a href="AccountInfomation">Account Page......</a>
</body>
</html>