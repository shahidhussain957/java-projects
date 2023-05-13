

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

/**
 * Servlet implementation class UpdateMember
 */
@WebServlet("/UpdateMember")
public class UpdateMember extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String id = request.getParameter("id");
	    String name = request.getParameter("name");
	    String email = request.getParameter("email");
	    String phone = request.getParameter("phone");
	    

	    try {
	        Class.forName("com.mysql.jdbc.Driver");
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shahid", "root", "Shahid@123");
	        PreparedStatement pst = con.prepareStatement("UPDATE addmember SET name=?, email=?, phone=? WHERE id=?");

	        pst.setString(1, name);
	        pst.setString(2, email);
	        pst.setString(3, phone);
	        pst.setString(4, id);

	        int rs = pst.executeUpdate();
	        if (rs > 0) {
	            HttpSession session = request.getSession();
	            session.setAttribute("Status", "Success");
	            response.sendRedirect("Home.jsp");
	        } else {
	            HttpSession session = request.getSession();
	            session.setAttribute("Status", "Unsuccess");
	            response.sendRedirect("UpdateMember.jsp?id=" + id);
	        }
	    } catch (Exception e) {
	        e.getMessage();
	    }
	}
}
