<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Library Management System</title>
<meta http-equiv="Cache-Control" content="no-cache, no-store, must-revalidate">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Expires" content="0">

<link rel="stylesheet" type="text/css" href="home.css">
</head>
<body>
<%
//this thing is used to restrict back to the previous page for security reason
response.setHeader("cache-control","no-cache,no-store,must-revalidate");//HTTP 1.1
response.setHeader("Pragma","no-cache");//http 1.0
response.setHeader("Expires","0");//Proxies


%>
 <header>
 	
 
<nav class="navbar">
<ul>
	<li><img src="image/logo1.png" alt="Library Logo" class="logo"></li>
	<li><a href="#">Home</a></li>
		
	<%
	String userType = (String) session.getAttribute("type");
		
	if ("librarian".equals(userType)) {
    	// Render the librarian-specific content
    
    %>
    	
        <li><a href="Addbook.jsp">Add Book</a></li>
        <li><a href="UpdateBook.jsp">Update Books</a></li>
        <li><a href="RemoveBook.jsp">Remove Books</a></li>
    	<li><a href="ViewBook.jsp">View Books</a></li>    	
     	<li><a href="IssueBook.jsp">Issue Books</a></li>
     	<li><a href="#">Member Actions</a>
        	<ul>
            	<li><a href="AddMember.jsp">Add Member</a></li>
            	<li><a href="UpdateMember.jsp">Update Member</a></li>
            	<li><a href="Removemember.jsp">Remove Member</a></li>
            	
        	</ul>
    	</li>
     	<li><a href="LogoutServlet">Logout</a></li>
    <%
    } else {
    %>
      	
      	<li><a href="register.jsp">Registration</a></li>
		<li><a href="login.jsp">Login</a></li>
      	
    <%
    }
    %>
</ul>
</nav>
 </header>



<section>
	  <h1>Welcome to the Library Management System</h1>
  <p>Our system allows you to easily manage books and members of your library. If you are a librarian, you can use the links above to add, update, or remove books from your collection, view your books, issue books to members, and manage members. If you are a member of the library, you can register or login using the links above to access the library's resources.</p>
  <p>Thank you for choosing our system for your library management needs!</p>

</section>
<section>
  <h2>About Us</h2>
  <p>The Library Management System is a web-based application designed to simplify the process of managing books and members in a library. Our system provides librarians with an easy-to-use interface for adding, updating, and removing books, as well as managing members and issuing books to them. Members of the library can also use our system to register for membership and access the library's resources.</p>
  <p>We strive to provide the best possible user experience for our customers, and are constantly improving our system based on feedback and suggestions from librarians and members.</p>
</section>
<section>
  <h2>Contact Us</h2>
  <p>If you have any questions, comments, or suggestions for the Library Management System, please feel free to contact us using the information below:</p>
  <ul>
    <li>Phone: 8510820096 LIBRARY</li>
    <li>Email: shahidhusdain8520820096@gmail.com</li>
    <li>Address: Noida Gautam Budhha Nagaer</li>
  </ul>
</section>
<section>
  <h2>Library Hours</h2>
  <p>Our library is open seven days a week, with the following hours:</p>
  <ul>
    <li>Monday - Friday: 9am - 6pm</li>
    <li>Saturday: 10am - 5pm</li>
    <li>Sunday: 12pm - 4pm</li>
  </ul>
  <p>Please note that the library is closed on holidays.</p>
</section>
<footer>
  <p>© 2023 Library Management System. All rights reserved.</p>
  <ul>
    <li><a href="privacy.jsp">Privacy Policy</a></li>
    <li><a href="terms.jsp">Terms of Use</a></li>
  </ul>
</footer>
</body>
</html>