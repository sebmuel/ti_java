package adressenUebung;
import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
    private static int lastItemSelected;

    public static void loop() throws SQLException {
        while(true){
            // update the AdressList
            AdressListe.updateList();
            View.menuItems();
            String choice = Menu.menuChoice();
            switch (choice) {
                case "1" -> {
                    lastItemSelected = 1;
                    Database.update(new Adresse(
                            Adresse.getInput("Vorname"),
                            Adresse.getInput("Nachname"),
                            Adresse.getInput("Ort"),
                            Adresse.getInput("Plz")));
                }
                case "2" -> {
                    lastItemSelected = 2;
                    View.clearConsole();
                    View.output();
                }
                case "3" -> {
                    lastItemSelected = 3;
                    View.clearConsole();
                    View.output();
                    Database.update(Integer.parseInt(Menu.menuChoice()));
                }
                case "4" -> System.exit(0);
                default -> View.printMessage("inputNotValid");
            }
        }
    }
    private static String menuChoice(){
        String option;
        Scanner scanner = new Scanner(System.in);
        if (lastItemSelected == 3){
            View.printMessage("deletePrompt");
        }
        else{
            View.printMessage("promptUserInput");
        }
        option = scanner.nextLine();
        return option;
    }
}

