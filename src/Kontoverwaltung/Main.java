package Kontoverwaltung;


import Kontoverwaltung.classes.MainFrame;
import Kontoverwaltung.login.LoginController;
import Kontoverwaltung.konto.KontoController;

public class Main {
    private static MainFrame mainFrame;
    private static LoginController loginController;
    private static KontoController kontoController;
    public static void main(String[] args) {
        loginController = new LoginController();
        mainFrame = new MainFrame();
        run();
    }

    public static void run(){
        if (loginController.isLoggedIn()) {
            kontoController = new KontoController(loginController.getUser());
            kontoController.render();
        } else if (!loginController.isLoggedIn() && !loginController.isRendered()) {
            loginController.render();
        }
    }

    public static MainFrame getMainFrame() {
        return mainFrame;
    }
}
