<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form</title>
</head>
<body>
	<form action="upload" method="post" enctype="multipart/form-data">
	
		<label> Upload file: <input type="file" name="file_name" /></label><br>
		
		<input type="submit" value="Upload" />
	</form>

</body>
</html>