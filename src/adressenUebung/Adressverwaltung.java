package adressenUebung;
import java.util.ArrayList;

public class Adressverwaltung {

    public static void main (String[] args){
        Adresse adresse1 = new Adresse("Sebastian", "Müller", "Saarbrücken", "66117");
        Adresse adresse2 = new Adresse("Hans", "Peter", "Merzig", "66123");
        Adresse[] asd = [adresse1, adresse2];
        AdressListe adressListe = new AdressListe(Adresse[adresse1, adresse2]);
        adressListe.add();
        adressListe.add(new Adresse("Hans", "Peter", "Merzig", "66123"));

        for ( Adresse adresse : adressListe){
            System.out.println(adresse.getVorname() + " " + adresse.getNachname());
        }
    }
}
