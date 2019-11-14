<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://127.0.0.1:3306/hibernate" user="root" password="123456"/>
<sql:query var="resultSet" dataSource="${db}">select *from alien</sql:query>

<c:forEach items="${resultSet.rows}" var="alien">
   <c:out value="${alien.id}"></c:out>: <c:out value="${alien.color}"></c:out>: <c:out value="${alien.name}"></c:out>
</c:forEach>

<!-- Using functions in jsp -->
<c:set var="str" value="I m Nguyn Viet Quan"></c:set>
Length: ${fn:length(str)}

<c:forEach var="item" items="${fn:split(str,' ')}">
	<br><c:out value="${item}"></c:out>
</c:forEach>

<br> Index Of 'Viet': ${fn:indexOf(str,"Viet")}

</body>
</html>