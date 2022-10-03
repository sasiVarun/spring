<%@ page import="java.util.Date"%>
<html>
<body>
	<%
	Date sessionDate = (Date) session.getAttribute("date");
	Date requestDate = (Date) request.getAttribute("date");
	%>
	<h2>
		Date and Time from Session
		<%=sessionDate%></h2>
	<h2>
		Date and Time from Request
		<%=requestDate%></h2>
</body>
</html>
