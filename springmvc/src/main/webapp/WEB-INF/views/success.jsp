<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success Page</title>
</head>
<body>
<h1>${Header}</h1>
<h1 style="color:green">${msg}</h1>

<h1>Welcome,${user.username}</h1>
<h1>Your Email address is: ${user.email }</h1>
<h1>Your password is:${user.password} try to secure the password</h1>

</body>
</html>