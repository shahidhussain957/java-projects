<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.*" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Books</title>
<link rel ="stylesheet" type="text/css" href="Viewbook.css">
</head>
<body>
<div class="container">

<% 
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shahid","root","Shahid@123");
	Statement stmt = con.createStatement();
	ResultSet rs = stmt.executeQuery("select * from addbook");
%>

<h1>View Books</h1>
<table>
  <tr>
  	<th>Book Id</th>
    <th>Title</th>
    <th>Author</th>
    <th>Publisher</th>
    <th>ISBN</th>
    <th>Edition</th>
    <th>Publication Date</th>
    
<% while (rs.next()) { %>
  <tr>
  	 <td><%= rs.getString("book_id") %></td>
    <td><%= rs.getString("Book_title") %></td>
    <td><%= rs.getString("author") %></td>
    <td><%= rs.getString("publisher") %></td>
    <td><%= rs.getLong("isbn") %></td>
    <td><%= rs.getString("edition") %></td>
    <td><%= rs.getString("publication") %></td>
   
 
  </tr>
<% } %>

</table>
</div>
</body>
</html>
