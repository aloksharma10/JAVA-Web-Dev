import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Beans {



	    private String username;
	    private String password;

	    public Beans() {
	        // Default constructor
	    }

	    public String getUsername() {
	        return username;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    // Method to validate username and password against the database
	    public boolean validate() throws SQLException {
	        Connection conn = null;
	        PreparedStatement statement = null;
	        ResultSet resultSet = null;
	        boolean isValidUser = false;

	        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_r", "root", "root");

	        String sql = "SELECT * FROM users WHERE username=? AND password=?";
	        statement = conn.prepareStatement(sql);
	        statement.setString(1, username);
	        statement.setString(2, password);
	        resultSet = statement.executeQuery();

	        if (resultSet.next()) {
	            isValidUser = true;
	        }

	        // Close resources
	        if (resultSet != null) {
	            resultSet.close();
	        }
	        if (statement != null) {
	            statement.close();
	        }
	        if (conn != null) {
	            conn.close();
	        }

	        return isValidUser;
	    }
	}
