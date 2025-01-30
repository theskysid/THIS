import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        dbmethods db = new dbmethods();
        Connection conn = db.connect_to_db("mydatabase", "postgres","123456");
    }
}