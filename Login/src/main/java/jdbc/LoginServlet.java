package jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
  		try {
  			PrintWriter out = response.getWriter();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Shahid","root","Shahid@123");
			String n=request.getParameter("txtName");
			String p=request.getParameter("txtpwd");
			PreparedStatement ps=con.prepareStatement("select uname from login where uname=? and password=?");
			ps.setString(1,n);
			ps.setString(2,p);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				RequestDispatcher rd=request.getRequestDispatcher("Welcome.jsp");
				// requestDispatcher is used to 
				rd.forward(request, response);				
			}
			else
			{
				out.println("<font color=red size=18>Login Failed!!<br>");
				out.println("<a href=login.jsp>Try AGAIN!!</a>");
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
