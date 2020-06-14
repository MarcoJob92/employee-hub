<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Employee List</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
	<div class="container">
	    <h2 class="hello-title">${employees.size()} employees founded!</h2>
		
		<table border="1">
		  <thead>
		    <tr>
		      <th>Code</th>
		      <th>First Name</th>
		      <th>Last Name</th>
		      <th>Department Name</th>
		    </tr>
		  </thead>
		  <tbody>
		     <c:forEach items="${employees}" var="employee">
		       <tr>
		         <td>${employee.getEmployeeCode()}</td>
		         <td>${employee.getFirstName()}</td>
		         <td>${employee.getLastName()}</td>
		         <td>${employee.getDepartment().getDepartmentName()}</td>
		         <td>
		         	<button>
		         		<a href="/employee?employeeCode=${employee.getEmployeeCode()}">
		         			View Employee
		         		</a>
		         	</button>
		         </td>
		       </tr>
		     </c:forEach>
		  </tbody>
		</table>
	</div>
</body>
</html>