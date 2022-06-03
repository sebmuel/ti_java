package Kontoverwaltung.login;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginView extends JPanel{
    private LoginController loginController;
    private JPasswordField passwordField;
    private JFormattedTextField nameField;
    private JButton submitButton;
    private JButton exitButton;
    private JPanel content;
    private JPanel loginPanel;

    public LoginView(LoginController controller) {
        super();
        loginController = controller;
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = nameField.getText();
                char[] password = passwordField.getPassword();
                loginController.createUser(username, password);
            }
        });
    }
    public JPanel getLoginPanel() {
        return loginPanel;
    }
}
