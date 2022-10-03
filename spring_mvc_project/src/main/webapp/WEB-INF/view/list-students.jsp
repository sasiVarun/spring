<%@page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>List Students</title>
	
	<!-- reference our style sheet -->

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>Student Data Application Form</h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		
			<!-- put new button: Add Student -->
		
			<input type="button" value="Add Student"
				   onclick="window.location.href='showFormForAdd'; return false;"
				   class="add-button"
			/>
		
			<!--  add our html table here -->
		
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Action</th>
				</tr>
				
				<!-- loop over and print our students -->
				<c:forEach var="student" items="${students}">
				
					<!-- construct an "update" link with student id -->
					<c:url var="updateLink" value="/student/showFormForUpdate">
						<c:param name="studentId" value="${student.id}" />
					</c:url>					

					<!-- construct an "delete" link with student id -->
					<c:url var="deleteLink" value="/student/delete">
						<c:param name="studentId" value="${student.id}" />
					</c:url>					
					
					<tr>
						<td> ${student.firstName} </td>
						<td> ${student.lastName} </td>
						<td> ${student.email} </td>
						
						<td>
							<!-- display the update link -->
							<a href="${updateLink}">Update</a>
							|
							<a href="${deleteLink}"
							   onclick="if (!(confirm('Are you sure you want to delete this student?'))) return false">Delete</a>
						</td>
						
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
	

</body>

</html>









