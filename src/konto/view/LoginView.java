package konto.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginView extends JFrame{
    private JPasswordField passwordField;
    private JFormattedTextField nameField;
    private JPanel loginPanel;
    private JButton submitButton;
    private JButton exitButton;

    public LoginView(){
        setContentPane(loginPanel);
        setTitle("Login");
        setSize(300, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
