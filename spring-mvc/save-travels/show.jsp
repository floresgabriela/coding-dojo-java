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
	<h1>Expense Details</h1>
	<p>Name: <c:out value="${expense.name}" /></p>
	<p>Vendor: <c:out value="${expense.vendor}" /></p>
	<p>Amount: <c:out value="${expense.amount}" /></p>
	<p>Description: <c:out value="${expense.description}" /></p>
</body>
</html>