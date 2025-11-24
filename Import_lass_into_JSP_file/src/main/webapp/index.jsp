<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<h2>It is a home page</h2>
<br/>
<hr/>
<a href="<%= request.getContextPath() %>/Test?page=login">Login</a><br/>
<a href="<%= request.getContextPath() %>/Test?page=signup">Sign Up</a><br/>
<a href="<%= request.getContextPath() %>/Test?page=about">About</a> 
</body>
</html>
