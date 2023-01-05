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
   <header>
	   	<h1>Add a Book to Your Shelf!</h1>
	   	<p><a href="/books">back to the shelves</a></p>
   </header>
   <main>
		<form:form class="log" action="/addBook" method="POST" modelAttribute="newBook">
		<div>
			<form:label path="title">Title:</form:label><br>
			<form:input path="title" type="text"/>
			<form:errors path="title"/>
		</div>
		<div>
			<form:label path="author">Author:</form:label><br>
			<form:input path="author" type="text"/>
			<form:errors path="author"/>
		</div>
		<div>
			<form:label path="thoughts">Thoughts:</form:label><br>
			<form:input path="thoughts" type="text"/>
			<form:errors path="thoughts"/>
		</div>
			<form:hidden path="user" value="${userId}" />
		<div>
			<button type="submit">Submit</button>
		</div>
	</form:form>
   </main>
</body>
</html>