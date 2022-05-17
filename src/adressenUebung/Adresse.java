package adressenUebung;
import java.util.Scanner;


public class Adresse {
    private final int id;
    private final String vorname;
    private final String nachname;
    private final String ort;
    private final String plz;

    // constructor for saving an adress prompted by user
    public Adresse(String vorname, String nachname, String ort, String plz){
        this.id = 0;
        this.vorname = vorname;
        this.nachname = nachname;
        this.ort = ort;
        this.plz = plz;
    }

    // constructor for
    public Adresse(int id, String vorname, String nachname, String ort, String plz){
        this.id = id;
        this.vorname = vorname;
        this.nachname = nachname;
        this.ort = ort;
        this.plz = plz;
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

    int getId(){
        return this.id;
    }

    static String getInput(String type){
        Scanner input = new Scanner(System.in);
        String inputValue;
        do {
            System.out.println("Bitte " + type + " eingeben: ");
            while (!input.hasNext("[a-zA-Z0-9/]+")){
                System.out.println("Ungültige eingabe für den " + type + " versuchen sie es erneut:");
                input.nextLine();
            }
            inputValue = input.nextLine();
        }while(inputValue.length() < 3);

        return inputValue;
    }
}
