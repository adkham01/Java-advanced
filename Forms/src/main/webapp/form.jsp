<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form</title>
</head>
<body>
	<form action=<%=request.getContextPath() %>/Controller method="post">
		Full name : <input type="text" name="name" required/><br /> 
		Gender : <input
			type="radio" name="gender" value="male" checked> Male <input
			type="radio" name="gender" value="female"> Female<br />
		Language : <br>
		<input type="checkbox" name="language" value="English">
		English<br /> <input type="checkbox" name="language" value="French">
		French<br /> <input type="checkbox" name="language" value="Uzbek">
		Uzbek<br /> Country : <select name="country">
			<option value="USA">USA</option>
			<option value="UK">United Kingdom</option>
			<option value="Poland">Poland</option>
			<option value="Germany">Germany</option>
		</select><br /> <input type="submit" value="Submit">
	</form>
</body>
</html>