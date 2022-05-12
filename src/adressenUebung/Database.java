package adressenUebung;
import java.sql.*;


public class Database {

    private static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/inventarisierung?";
    private static final String DB_USERNAME = "seb";
    private static final String DB_PASSWORD = "Hallodu123";
    private static Connection connection;

    public static void initConnection(){
        Connection conn  = null;
        try {
            conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            Database.connection = conn;
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            System.exit(1);
        }
    }
    public static void store(String statement) throws SQLException {
        ResultSet resultSet = null;
        Statement stmt = Database.connection.createStatement();
        if (stmt.execute("SELECT * FROM Inventar")){
            resultSet = stmt.getResultSet();
        }
    }
}
