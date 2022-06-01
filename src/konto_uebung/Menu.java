package konto_uebung;

import java.util.Scanner;

public class Menu {
    public static Girokonto g1 = new Girokonto("Sebastian",5128912, 1000, 5);
    public static Sparkonto s1 = new Sparkonto("Peter", 192389123);

    public static void mainLoop() {
        while (true) {
            System.out.println("1) Guthabenkonto erstellen");
            System.out.println("2) Konto auswählen");
            System.out.println("3) Einzahlen");
            System.out.println("4) Auszahlen");
            System.out.println("5) Überweisen");
            System.out.println("6) Kontostand abfragen");
            System.out.println("7) Auszug Drucken");
            System.out.println("8) Exit");

            switch (getInput()) {
                case "1" ->  System.out.println();
                case "2" -> System.out.println("asdasdlk");
                case "3" -> System.out.println("asd");
                case "4" -> System.out.println("as");
                case "5" -> System.out.println("asld");
                case "6" -> System.out.println(g1.getKontostand());
                case "7" -> System.out.println("askdjkalsjd");
                case "8" -> System.exit(0);
            }
        }
    }

    public static void clearScreen() {
        for (int i = 0; i < 50; i++) {
            System.out.println(" ");
        }
    }

    public static String getInput() {
        String option;
        System.out.println(Config.getMessage("promptUserInput"));
        Scanner scanner = new Scanner(System.in);
        option = scanner.nextLine();
        return option;
    }
}
