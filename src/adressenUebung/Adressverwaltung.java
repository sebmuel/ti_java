package adressenUebung;

import java.sql.SQLException;

public class Adressverwaltung {
    public static void main (String[] args){
        //Menu.loop();
        Database.storeAdress(new Adresse());
    }
}
