package konto_uebung;

public class Girokonto extends Konto {
    public Girokonto(String inhaber, int kontonummer, double dispo, double gebuehr) {
        this.inhaber = inhaber;
        this.kontonummer = kontonummer;
        this.kontostand = 0;
        this.dispoRahmen = dispo;
        this.kontoGebuehr = gebuehr;
    }
}
