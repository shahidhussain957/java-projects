<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel ="stylesheet" type="text/css" href="Issue.css">
</head>
<body>

	<% 
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shahid","root","Shahid@123");
	Statement stmt = con.createStatement();
	ResultSet rs1 = stmt.executeQuery("select * from addbook where availability='available' ");
	
%>
	<form method="post" action="issue">
		<label for=book> Book: </label>
		<select  name="book">
      		<% while (rs1.next()) { %>
      		<option value="<%= rs1.getString("Book_title") %>"> <%= rs1.getString("Book_title") %> </option>
      		<% } %>
      	</select>
<%
    rs1.close();
    ResultSet rs2 = stmt.executeQuery("select * from addmember");
%>
		<label for=student> Student: </label>
		<select  name="student">
      		<% while (rs2.next()) { %>
      		<option value="<%= rs2.getString("name") %>"> <%= rs2.getString("name") %> </option>
      		<% } %>
      	</select>
      	
      	<label for="date"> Book Return Date:</label>
		<input type="date" id="date" name="date">
      	
		
		<button type="submit"> Request Book </button>
	</form>
<%
    rs2.close();
    stmt.close();
    con.close();
%>



</body>
</html>