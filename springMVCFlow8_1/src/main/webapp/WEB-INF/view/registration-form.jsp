<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
	<form:form action="register" modelAttribute="employee">
		<table>
			<tr>
				<td><form:label path="firstName">Enter First Name:</form:label>
				</td>
				<td><form:input path="firstName" /></td>
			</tr>
			<tr>
				<td><form:label path="lastName">Enter Last Name:</form:label></td>
				<td><form:input path="lastName" /></td>
			</tr>
			<tr>
				<td><form:label path="dob">Enter Date of Birth:</form:label></td>
				<td><form:input type="date" path="dob" /></td>
			</tr>
			<tr>
				<td><form:label path="email">Enter Email-address:</form:label>
				</td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td><form:label path="gender">Gender:</form:label></td>
				<td><form:radiobutton path="gender" value="Male" label="Male"/> <form:radiobutton
						path="gender" value="Female" label="Female" /></td>
			</tr>
			<tr>
				<td><form:label path="education">Highest Education:</form:label>
				</td>
				<td><form:select path="education">
						<form:option value="Intermediate">Intermediate</form:option>
						<form:option value="Graduation">Graduation</form:option>
						<form:option value="Post-Graduation">Post-Graduation</form:option>
					</form:select></td>
			</tr>
			<tr>
				<td><form:label path="company">Current Company Name:</form:label>
				</td>
				<td><form:input path="company" /></td>
			</tr>
			<tr>
				<td><form:label path="jobType">Job Type:</form:label></td>
				<td><form:select path="jobType">
						<form:options items="${jobType}" />
					</form:select></td>
			</tr>
			<tr>
				<td><form:label path="years">Enter Years of Experience:</form:label>
				</td>
				<td><form:radiobuttons path="years" items="${experienceYears}"
						delimiter="  " /></td>
			</tr>
			<tr>
				<td><form:label path="skill">Programming Skills:</form:label></td>
				<td><form:checkboxes items="${skills}" path="skill" delimiter="  " />
				</td>
			</tr>
			<tr>
				<td><form:button>Submit</form:button></td>
			</tr>

		</table>

	</form:form>

</body>
</html>