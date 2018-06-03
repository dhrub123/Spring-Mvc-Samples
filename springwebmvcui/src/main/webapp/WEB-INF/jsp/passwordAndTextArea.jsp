<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>An Example of Password and Text Area</title>
</head>
<body>
	<form:form method="POST" modelAttribute="newstudent" action="/springwebmvcui/addNewStudent">
		<table>
			<tr>
				<td>Name</td>
				<td><form:input path="name"/></td>
			</tr>	
			<tr>
				<td>Password</td>
				<td><form:password path="password"/></td>
			</tr>
			<tr>
				<td>Address</td>
				<td><form:textarea path="address" rows="5" cols="30"/></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="submit"/>
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>