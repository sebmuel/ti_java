package adressenUebung;

public class Adresse {

    private String vorname;
    private String nachname;
    private String ort;
    private String plz;

    public Adresse(String vorname, String nachname, String ort, String plz){
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

    public void setVorname(String vorname){
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }
}
