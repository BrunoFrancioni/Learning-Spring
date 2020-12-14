<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>

<body>
	<form:form action="processForm" modelAttribute="student">
		Name: <form:input path="name" />
		Lastname: <form:input path="lastname" />
		
		<input type="submit" value="Send" /> 
	</form:form>
</body>
</html>