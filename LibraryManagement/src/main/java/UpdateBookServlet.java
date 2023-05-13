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

@WebServlet("/jdb")
public class UpdateBookServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Get the book details submitted by the user
        String book_id = request.getParameter("book_id");
        String title = request.getParameter("Book_title");
        String author = request.getParameter("author");
        String publisher = request.getParameter("publisher");
        String isbn = request.getParameter("isbn");
        String edition = request.getParameter("edition");
        String publication = request.getParameter("publication");

        // Create a connection to the database
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/shahid", "root", "Shahid@123");

            // Update the book record in the database
            String sql = "UPDATE addbook SET Book_title=?, author=?, publisher=?, isbn=?, edition=?, publication=? WHERE book_id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, title);
            stmt.setString(2, author);
            stmt.setString(3, publisher);
            stmt.setString(4, isbn);
            stmt.setString(5, edition);
            stmt.setString(6, publication);
            stmt.setString(7, book_id);
            PrintWriter out = response.getWriter();
            int rowsUpdated = stmt.executeUpdate();

            // Display a confirmation message to the user
            if (rowsUpdated > 0) {
                out.println("<p>The book has been updated in the library.</p>");
            } else {
                out.println("<p>No book updated yet.</p>");
            }

            out.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
