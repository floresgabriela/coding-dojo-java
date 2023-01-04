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
<h1>Dojos and Ninjas</h1>
	<a href="/dojos/new">Create a New Dojo</a>
	<a href="ninjas/new">Create a New Ninja</a>
	<table>
		<thead>
			<tr>
				<th>Dojo Name</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="dojo" items="${dojos}">
				<tr>
					<td><a href="/dojo/${dojo.id}"><c:out value="${dojo.name}"/></a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>