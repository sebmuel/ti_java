package Kontoverwaltung.classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class Modal {
    private static HashMap<String, String> messages = new HashMap<>();

    static {
        messages.put("inputRequired", "Bitte füllen sie die Felder aus!");
        messages.put("userNotFound", "Mit diesem Username<br>existiert kein Benutzer");
    }

    private JPanel messageContainer;
    private JLabel messageLabel;
    private JButton okButton;
    private JDialog modal;

    public Modal(){
        modal = new JDialog();
        modal.setTitle("Error");
        modal.setSize(300, 150);
        modal.setLocationRelativeTo(null);
        modal.setModal(true);
        modal.setVisible(false);
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hideModal();
            }
        });
    }

    public void showModal(String msg) {
        String messageHtmlWrapper = String.format(
                "<html><body style='text-align:center'>%s</body></html>", messages.get(msg)
        );
        messageLabel.setText(messageHtmlWrapper);
        modal.setContentPane(messageContainer);
        modal.setVisible(true);
    }

    public void hideModal(){
        modal.setVisible(false);
        messageLabel.setText(null);
    }

}
