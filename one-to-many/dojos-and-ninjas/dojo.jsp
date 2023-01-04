<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojos and Ninjas</title>
</head>
<body>
	<h1>Create a Dojo</h1>
	<form:form action="/addDojo" method="POST" modelAttribute="newDojo">
		<div>
			<form:label path="name">Name:</form:label><br>
			<form:input path="name"/>
			<form:errors path="name"/>
		</div>
		<div>
			<button type="submit">Submit</button>
		</div>
	</form:form>

</body>
</html>