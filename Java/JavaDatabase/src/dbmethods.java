import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbmethods {
    public static Connection connect_to_db(String dbname, String username, String pass){
        Connection conn = null;
        String url = "jdbc:postgresql://localhost:5432/" + dbname;
        try{
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url,username,pass);
            System.out.println("Connected to PostgreSQL database");

        } catch(ClassNotFoundException e){
            System.out.println("PostgreSQL JDBC Driver not found");
            e.printStackTrace();
        } catch(SQLException e){
            System.out.println("Connection failed");
            e.printStackTrace();
        }
        return conn;
    }
}