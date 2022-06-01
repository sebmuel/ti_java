package konto_uebung;

import konto_uebung.Inhaber.*;

public class Main {
    public static void main(String[] args) {
        InhaberModel in1 = new InhaberModel("Sebastian", new Girokonto(
                        "sebastian",
                        12399,
                        5000,
                        5
                ));

        Konto peter = new Sparkonto("Sebasti", 129389);
        System.out.println(peter.getClass());
    }
}
