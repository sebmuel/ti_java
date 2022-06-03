package Kontoverwaltung.login;

import Kontoverwaltung.Main;
import Kontoverwaltung.classes.MainFrame;
import Kontoverwaltung.classes.Modal;
import Kontoverwaltung.classes.User;

public class LoginController {
    private final LoginView view;
    private final LoginModel model;
    private boolean rendered;
    private boolean loggedIn = false;
    public LoginController(){
        this.view = new LoginView(this);
        this.model = new LoginModel(this);
    }
    public void render(){
        Main.getMainFrame().setContent(this.view.getLoginPanel(), 300, 300, "Login");
        this.rendered = true;
    }
    public void createUser(String username, char[] password) {
        if (username.equals("") || password.length == 0){
            Main.getMainFrame().modal.showModal("inputRequired");
        }
        this.model.loadUser(username, password);
    }
    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }
    public boolean isRendered() {
        return rendered;
    }

    public User getUser(){
        return model.getUser();
    }
}
