import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname=request.getParameter("username");
		String pwd=request.getParameter("password");
		String email=request.getParameter("email");
		String cont=request.getParameter("contact");
		String user=request.getParameter("user");
		
					try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shahid","root","Shahid@123");
			PreparedStatement pst=null;
			pst=con.prepareStatement("insert into librarian(username,password,email,contact)values(?,?,?,?)");
			pst.setString(1,uname);
			pst.setString(2,pwd);
			pst.setString(3, email);
			pst.setString(4,cont);
			   int rs = pst.executeUpdate();
						if(rs>0) {
				
				response.sendRedirect("login.jsp");
			}else {
				
				response.sendRedirect("register.jsp");
			}
		}catch(Exception e) {
			e.printStackTrace();
			
		}
	}
}
