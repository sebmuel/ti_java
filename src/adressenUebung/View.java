package adressenUebung;

import java.util.HashMap;

public class View {
    private final static HashMap<String, String> messages = new HashMap<>();
    // fill our messages Map with values in a static block
    static {
        messages.put("noEntries", "Keine Einträge gefunden");
        messages.put("inputNotValid", "Keine gültige eingaben");
        messages.put("promptUserInput", "Ihre Auswahl: ");
        messages.put("deletePrompt", "Geben sie die ID der Adresse ein welche Sie löschen möchten: ");
        messages.put("noRecordsFound", "Keine Adresse mit der entsprechenden ID gefunden!");
    }
    static void menuItems(){
        System.out.println("1.) Adresse Speichern");
        System.out.println("2.) Adresse Anzeigen");
        System.out.println("3.) Adresse Löschen");
        System.out.println("4.) Schließen");
    }
    static void output(){
        if (AdressListe.getAdressListe().isEmpty()){
            View.printMessage("noEntries");
            return;
        }
        for (Adresse adress : AdressListe.getAdressListe()){
            System.out.print(adress.getId() + ", ");
            System.out.print(adress.getVorname() + ", ");
            System.out.print(adress.getNachname() + ", ");
            System.out.print(adress.getOrt() + ", ");
            System.out.println(adress.getPlz() + " ");
        }
        System.out.println("------------------------------------------------------");
    }
    static void clearConsole(){
        for(int i = 0; i < 50; i++){
            System.out.println();
        }
    }
    static void printMessage(String messageName){
        System.out.println(messages.get(messageName));
    }
}
