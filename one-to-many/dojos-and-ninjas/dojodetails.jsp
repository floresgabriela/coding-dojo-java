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
	<h1>${dojo.name} LocationNinjas</h1>
	<table>
		<thead>
			<tr>
				<th>First Name:</th>
				<th>Last Name:</th>
				<th>Age:</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="ninja" items="${dojo.ninjas}">
				<tr>
					<td>${ninja.firstName}</td>
					<td>${ninja.lastName}</td>
					<td>${ninja.age}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>