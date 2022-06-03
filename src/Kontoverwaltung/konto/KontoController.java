package Kontoverwaltung.konto;

import Kontoverwaltung.Main;
import Kontoverwaltung.classes.MainFrame;
import Kontoverwaltung.classes.User;

public class KontoController {

    private KontoView view;
    private KontoModel model;
    private User user;

    public KontoController(User user){
        this.user = user;
        this.view = new KontoView(this);
        this.model = new KontoModel(this);
    }

    public void render(){
        MainFrame mainFrame = Main.getMainFrame();
        mainFrame.setContent(this.view.getKontoPanel(), 1920, 1080, "Kontoverwaltung");
    }

    public User getUser() {
        return user;
    }
}
