package GUI;
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

public class Login extends JFrame{
	private JTextField idField;
    private JPasswordField passwordField;

    public Login() {
        super("Login");
        
        ImageIcon icon = new ImageIcon("FinalProject\\src\\GUI\\flowicon.png");
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

        JButton loginButton = new JButton("Login");
        loginButton.setToolTipText("Log-in.");
        loginButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new Customer();
                dispose();
            }
        });
        
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(loginButton, gbc);

        JButton backButton = new JButton("Go Back");
        backButton.setToolTipText("Return to Welcome screen");
        
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(backButton, gbc);
        
        backButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
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
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
}
}
