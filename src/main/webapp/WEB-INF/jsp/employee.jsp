<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Employee Page</title>
	<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<div class="container">
		<h1>Employee Info</h1>
		<div class="employee">
			<div>
				<label>Code: </label>
				<b>${employee.getEmployeeCode()}</b>
			</div>
			<div>
				<label>First Name: </label>
				<b>${employee.getFirstName()}</b>
			</div>
			<div>
				<label>Last Name: </label>
				<b>${employee.getLastName()}</b>
			</div>
			<div>
				<label>Gender: </label>
				<b>${employee.getGender()}</b>
			</div>
			<div>
				<label>Date of Birth: </label>
				<b>${employee.getDob()}</b>
			</div>
			<div>
				<label>Email: </label>
				<b>${employee.getEmail()}</b>
			</div>
			<div>
				<label>Contact Number: </label>
				<b>${employee.getContactNumber()}</b>
			</div>
		</div>
		
		<div>Addresses</div>
	  
	  	<table border="1">
		  <thead>
		    <tr>
		      <th>1st Address Line</th>
		      <th>2st Address Line</th>
		      <th>Town</th>
		      <th>Post Code</th>
		      <th>Country</th>
		      <th>Current</th>
		    </tr>
		  </thead>
		  <tbody>
		     <c:forEach items="${addresses}" var="address">
		       <tr>
		         <td>${address.getAddressLine1()}</td>
		         <td>${address.getAddressLine2()}</td>
		         <td>${address.getTown()}</td>
		         <td>${address.getPostcode()}</td>
		         <td>${address.getCountry()}</td>
		         <td>
		         	${address.getIsCurrent() ? "YES" : "NO"}
		         </td>
		       </tr>
		     </c:forEach>
		  </tbody>
		</table>
	</div>
</body>
</html>