package adressenUebung;
import java.util.Scanner;

public class Adresse {

    private String vorname;
    private String nachname;
    private String ort;
    private String plz;

    public Adresse(){
        this.vorname = getInput("Vorname");
        this.nachname = getInput("Nachname");
        this.ort = getInput("Ort");
        this.plz = getInput("Plz");
    }

    public String getVorname(){
        return this.vorname;
    }

    public String getNachname(){
        return this.nachname;
    }

    public String getOrt(){
        return this.ort;
    }

    public String getPlz(){
        return this.plz;
    }

    public void setVorname(String vorname){
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    private static String getInput(String type){
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte " + type + " eingeben: ");
        return input.nextLine();

    }
}
