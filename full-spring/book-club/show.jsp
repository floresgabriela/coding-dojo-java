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
	   	<h1>${book.title}</h1>
	   	<p><a href="/books">back to the shelves</a></p>
   </header>
   <main>
	   <h3>${book.user.userName} read ${book.title} by ${book.author}</h3>
	   <p>Here are ${book.user.userName}'s thoughts:</p>
	   <p>${book.thoughts}</p>
	   <c:if test="${book.user.id.equals(userId)}">
		   <div class="links">
			   <a href="/books/edit/${book.id}"><button type="submit">Edit</button></a>
			   <form action="/books/delete/${book.id}" method="post">
				   <input type="hidden" name="_method" value="delete">
				   <button type="submit">Delete</button>
			   </form>
		   </div>
	   </c:if>
   </main>
</body>
</html>