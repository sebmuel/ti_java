package adressenUebung;

import java.sql.SQLException;

public class Adressverwaltung {
    public static void main (String[] args) throws SQLException {
        //Menu.loop();
        Database.initConnection();
        Database.store("Hallo");
    }
}
