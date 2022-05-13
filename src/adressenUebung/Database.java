package adressenUebung;
import javax.xml.crypto.Data;
import java.sql.*;
import java.util.ArrayList;


public class Database {

    private static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/adressen?";
    private static final String DB_USERNAME = "seb";
    private static final String DB_PASSWORD = "Hallodu123";
    private static Connection connection;

    private static void initConnection(){
        Connection conn  = null;
        try {
            conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            Database.connection = conn;
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.exit(1);
        }
    }

    private static void closeConnection(){
        try{
            Database.connection.close();
        }catch(SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
        }
    }

    public static void storeAdress(Adresse adresse){
        // create Connection Instance
        Database.initConnection();
        // collect Adress object attributes
        String vorname = adresse.getVorname();
        String nachname = adresse.getNachname();
        String ort = adresse.getOrt();
        String plz = adresse.getPlz();

        // write statement
        String stmt = String.format(
                "INSERT INTO Adressen(vorname, nachname, ort, plz) VALUES ('%s', '%s', '%s', '%s')",
                vorname, nachname, ort, plz
        );
        try{
            // try to execute the statement
            Statement statement = Database.connection.createStatement();
            statement.executeUpdate(stmt);
        }
        catch (SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
        }finally {
            Database.closeConnection();
        }
    }

}
