<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home page</title>
</head>
<body>
<h1>This is Home page</h1>
<h2>Called by Home Controller</h2>
<%
	String name=(String)request.getAttribute("name");
	Integer id=(Integer)request.getAttribute("id");
	List<String> friends=(List<String>)request.getAttribute("dost");
	
%>
<h1> My name is: <%= name %></h1>
<h1> My id is: <%= id %></h1>
<h1>My friends are:</h1>
	<!-- Here displaying the name which were define in controller class -->
<%

		for(String s:friends){
		%>
		<h2> <%=s %></h2>
		<%
		}

%>
	

</body>
</html>