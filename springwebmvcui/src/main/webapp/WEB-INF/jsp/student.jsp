<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Data</title>
</head>
<body>
	<table border="2" bordercolor="black">
		<tr>
			<td>Attribute</td>
			<td>Value</td>
		</tr>
		<tr>
			<td>Name : </td>
			<td>${student.name}</td>
		</tr>
		
		<tr>
			<td>Age : </td>
			<td>${student.age}</td>
		</tr>
		
		<tr>
			<td>Id : </td>
			<td>${student.id}</td>
		</tr>
	</table>
	
	<br/>
	<a href="differentElements">Back to Different Elements</a>
</body>
</html>