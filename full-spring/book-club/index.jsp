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
		<h1> Welcome, <c:out value="${user.userName}" /></h1>
		<nav>
			<p><a href="/books/new">add a new book</a></p>
			<p><a href="/logout">logout</a></p>
		</nav>
	</header>
	<main>
		<h3>Books from everyone's shelves:</h3>
			<table>
				<thead>
					<tr>
						<th>ID</th>
						<th>Title</th>
						<th>Author</th>
						<th>Posted By</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="book" items="${bookList}">
						<tr>
							<td><c:out value="${book.id}" /></td>
							<td><a href="/books/${book.id}"><c:out value="${book.title}" /></a></td>
							<td><c:out value="${book.author}" /></td>
							<td><c:out value="${book.user.userName}" /></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
	</main>
</body>
</html>