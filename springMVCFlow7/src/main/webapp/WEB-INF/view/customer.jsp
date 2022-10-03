<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	table{
		border-collapse: collapse;
	}
	th,td{
		padding: 10px;
	}
</style>
</head>
<body>
<h2>Cities: ${citiesAttribute}</h2>
	<table border="1">
		<tr>
			<th>Customer_Name</th>
			<th>Customer_ID</th>
			<th>Address</th>
		</tr>
		<tr>
			<th>${customerName}</th>
			<th>${customerId}</th>
			<th>${address}</th>
		</tr>

	</table>
</body>
</html>