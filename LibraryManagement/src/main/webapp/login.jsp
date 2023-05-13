<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<link rel="stylesheet" type="text/css" href="login.css">
</head>
<body>
 <div class="container">
    <form action="login" method='post'>
      <h1>Login</h1>
      <label for="username">User Name:</label>
      <input type="text" id="username" name="username" placeholder="Enter username"><br>
      <label for="password">Password:</label>
      <input type="password" id="password" name="password" placeholder="Enter password"><br>
      
      <button type="submit">Login</button>
    </form>
    </div>
</body>
</html>