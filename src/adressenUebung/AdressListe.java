package adressenUebung;
import java.sql.SQLException;
import java.util.ArrayList;

public  class AdressListe {
    private static ArrayList<Adresse> adressListe;

    static {
        try {
            adressListe = Database.loadAdresses();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    static void updateList() throws SQLException {
        AdressListe.adressListe = Database.loadAdresses();
    }
    static ArrayList<Adresse> getAdressListe(){
        return AdressListe.adressListe;
    }
}
