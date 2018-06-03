<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Radio Button</title>
</head>
<body>
	<form:form action="/springwebmvcui/radiobuttonresult" modelAttribute="student" method="POST">
		<table>
			<tr>
				<td><form:radiobutton path="gender" value="Male" label="M"></form:radiobutton></td>
				<td><form:radiobutton path="gender" value="Female" label="F"></form:radiobutton></td>
				<td><form:radiobutton path="gender" value="Trans" label="T"></form:radiobutton></td>
			</tr>
			
			<tr>
				<td><form:radiobuttons path="favouriteNumbers" items="${favouriteNumbersList}"></form:radiobuttons></td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="submit"/>
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>