package adressenUebung;
import java.sql.*;
import java.util.ArrayList;


public class Database {
    private static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/adressen?";
    private static final String DB_USERNAME = "seb";
    private static final String DB_PASSWORD = "Hallodu123";
    private static Connection connection;
    final static String updateQuery =
            "INSERT INTO Adressen(vorname, nachname, ort, plz) VALUES ('%s', '%s', '%s', '%s')";
    final static String deleteQuery =
            "DELETE FROM Adressen WHERE a_id Like '%s'";

    private static void initConnection(){
        Connection conn;
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
    static void update(Adresse adresse) throws SQLException{
        // create Connection Instance
        Database.initConnection();
        // collect Adress object attributes
        String vorname = adresse.getVorname();
        String nachname = adresse.getNachname();
        String ort = adresse.getOrt();
        String plz = adresse.getPlz();
        // write statement
        String query = String.format(Database.updateQuery, vorname, nachname, ort, plz);
        // try to execute the statement
        Statement statement = Database.connection.createStatement();
        statement.executeUpdate(query);
        Database.closeConnection();
    }
    // did an overload here for deleting an adress
    static void update(int id) throws SQLException{
        Database.initConnection();
        // check if an adress has that id
        boolean found = false;
        for (Adresse adresse : AdressListe.getAdressListe()){
            if(adresse.getId() == id){
                found = true;
                break;
            }
        }
        // no adress found print message to user and leave method
        if (!found){
            View.printMessage("noRecordsFound");
            return;
        }
        String query = String.format(Database.deleteQuery, id);
        Statement statement = Database.connection.createStatement();
        statement.executeUpdate(query);
        Database.closeConnection();
    }
    static ArrayList<Adresse> loadAdresses() throws SQLException {
        Database.initConnection();
        ArrayList<Adresse> records = new ArrayList<>();
        String query = "SELECT * FROM Adressen";
        Statement stmt =  Database.connection.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while(rs.next()) {
            int id = rs.getInt("a_id");
            String vorname = rs.getString("vorname");
            String nachname = rs.getString("nachname");
            String ort = rs.getString("ort");
            String plz = rs.getString("plz");
            records.add(new Adresse(id, vorname, nachname, ort, plz));
        }
        Database.closeConnection();
        return records;
    }
}
