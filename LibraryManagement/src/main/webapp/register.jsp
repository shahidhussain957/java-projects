<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<link rel="stylesheet" type="text/css" href="register.css">
</head>
<body>
<div class="container">
		<h1>Registration Form</h1>
		<form method="post" action="register">
			<label for="username">User Name:</label>
			<input type="text" id="username" name="username" required><br>
			<label for="password">Password:</label>
			<input type="password" id="password" name="password" required><br>
			<label for="confirm_password">Confirm Password:</label>
			<input type="password" id="confirm_password" name="confirm_password" pattern="[a-zA-Z0-9]+$"required><br>
			<label for="email">Email:</label>
			<input type="text" id="email" name="email" required><br>
			<label for="contact">Contact:</label>
			<input type="text" id="contact" placeholder="contact" name="contact"><br>
			<input type="submit" value="Register">
		</form>
		</div>
</body>
</html>