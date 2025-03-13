import java.sql.Connection;
import java.sql.DriverManager;

public class TestDB {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver"); // Check if driver is loaded
            System.out.println("MySQL JDBC Driver Registered Successfully!");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver Not Found!");
            e.printStackTrace();
        }
    }
}
