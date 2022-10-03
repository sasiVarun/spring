<%@ page isELIgnored="false"%>
<html>
<head>
<title>Flow2</title>
</head>
<body>
	<table border="1" style="border-collapse:collapse">
		<tr>
			<th style="padding:5px">Order_ID</th>
			<th style="padding:5px">Order_Details</th>
			<th style="padding:5px">Customer_Id</th>
		</tr>
		<tr>
			<td style="padding:5px">${orderId}</td>
			<td style="padding:5px">${orderDetails}</td>
			<td style="padding:5px">${customerId}</td>
		</tr>
	</table>
</body>

</html>