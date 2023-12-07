import java.io.IOException;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/LoginServlet")
public class NewServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Create an instance of the LoginBean
        Beans loginBean = new Beans();
        loginBean.setUsername(username);
        loginBean.setPassword(password);

        try {
            // Validate the credentials
            if (loginBean.validate()) {
                response.sendRedirect("welcome.jsp"); // Redirect to a welcome page upon successful login
            } else {
                response.sendRedirect("login.jsp"); // Redirect back to login page with a message for invalid credentials
            }
        } catch (SQLException e) {
            System.out.println(e); // Handle database-related exceptions here
        }
    }
}
