<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Member Registration Form</title>
	<link rel="stylesheet" type="text/css" href="AddMember.css">
</head>
<body>

	<div class="container">
		<h1>Add Members:</h1>
		<form action="lap" method="post">
			<label for="id">Member ID:</label>
			<input type="text" id="id" name="id" required><br><br>
			<label for="name">Member Name:</label>
			<input type="text" id="name" name="name" required><br><br>		
			<label for="email">Email:</label>
			<input type="email" id="email" name="email" required><br><br>
			<label for="phone">Phone Number:</label>
			<input type="tel" id="phone" name="phone" required><br><br>
			
			<input type="submit" value="Register">
		</form>
	</div>

</body>
</html>
