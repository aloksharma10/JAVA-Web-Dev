import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class insert_delete {
    public static void main(String[] args) {
        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Xe", "system", "admin");
            String insertQuery = "INSERT INTO employees (id, name, age) VALUES (1, emp1, 23)";
            PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
            insertStatement.setInt(1, 1);
            insertStatement.setString(2, "John Doe");
            insertStatement.setInt(3, 30);
            insertStatement.executeUpdate();
            System.out.println("Data inserted successfully.");
            String updateQuery = "UPDATE employees SET age = 23 WHERE id = 1";
            PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
            updateStatement.setInt(1, 35);
            updateStatement.setInt(2, 1);
            updateStatement.executeUpdate();
            System.out.println("Data updated successfully.");
            updateStatement.close();
            insertStatement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("Exception during connection " + e);
        }
     }
}
