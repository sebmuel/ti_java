package konto_uebung;

public abstract  class Konto {
    protected String inhaber;
    protected int kontonummer;
    protected double kontostand;
    protected double dispoRahmen;
    protected double kontoGebuehr;

    public void ueberweisen(int kontonummer, double betrag){
        if (kontostand + dispoRahmen < betrag){
            // print error message
            return;
        }
        kontostand -= betrag;
        // add the amount to the destination "account"
        // print message with updated balance etc ...
    }

    public void abheben(double betrag){
        if (kontostand + dispoRahmen < betrag){
            // print error message
            return;
        }
        kontostand -= betrag;
        // print message with updated balance etc ...
    }

    public void einzahlen(double betrag){
        kontostand += betrag;
        // print message etc
    }

    public void auszugErstellen(){
        // dunno now know logic yet
    }

    public String getInhaber(){
        return inhaber;
    }

    public int getKontonummer(){
        return kontonummer;
    }

    public double getKontostand(){
        return kontostand;
    }

    public double getDispoRahmen() {
        return dispoRahmen;
    }

    public void setDispoRahmen(double dispoRahmen) {
        this.dispoRahmen = dispoRahmen;
    }

    public void setKontoGebuehr(double kontoGebuehr) {
        this.kontoGebuehr = kontoGebuehr;
    }
}
