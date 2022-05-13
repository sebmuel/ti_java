package adressenUebung;
import java.util.Scanner;

public class Menu {
    private static final AdressListe liste = new AdressListe();
    public static void loop(){
        while(true){
            System.out.println("1.) Adresse Speichern");
            System.out.println("2.) Adresse Anzeigen");
            System.out.println("3.) Schließen");
            String choice = Menu.menuChoice();

            switch (choice) {
                case "1" -> Menu.liste.save();
                case "2" -> Menu.liste.output();
                case "3" -> System.exit(0);
                default -> {
                }
            }
        }
    }

    private static String menuChoice(){
        String option;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ihre Auswahl: ");
        option = scanner.nextLine();
        return option;
    }
}

