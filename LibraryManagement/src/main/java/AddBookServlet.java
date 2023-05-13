

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Add")
public class AddBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title=request.getParameter("Book_title");
		String Author=request.getParameter("author");
		String Publsr=request.getParameter("publisher");
		String Isbn=request.getParameter("isbn");
		String Edition=request.getParameter("edition");
		String date=request.getParameter("publication");
		String id=request.getParameter("book_id");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shahid","root","Shahid@123");
			PreparedStatement pst=con.prepareStatement("insert into addbook(Book_title,author,publisher,isbn,edition,publication,book_id) values(?,?,?,?,?,?,?)");
			pst.setString(1,title);
			pst.setString(2,Author);
			pst.setString(3,Publsr);
			pst.setString(4,Isbn);
			pst.setString(5,Edition);
			pst.setString(6,date);
			pst.setString(7, id);
			int rs=pst.executeUpdate();
			if(rs>0) {
				HttpSession session=request.getSession();
				session.setAttribute("Status", "Success");
				response.sendRedirect("Home.jsp");
			}
			else {
				HttpSession session=request.getSession();
				session.setAttribute("Status", "Unsuccess");
				response.sendRedirect("Addbook.jsp");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
