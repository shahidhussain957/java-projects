<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help Page</title>
</head>
<body>
	<%
	String name=(String)request.getAttribute("name");
	Integer roll_no=(Integer)request.getAttribute("roll_no");
	%>
<h1> This is Help Page</h1>
<h2>The name of person is:
	<%=name %>
</h2>
<h2> And roll number is:
<%=roll_no %>
</h2>
<h2>
	The name of the Student is:${student}
	<!-- Here using jsp expression Language -->
</h2>	The marks of students are:
		<c:forEach var="item" items="${marks}">
		<h2>${item }</h2>
		</c:forEach>

</body>
</html>