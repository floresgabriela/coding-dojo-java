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
	<h1>Edit Burger</h1>
<form:form action="/edit/${burger.id}" method="POST" modelAttribute="burger">
	<input type="hidden" name="_method" value="PUT">
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