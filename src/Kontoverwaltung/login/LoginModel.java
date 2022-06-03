package Kontoverwaltung.login;

import Kontoverwaltung.Main;
import Kontoverwaltung.classes.User;
import Kontoverwaltung.classes.org.mindrot.jbcrypt.BCrypt;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class LoginModel extends Kontoverwaltung.classes.conn {
    private User user;
    private LoginController loginController;
    public LoginModel(LoginController controller){
        this.loginController = controller;
    }
    public void loadUser(String username, char[] password) {
        try {
            initConnection();
            String query = String.format("SELECT * FROM users WHERE username LIKE \"%s\"", username);
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            if (!resultSet.next()){
                Main.getMainFrame().modal.showModal("userNotFound");
                return;
            }
            do {
                this.user = new User(
                        resultSet.getString("username"),
                        resultSet.getString("vorname"),
                        resultSet.getString("nachname"),
                        resultSet.getString("passwort"),
                        resultSet.getInt("login_versuche")
                );
            } while(resultSet.next());
            this.login(password);
        } catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            if (conn != null) conn = null;
        }
    }
    private void login(char[] password) {
        if(BCrypt.checkpw(String.valueOf(password), this.user.getPasswordHash())){
            this.user.setLogginAttemps(0);
            this.loginController.setLoggedIn(true);
            Main.run();
        }else{
            this.user.setLogginAttemps(this.user.getLogginAttemps() + 1);
        }
    }
    protected void update(){
        try{
            initConnection();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public User getUser(){
        return this.user;
    }
}
