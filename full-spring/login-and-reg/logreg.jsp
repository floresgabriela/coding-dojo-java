<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Book Club</title>
    <link rel="stylesheet" href="/css/style.css"> <!-- change to match your file/naming structure -->
</head>
<body>
   <div>
		<h1>Register</h1>
		<form:form action="/register" method="POST" modelAttribute="newUser">
		<div>
			<form:label path="userName">Name:</form:label><br>
			<form:input type="text" path="userName"/>
			<form:errors path="userName"/>
		</div>
		<div>
			<form:label path="email">Email:</form:label><br>
			<form:input type="text" path="email"/>
			<form:errors path="email"/>
		</div>
		<div>
			<form:label path="password">Password:</form:label><br>
			<form:input type="password" path="password"/>
			<form:errors path="password"/>
		</div>
		<div>
			<form:label path="confirm">Confirm Password:</form:label><br>
			<form:input type="password" path="confirm"/>
			<form:errors path="confirm"/>
		</div>
		<div>
			<button type="submit">Register</button>
		</div>
		</form:form>

		<h1>Login</h1>
		<form:form action="/login" method="POST" modelAttribute="newLogin">
			<div>
			<form:label path="email">Email:</form:label><br>
			<form:input type="text" path="email"/>
			<form:errors path="email"/>
		</div>
		<div>
			<form:label path="password">Password:</form:label><br>
			<form:input type="password" path="password"/>
			<form:errors path="password"/>
		</div>
		<div>
			<button type="submit">Register</button>
		</div>
		</form:form>

	</div>
</body>
</html>