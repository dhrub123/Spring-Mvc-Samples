<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Student Data</title>
</head>
<body>
<table>
	<tr>
		<td>Name : </td>
		<td>${newstudent.name}</td>
	</tr>
	<tr>
		<td>Password : </td>
		<td>${newstudent.password}</td>
	</tr>
	<tr>
		<td>Current Address : </td>
		<td>${newstudent.address}</td>
	</tr>
</table>
<br/>
	<a href="differentElements">Back to Different Elements</a>
</body>
</html>