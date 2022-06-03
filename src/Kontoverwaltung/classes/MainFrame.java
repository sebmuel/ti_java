package Kontoverwaltung.classes;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public Modal modal = new Modal();
    public MainFrame(){
        setJMenuBar(MainMenu.getMenuBar());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void setContent(JPanel contentPanel, int width, int height, String title){
        setSize(width, height);
        setTitle(title);
        setContentPane(contentPanel);
        revalidate();
        repaint();
    }
}
