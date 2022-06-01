package gui;


import java.awt.*;

import javax.swing.*;

public class gui_basics {

    public static void main(String[] args) {


        // Main Frame mit panel und Buttongeblubber
        JFrame frame = new JFrame("Windows for Weirdo's - Welcome you fool");
        JPanel panel = new JPanel();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button = new JButton("most boring Button in this frame");
        JButton buttonzwo = new JButton("I am Benjamin, Benjamin Button.");
        JButton buttondry = new JButton("I know what you think but i am just a buttom at the bottom.");
        panel.add(button);
        panel.add(buttonzwo);
        panel.add(buttondry);
        //frame.add(panel);
        //frame.pack();
        frame.setSize(600, 300);

        // Menubar  
        JMenuBar menubar = new JMenuBar();
        JMenu menu1 = new JMenu("FILE");
        JMenu menu2 = new JMenu("PANIC");
        menubar.add(menu1);
        menubar.add(menu2);
        JMenuItem m11 = new JMenuItem("Open");
        JMenuItem m12 = new JMenuItem("Close");
        menu1.add(m11);
        menu2.add(m12);

        // Contenpanel mit Komponenten .... 
        JPanel panel2 = new JPanel();
        JLabel label = new JLabel("Toller Text folgt noch");
        JTextField txtfeld = new JTextField(10);
        JButton btnSend = new JButton("Senden");
        JButton btnRst = new JButton("Reset");
        panel2.add(label);
        panel2.add(txtfeld);
        panel2.add(btnSend);
        panel2.add(btnRst);

        // Erstellen der Text Area
        JTextArea textarea = new JTextArea();
        panel2.add(textarea);

        // Zusammenbau
        frame.getContentPane().add(BorderLayout.PAGE_START, menubar);
        frame.getContentPane().add(BorderLayout.LINE_START, panel2);
        frame.getContentPane().add(BorderLayout.CENTER, textarea);
        frame.getContentPane().add(BorderLayout.PAGE_END, panel);
        frame.getContentPane().setBackground(Color.blue);



        frame.setVisible(true);
    }

}
