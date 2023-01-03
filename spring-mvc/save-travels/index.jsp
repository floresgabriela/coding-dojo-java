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
	<h1>Save Travels</h1>
	<table>
		<thead>
			<tr>
				<th>Expense</th>
				<th>Vendor</th>
				<th>Amount</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="expense" items="${expenses}">
			<tr>
				<td><a href="/expense/${expense.id}"><c:out value="${expense.name}" /></a></td>
				<td><c:out value="${expense.vendor}" /></td>
				<td><c:out value="${expense.amount}" /></td>
				<td><a href="/expenses/${expense.id}">edit</a> | 
					<form action="/expense/delete/${expense.id}" method="post">
					<input type="hidden" name="_method" value="delete">
						<button type="submit">Delete</button>
					</form>
				</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	
	<br>
	<h2>Add an Expense:</h2>
	<form:form action="/add" method="POST" modelAttribute="expense">
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