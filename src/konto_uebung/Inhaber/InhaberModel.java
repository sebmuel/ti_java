package konto_uebung.Inhaber;
import konto_uebung.Konto;

public class InhaberModel extends Conn {
    private String name;
    private Konto konto;
    private boolean loggedIn;

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public String getName() {
        return name;
    }

    public Konto getKonto() {
        return konto;
    }
    public InhaberModel(String name, Konto konto){
        this.name = name;
        this.konto = konto;
    }

    public InhaberModel(String name){
        this.name = name;
        this.konto = null;
    }

}
