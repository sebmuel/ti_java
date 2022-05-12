package adressenUebung;
import java.util.ArrayList;

import java.sql.Array;
import java.util.Arrays;

public class AdressListe {
    private final ArrayList<Adresse> adressListe = new ArrayList<>();

    public AdressListe(Adresse [] adressen){
        this.adressListe.addAll(Arrays.asList(adressen));
    }

    public ArrayList<Adresse> getAdressListe() {
        return adressListe;
    }
}
