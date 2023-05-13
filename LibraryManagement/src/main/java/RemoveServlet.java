

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Book")
public class RemoveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  // Get the book details submitted by the user
		String title=request.getParameter("Book_title");
		String Author=request.getParameter("author");
		String Isbn=request.getParameter("isbn");
  
  // Create a connection to the database
  try {
  Class.forName("com.mysql.cj.jdbc.Driver");
  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/shahid", "root", "Shahid@123");
  
  // Find the book record in the database and delete it
  String sql = "DELETE FROM addbook WHERE Book_title=? AND author=? AND isbn=?";
  PreparedStatement stmt = conn.prepareStatement(sql);
  stmt.setString(1, title);
  stmt.setString(2, Author);
  stmt.setString(3, Isbn);
  
  PrintWriter out = response.getWriter();
int rs = stmt.executeUpdate();
  
  // Display a confirmation message to the user
if(rs>0) {
	
	response.sendRedirect("Home.jsp");
}else {
	
	response.sendRedirect("RemoveBook.jsp");
}

  }catch(Exception e) {
	  e.printStackTrace();
  }

	}

}
