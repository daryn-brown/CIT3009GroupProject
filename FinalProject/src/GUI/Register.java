package GUI;
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
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Register extends JFrame{
	private JTextField idField;
    private JTextField fNameField;
    private JTextField lNameField;
    private JTextField emailField;
    private JTextField contactField;
    private JPasswordField passwordField;
    private JPasswordField confirmField;

    public Register() {
        super("Register");
        
        ImageIcon icon = new ImageIcon("FinalProject\\src\\GUI\\rescources\\flowicon.png");
        setIconImage(icon.getImage());
        
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        //ID
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("ID:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        idField = new JTextField(10);
        add(idField, gbc);
        
        //First Name
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("First Name:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        fNameField = new JTextField(10);
        add(fNameField, gbc);
        
        //Last Name
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(new JLabel("Last Name:"), gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 2;
        lNameField = new JTextField(10);
        add(lNameField, gbc);
        
        //Email
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(new JLabel("Email:"), gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 3;
        emailField = new JTextField(15);
        add(emailField, gbc);
        
        //Contact Number
        gbc.gridx = 0;
        gbc.gridy = 4;
        add(new JLabel("Contact: "), gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 4;
        contactField = new JTextField(15);
        add(contactField, gbc);
        
        //Password
        gbc.gridx = 0;
        gbc.gridy = 5;
        add(new JLabel("Password: "), gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 5;
        passwordField = new JPasswordField(10);
        add(passwordField, gbc);
        
        //Confirm Password
        gbc.gridx = 0;
        gbc.gridy = 6;
        add(new JLabel("Confirm Password: "), gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 6;
        confirmField = new JPasswordField(10);
        add(confirmField, gbc);
        
        //back button
        JButton backButton = new JButton("Go Back");
        backButton.setToolTipText("Return to Welcome screen");
        backButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new Welcome();
                dispose();
            }
        });
        gbc.gridx = 0;
        gbc.gridy = 7;
        backButton.setBackground(Color.blue);
        backButton.setForeground(Color.white);
        add(backButton, gbc);
        
        
        //register button
        JButton registerButton = new JButton("Register");
        registerButton.setToolTipText("Register.");
        
        registerButton.setForeground(Color.DARK_GRAY);
        registerButton.setBackground(Color.CYAN);
        gbc.gridx = 1;
        gbc.gridy = 7;
        add(registerButton, gbc);
        
      //clear all button
        JButton clearButton = new JButton("Clear all");
        clearButton.setToolTipText("Removes text from the fields");
        clearButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                idField.setText("");
                lNameField.setText("");
                fNameField.setText("");
                passwordField.setText("");
                emailField.setText("");
                contactField.setText("");
                confirmField.setText("");
            }
        });
        
        gbc.gridx = 2;
        gbc.gridy = 7;
        clearButton.setForeground(Color.white);
        clearButton.setBackground(Color.RED);
        
        add(clearButton, gbc);
        
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
        //setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}