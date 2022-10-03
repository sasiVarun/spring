<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Flow4</title>
<style>
	th,td{
		padding:8px;
	}
	table{
		border-collapse:collapse;
	}
</style>
</head>
<body>
	<table border="1">
		<tr>
			<th>Student_ID</th>
			<th>Student_Name</th>
			<th>Address</th>
			<th>Phone_Number</th>
		</tr>
		<c:forEach items="${studentsAttribute}" var="student">
			<tr>
				<td>${student.getStudentId()}</td>
				<td>${student.getStudentName()}</td>
				<td>${student.getAddress()}</td>
				<td>${student.getPhoneNumber()}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>