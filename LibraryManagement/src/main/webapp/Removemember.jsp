<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Remove Member</title>
	<link rel="stylesheet" type="text/css" href="removemember.css">
</head>
<body>

	<div class="container">
		<h1>Remove Member:</h1>
		<form action="Remove" method="post">
			<label for="id">Member ID:</label>
			<input type="text" id="id" name="id" required><br><br>
		
			<input type="submit" value="Remove">
		</form>
	</div>

</body>
</html>
