import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class EmployeeFetcher {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/your_database_name"; // Replace with your database URL
    private static final String USER = "your_username"; // Replace with your MySQL username
    private static final String PASSWORD = "your_password"; // Replace with your MySQL password

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Step 1: Register JDBC driver (not required for newer Java versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Open a connection
            System.out.println("Connecting to the database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);

            // Step 3: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql = "SELECT id, first_name, last_name, department FROM employees"; // Adjust columns as necessary
            rs = stmt.executeQuery(sql);

            // Step 4: Extract data from result set
            System.out.println("Employee List:");
            System.out.println("---------------------------");
            while (rs.next()) {
                // Retrieve by column name
                int id = rs.getInt("id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String department = rs.getString("department");

                // Display values
                System.out.printf("ID: %d, Name: %s %s, Department: %s%n", id, firstName, lastName, department);
            }
        } catch (SQLException se) {
            // Handle JDBC errors
            se.printStackTrace();
        } catch (Exception e) {
            // Handle other errors (e.g., Class.forName issues)
            e.printStackTrace();
        } finally {
            // Step 5: Clean up resources
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
