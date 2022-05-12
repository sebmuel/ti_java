package adressenUebung;
import java.util.ArrayList;

public class AdressListe {
    private final ArrayList<Adresse> adressListe = new ArrayList<>();

    public void output(){
        for (Adresse adr : this.adressListe){
            System.out.println(adr.getVorname());
            System.out.println(adr.getNachname());
            System.out.println(adr.getOrt());
            System.out.println(adr.getPlz());
        }
    }

    public void save(){
        this.adressListe.add(new Adresse());
    }
}
