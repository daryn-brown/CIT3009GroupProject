package GUI;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Login extends JFrame {
    private JTextField idField;
    private JPasswordField passwordField;

    public Login() {
        super("Login");

        ImageIcon icon = new ImageIcon("FinalProject\\src\\GUI\\resources\\flowicon.png");
        setIconImage(icon.getImage());

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("ID:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        idField = new JTextField(10);
        add(idField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("Password:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        passwordField = new JPasswordField(10);
        add(passwordField, gbc);

        // Add radio buttons
        JRadioButton radioButton1 = new JRadioButton("Representative");
        JRadioButton radioButton2 = new JRadioButton("Technician");
        JRadioButton radioButton3 = new JRadioButton("Customer");
        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(radioButton1, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        add(radioButton2, gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
        add(radioButton3, gbc);

        JButton loginButton = new JButton("Login");
        loginButton.setToolTipText("Log-in.");
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (radioButton1.isSelected()) {
                    new Representative();
                     dispose();
                } else if (radioButton2.isSelected()) {
                    new Technician();
                     dispose();
                }else if (radioButton3.isSelected()) {
                    new Customer();
                     dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Please select either Representative, Technician or Customer");
                }
            }
        });

        gbc.gridx = 1;
        gbc.gridy = 3;
        add(loginButton, gbc);
        loginButton.setBackground(Color.CYAN);
        loginButton.setForeground(Color.BLACK);

        JButton backButton = new JButton("Go Back");
        backButton.setToolTipText("Return to Welcome screen");

        gbc.gridx = 1;
        gbc.gridy = 4;
        add(backButton, gbc);
        backButton.setBackground(Color.BLUE);
        backButton.setForeground(Color.WHITE);

        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Welcome();
                dispose();
            }
        });

        // Create a JMenuBar
        JMenuBar menuBar = new JMenuBar();

        // Create a "File" menu and add it to the menu bar
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        // Create a "Close" menu item and add it to the "File" menu
        JMenuItem closeMenuItem = new JMenuItem("Close");
        fileMenu.add(closeMenuItem);

        // Add an ActionListener to the "Close" menu item that exits the program when
        // clicked
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

        // Add an ActionListener to the "About Us" menu item that shows a message dialog
        // when clicked
        aboutUsMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "This is a program created by Group 4.", "About Us",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Set the menu bar for the frame
        setJMenuBar(menuBar);

        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
