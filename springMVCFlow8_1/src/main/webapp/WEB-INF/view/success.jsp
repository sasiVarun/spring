<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Details Submitted.!</h3>
<table>
	<tr>
	<td>First Name: </td>
	<td>${employee.firstName}</td>
	<tr>
	<tr>
	<td>Last Name: </td>
	<td>${employee.lastName}</td>
	<tr>
	<tr>
	<td>Date of Birth: </td>
	<td>${employee.getDob()}</td>
	<tr>
	<tr>
	<td>Email-address:</td>
	<td>${employee.email}</td>
	<tr>
	<tr>
	<td>Gender: </td>
	<td>${employee.gender}</td>
	<tr>
	<tr>
	<td>Company: </td>
	<td>${employee.company}</td>
	<tr>
	<tr>
	<td>Job: </td>
	<td>${employee.job}</td>
	<tr>
	<tr>
	<td>Job Type: </td>
	<td>${employee.jobType}</td>
	<tr>
	<tr>
	<td>Years of Experience:</td>
	<td>${employee.years}</td>
	<tr>
	<tr>
	<td>Programming Skills</td>
	<td>${employee.skill}</td>
	<tr>
</table>

</body>
</html>