<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
 <form action="${pageContext.request.contextPath}/loginCookies" method="post">
      <ul>
         <li>Username: <input type="text" name="username" value="default"/></li>
         <li>Password: <input type="password" name="password" value="default"/></li>
         <li><input type="submit" value="Login"/></li>
         <li>${pageContext.request.contextPath}</li>
      </ul>
 </form>
</body>
</html>