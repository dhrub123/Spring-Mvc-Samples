<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HTML Elements</title>
</head>
<body>
<h1>This is an example of a text box</h1>

<form:form method="POST" modelAttribute="student" action="/springwebmvcui/addStudent">
	<table border="2" bordercolor="black">
		
		<tr>
			<td>Attribute</td>
			<td>Value</td>
		</tr>
		<tr>
			<td><form:label path="name">Name</form:label></td>
			<td><form:input path="name"></form:input></td>
		</tr>
		
		<tr>
			<td><form:label path="age">Age</form:label></td>
			<td><form:input path="age"></form:input></td>
		</tr>
		
		<tr>
			<td><form:label path="id">Id</form:label></td>
			<td><form:input path="id"></form:input></td>
		</tr>
		
		<tr>
			<td colspan="2">
				<input type="submit" value="submit">
			</td>
		</tr>
		
	</table>
</form:form>
</body>
</html>