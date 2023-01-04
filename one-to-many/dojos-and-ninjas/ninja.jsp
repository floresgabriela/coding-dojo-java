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
	<h1>Add a Ninja</h1>
	<form:form action="/addNinja" method="POST" modelAttribute="newNinja">
		<div>
			<form:label path="firstName">First Name:</form:label><br>
			<form:input path="firstName"/>
			<form:errors path="firstName"/>
		</div>
		<div>
			<form:label path="lastName">Last Name:</form:label><br>
			<form:input path="lastName"/>
			<form:errors path="lastName"/>
		</div>
		<div>
			<form:label path="age">Age:</form:label><br>
			<form:input path="age"/>
			<form:errors path="age"/>
		</div>
		<div>
			<form:label path="dojo">Dojo:</form:label><br>
			<form:select path="dojo">
				<c:forEach var="dojo" items="${dojoList}">
					<form:option value="${dojo.id}">${dojo.name}</form:option>
				</c:forEach>
			</form:select>
		</div>
		<div>
			<button type="submit">Submit</button>
		</div>
	</form:form>

</body>
</html>