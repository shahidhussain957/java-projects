<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<!-- remove_book.jsp -->
<html>
<head>
  <title>Remove Book</title>
  <link rel="stylesheet" type="text/css" href="Remove.css">
</head>
<body>
<!-- remove_book_handler.jsp -->

  <div class="container">
    <h1>Remove Book</h1>
    <form method="post" action="Book">
    <label for="isbn">ISBN:</label>
      <input type="text" name="isbn" placeholder="ISBN No."id="isbn">
      <br>
      <label for="title">Title:</label>
      <input type="text" name="Book_title" placeholder="Title of Book" id="title" required>
      <br>
      <label for="author">Author:</label>
      <input type="text" name="author" placeholder="Author"id="author">
      <br>
      
      <input type="submit" value="Remove Book">
    </form>
  </div>
</body>
</html>
