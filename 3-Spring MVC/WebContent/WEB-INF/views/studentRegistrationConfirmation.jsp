<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Confirmation</title>
</head>

<body>
	<h2>The student ${ student.name } ${ student.lastname } has been registered successfully</h2>
	
	<h3>The age of the student is ${ student.age }</h3>
	
	<h3>The email of the student is ${ student.email }</h3>
	
	<h3>The Postal Code of the student is ${ student.postalCode }</h3>
	
	<h3>The subject chosen is ${ student.optative }</h3>
</body>
</html>