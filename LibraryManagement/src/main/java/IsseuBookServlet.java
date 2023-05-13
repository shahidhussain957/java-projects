

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class IsseuBookServlet
 */
@WebServlet("/issue")
public class IsseuBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String bookName = request.getParameter("book");
		String studentName = request.getParameter("student");
		String date = request.getParameter("date");
		
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shahid","root","Shahid@123");
		
		// record added to the transaction table
		PreparedStatement pst1=con.prepareStatement("insert into transactions(mname, bname, return_date) values(?,?,?)");
		pst1.setString(1,studentName);
		pst1.setString(2, bookName);
		pst1.setString(3, date);
		int rs1 = pst1.executeUpdate();
		
		
		// availability of the book changes
		PreparedStatement pst2=con.prepareStatement("update addbook set availability='unavailable' where Book_title = ?");
		pst2.setString(1, bookName);
		int rs2 = pst2.executeUpdate();
		
		if(rs1>0 && rs2>0) {
			HttpSession session=request.getSession();
			session.setAttribute("Status", "Success");
			response.sendRedirect("Home.jsp");
		}
		else {
			PrintWriter out = response.getWriter();
			out.println(" Book not issued... Try Again! ");
		}
	
		}catch(Exception e) {
			e.getMessage();
		}
		

}
}
