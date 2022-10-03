<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registered</title>
</head>
<body>
<label>First Name: </label>${studentAttribute.getFirstName()}<br>
<label>Last Name: </label>${studentAttribute.getLastName()}<br>
<label>Age: </label>${studentAttribute.getAge()}<br>
<label>Course: </label>${studentAttribute.getCourse()}<br>
<label>Cities: </label>
<c:forEach items="${studentAttribute.getCities()}" var="city" varStatus="status">
<label>${city}</label> ${!status.last ? "," : ""}
</c:forEach>
</body>
</html>