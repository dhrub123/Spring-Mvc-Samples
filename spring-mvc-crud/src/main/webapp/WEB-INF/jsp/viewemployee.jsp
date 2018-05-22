   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
   
   <h1>Employees List</h1>
   
   <table border="2" width="70%" cellpadding="2">
   	<tr>
   		<th>Id</th><th>Name</th><th>Salary</th><th>Designation</th>
   	</tr>
   	
   	<c:forEach var="employee" items="${list}">
   		<tr>
   			<td>${employee.id}</td>
   			<td>${employee.name}</td>
   			<td>${employee.salary}</td>
   			<td>${employee.designation}</td>
   			<td><a href="/spring-mvc-crud/editemp/${employee.id}">Edit</a></td>  
   			<td><a href="/spring-mvc-crud/deleteemp/${employee.id}">Delete</a></td>  
   		</tr>
   	</c:forEach>
   </table>
   
   <br/>  
   <a href="/spring-mvc-crud/viewemp/1">1</a>   
   <a href="/spring-mvc-crud/viewemp/2">2</a>   
   <a href="/spring-mvc-crud/viewemp/3">3</a>
   <a href="/spring-mvc-crud/viewemp/4">4</a>    
   <br/>
   <a href="/spring-mvc-crud/empform">Add New Employee</a>