package GUI;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Welcome extends JFrame{
    
    public Welcome(){
    	super("Welcome to Flow");
        setLayout(new BorderLayout());

        ImageIcon icon = new ImageIcon("FinalProject\\src\\GUI\\flowicon.png");
        setIconImage(icon.getImage());

        JButton registerBtn = new JButton("Register");
        registerBtn.setToolTipText("Register.");
        registerBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Register();
                dispose();
            }
        });

        JButton loginBtn = new JButton("Login");
        loginBtn.setToolTipText("Log-in to the system.");
        loginBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Login();
                dispose();
            }
        });

        JPanel buttonPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        JLabel imageLabel = new JLabel(new ImageIcon("FinalProject\\src\\GUI\\flowicon.png"));
        gbc.gridx = 0;
        gbc.gridy = 0;
        buttonPanel.add(imageLabel, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        buttonPanel.add(registerBtn, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        buttonPanel.add(loginBtn, gbc);
        add(buttonPanel, BorderLayout.CENTER);

        registerBtn.setForeground(Color.BLUE);
        registerBtn.setBackground(Color.WHITE);

        loginBtn.setForeground(Color.WHITE);
        loginBtn.setBackground(Color.BLUE);

        this.getContentPane().setBackground(Color.BLACK);

        // Create a JMenuBar
        JMenuBar menuBar = new JMenuBar();

        // Create a "File" menu and add it to the menu bar
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        // Create a "Close" menu item and add it to the "File" menu
        JMenuItem closeMenuItem = new JMenuItem("Close");
        fileMenu.add(closeMenuItem);

        // Add an ActionListener to the "Close" menu item that exits the program when clicked
        closeMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Create a "Help" menu and add it to the menu bar
        JMenu helpMenu = new JMenu("Help");
        menuBar.add(helpMenu);

        // Create an "About Us" menu item and add it to the "Help" menu
        JMenuItem aboutUsMenuItem = new JMenuItem("About Us");
        helpMenu.add(aboutUsMenuItem);

        // Add an ActionListener to the "About Us" menu item that shows a message dialog when clicked
        aboutUsMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "This is a program created by Group 4.", "About Us", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Set the menu bar for the frame
        setJMenuBar(menuBar);
        
        pack();
        setSize(600, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }




}