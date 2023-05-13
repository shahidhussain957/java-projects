<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AddBook</title>
<link rel ="stylesheet" type="text/css" href="Addbook.css">
</head>
<body>
<div class="container">
<h1>Add Book Here</h1>
<form action="Add" method="post">
		<label for="bookId">Book ID:</label>
   		 <input type="text" placeholder="Book ID" name="book_id"><br>    
		<label for="Book_title">Book Title:</label>
		<input type="text" name="Book_title" placeholder="Book Title" required><br>
		<label for="Author">Author:</label>
		<input type="text" name="author" placeholder="Author" required><br>
		<label for="publisher">Publisher:</label>
		<input type="text" name="publisher" placeholder="Publisher" required><br>
		<label for="isbn">ISBN:</label>
		<input type="text" name="isbn" placeholder="ISBN NO."required><br>
		<label for="edition">Edition:</label>
		<input type="text" name="edition" placeholder="Edition"required><br>
		<label for="pub_date">Publication Date:</label>
		<input type="text" name="publication"  placeholder="Publication Date"required><br>
		<input type="submit" value="AddBook">
</form>

</div>
</body>
</html>