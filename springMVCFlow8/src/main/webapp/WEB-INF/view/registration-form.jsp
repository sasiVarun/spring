<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
<style>
.space {
	margin: 10px;
}

 .p{
	float: left;
	padding-right : 10px;
}
</style>
</head>
<body>
	<h2>Cities: ${cities}</h2>
	<form:form action="register" modelAttribute="studentAttribute">
		<form:label path="firstName">Enter First Name</form:label>
		<form:input path="firstName" cssClass="space" />
		<form:errors path="firstName" cssStyle="color:red"/>
		<br>
		<form:label path="lastName">Enter Last Name</form:label>
		<form:input path="lastName" cssClass="space" />
		<br>
		<form:label path="age">Enter Age</form:label>
		<form:input path="age" cssClass="space" />
		<form:errors path="age" cssStyle="color:red"/>
		<br>
		<form:label path="course">Enter Course Details</form:label>
		<form:input path="course" cssClass="space" />
		<br>
		
		<form:label path="cities" cssClass="p">Select City</form:label>

		<form:select path="cities" multiple="true" >
			<form:options items="${cities}" />
		</form:select>
		<br>
		<input type="submit" value="Register"/>
	</form:form>

</body>
</html>