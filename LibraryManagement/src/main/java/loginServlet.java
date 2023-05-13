

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/login")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname=request.getParameter("username");
		String pwd=request.getParameter("password");	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shahid","root","Shahid@123");
			PreparedStatement pst = null;
			
			pst= con.prepareStatement("select * from librarian where username=? and password=?");
			  
			
			pst.setString(1,uname);
			pst.setString(2,pwd);			
			ResultSet rs=pst.executeQuery();
				
//			System.out.println("ResultSet : " + rs.next());
			if( rs.next())
			{
				HttpSession session = request.getSession();
				
				session.setAttribute("type","librarian");
				
				response.sendRedirect("Home.jsp");				
			}
			else
			{
				response.sendRedirect("login.jsp");
			}
			
}catch(Exception e) {
	e.getMessage();
}
	}
	}
