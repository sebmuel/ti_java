package adressenUebung;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Adresse {

    private final String vorname;
    private final String nachname;
    private final String ort;
    private final String plz;

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

    private static String getInput(String type){
        Scanner input = new Scanner(System.in);
        String inputValue;
        do {
            System.out.println("Bitte " + type + " eingeben: ");
            while (!input.hasNext("[a-zA-Z0-9/]+")){
                System.out.println("Ungültige eingabe für den " + type + " versuchen sie es erneut:");
                input.next();
            }
            inputValue = input.next();
        }while(inputValue.length() < 3);

        return inputValue;
    }
}
