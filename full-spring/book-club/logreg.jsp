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
	<div id="header">
		<h1>Book Club</h1>
		<h3>A place for friends to share thoughts on books.</h3>
	</div>
<main class="container">
   <div id="left">
		<h1>Register</h1>
		<form:form action="/register" method="POST" modelAttribute="newUser" class="log">
		
			<form:label path="userName">Name:</form:label><br>
			<form:input type="text" path="userName"/>
			<form:errors path="userName"/>
		
			<form:label path="email">Email:</form:label><br>
			<form:input type="text" path="email"/>
			<form:errors path="email"/>
		
			<form:label path="password">Password:</form:label><br>
			<form:input type="password" path="password"/>
			<form:errors path="password"/>
		
			<form:label path="confirm">Confirm Password:</form:label><br>
			<form:input type="password" path="confirm"/>
			<form:errors path="confirm"/>
		
			<button type="submit">Register</button>
		
		</form:form>
	</div>
	<div id="right">
		<h1>Login</h1>
		<form:form class="log" action="/login" method="POST" modelAttribute="newLogin">
			
			<form:label path="email">Email:</form:label><br>
			<form:input type="text" path="email"/>
			<form:errors path="email"/>
		
			<form:label path="password">Password:</form:label><br>
			<form:input type="password" path="password"/>
			<form:errors path="password"/>
		
			<button type="submit">Login</button>
		
		</form:form>

	</div>
</main>
</body>
</html>