<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
table {
	border-collapse: collapse;
}

th, td {
	padding: 10px;
}
</style>
</head>
<body>
	<h2>List of Cities: ${citiesAttribute}</h2>
	<table border="1">
		<tr>
			<th>Customer_Name</th>
			<th>Customer_ID</th>
			<th>Address</th>
		</tr>
		<c:forEach items="${customersAttribute}" var="customer">
			<tr>
				<td>${customer.getCustomerName()}</td>
				<td>${customer.getCustomerId()}</td>
				<td>${customer.getAddress()}</td>
			</tr>
		</c:forEach>

	</table>

</body>
</html>