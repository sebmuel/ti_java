package konto_uebung;

public class Sparkonto extends Konto{
    public Sparkonto(String inhaber, int kontonummer) {
        this.inhaber = inhaber;
        this.kontonummer = kontonummer;
        this.dispoRahmen = 0;
        this.kontoGebuehr = 0;
        this.kontostand = 0;
    }
}
