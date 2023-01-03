<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Save Travels</title>
</head>
<body>
	<h1>Edit Expense</h1>
	<form:form action="/edit/${expense.id}" method="POST" modelAttribute="expense">
	<input type="hidden" name="_method" value="PUT">
	<div>
		<form:label path="name">Expense:</form:label><br>
		<form:input path="name"/>
		<form:errors path="name"/>
	</div>
	<div>
		<form:label path="vendor">Vendor:</form:label><br>
		<form:input path="vendor"/>
		<form:errors path="vendor"/>
	</div>
	<div>
		<form:label path="amount">Amount:</form:label><br>
		<form:input path="amount"/>
		<form:errors path="amount"/>
	</div>
	<div>
		<form:label path="description">Description:</form:label><br>
		<form:textarea path="description" rows="3"/>
		<form:errors path="description"/>
	</div>
	<div>
		<button type="submit">Submit</button>
	</div>
</form:form>
</body>
</html>