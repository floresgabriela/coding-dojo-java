<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Omikuji</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>

	<h1>Send an Omikuji!</h1>
	
	<form action='/omikuji/submit' method="POST">
		<label>Pick any number from 5 to 25:</label>
		<input type="number" name="number" min="5" max="25">
		
		<label>Enter the name of any city:</label>
		<input type="text" name="city">
		
		<label>Enter the name of any real person:</label>
		<input type="text" name="person">
		
		<label>Enter professional endeavor or hobby:</label>
		<input type="text" name="hobby">
		
		<label>Enter any type of living thing:</label>
		<input type="text" name="thing">
		
		<label>Say something nice to someone:</label>
		<textarea name="nice"></textarea>
		
		<label>Send and show a friend</label>
		<button type="submit">Submit</button>
	</form>

</body>
</html>