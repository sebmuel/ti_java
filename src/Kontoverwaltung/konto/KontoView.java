package Kontoverwaltung.konto;

import javax.swing.*;

public class KontoView extends JPanel{

    private KontoController kontoController;
    private JPanel kontoPanel;
    private JLabel nameInfo;

    public KontoView(KontoController kontoController){
        super();
        this.kontoController = kontoController;
        this.nameInfo.setText(
                "Willkommen " +
                kontoController.getUser().getFirstName() + " "  +
                kontoController.getUser().getLastName() + "!"
        );
    }

    public JPanel getKontoPanel() {
        return kontoPanel;
    }
}
