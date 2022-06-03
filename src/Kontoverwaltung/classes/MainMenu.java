package Kontoverwaltung.classes;

import javax.swing.*;
public class MainMenu {
    private static final JMenu[] menuPoints;
    private static final JMenuBar menuBar;
    static{
        // init array with length 2
        menuPoints = new JMenu[2];

        // Main Menu
        JMenu mainItems = new JMenu("Hauptmenu");
        mainItems.add(new JMenuItem("Beenden"));
        mainItems.add(new JMenuItem("Einstellungen"));
        menuPoints[0] = mainItems;

        // Second Menu
        JMenu secondMenuItems = new JMenu("SecondMenu");
        secondMenuItems.add(new JMenuItem("Setting 1"));
        secondMenuItems.add(new JMenuItem("Setting 2"));
        menuPoints[1] = secondMenuItems;

        menuBar = new JMenuBar();
        for (JMenu menu : menuPoints){
            menuBar.add(menu);
        }

    }
   public static JMenuBar getMenuBar() {
        return menuBar;
    }
}
