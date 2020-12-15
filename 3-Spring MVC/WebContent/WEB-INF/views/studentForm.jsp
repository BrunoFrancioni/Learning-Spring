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
		Name: <form:input path="name" /><br/>
		<form:errors path="name" /><br/>
		
		Lastname: <form:input path="lastname" /><br/>
		<form:errors path="lastname" /><br/>
		
		Age: <form:input path="age" /><br/>
		<form:errors path="age" /><br/>
		
		Email: <form:input path="email" /><br/>
		<form:errors path="email" /><br/>
		
		Postal Code: <form:input path="postalCode" /><br/>
		<form:errors path="postalCode" /><br/>
		
		Optatives Subjects:<br/>
		
		<form:select path="optative">
			<form:option value="Design" label="Design" />
			<form:option value="Commerce" label="Commerce" />
			<form:option value="Karate" label="Karate" />
		</form:select> 
		
		<br/>
		
		<input type="submit" value="Send" /> 
	</form:form>
</body>
</html>