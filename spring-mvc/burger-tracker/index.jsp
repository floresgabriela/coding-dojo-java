<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Burger Tracker</title>
</head>

<body>
<h1>Burger Tracker</h1>
	<table>
		<thead>
			<tr>
				<th>Burger Name</th>
				<th>Restaurant Name</th>
				<th>Rating (out of 5)</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="burger" items="${burgerList}">
			<tr>
				<td><c:out value="${burger.burgerName}" /></td>
				<td><c:out value="${burger.restaurant}" /></td>
				<td><c:out value="${burger.rating}" /></td>
				<td><a href="/burgers/${burger.id}">edit</a> | delete</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	
	<br>
<h2>Add a Burger:</h2>
<form:form action="/addBurger" method="POST" modelAttribute="burger">
	<div>
		<form:label path="burgerName">Burger Name:</form:label><br>
		<form:input path="burgerName"/>
		<form:errors path="burgerName"/>
	</div>
	<div>
		<form:label path="restaurant">Restaurant Name:</form:label><br>
		<form:input path="restaurant"/>
		<form:errors path="restaurant"/>
	</div>
	<div>
		<form:label path="rating">Rating:</form:label><br>
		<form:input path="rating"/>
		<form:errors path="rating"/>
	</div>
	<div>
		<form:label path="notes">Notes:</form:label><br>
		<form:textarea path="notes" rows="3"/>
		<form:errors path="notes"/>
	</div>
	<div>
		<input type="submit" value="Submit"/>
	</div>
</form:form>
</body>
</html>