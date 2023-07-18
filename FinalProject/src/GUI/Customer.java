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

public class Customer extends JFrame{
	public Customer() {
		super("Customer");
		
		//ICON
		ImageIcon icon = new ImageIcon("C:\\Users\\leond\\OneDrive\\Documents\\Advanced Programming\\GuiTest\\src\\flowicon.png");
        setIconImage(icon.getImage());
		
		//Formatting
		JPanel buttonPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        //Flow icon
        JLabel imageLabel = new JLabel(new ImageIcon("C:\\Users\\leond\\OneDrive\\Documents\\Advanced Programming\\GuiTest\\src\\flow.png"));
        gbc.gridx = 0;
        gbc.gridy = 0;
        buttonPanel.add(imageLabel, gbc);
        
		//Complaint
		JButton compButton = new JButton("Lodge Complaint");
		compButton.setToolTipText("Lodge Complaint");
		compButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //call complaint window
            	new Complaint();
            }
        });
		gbc.gridx = 0;
		gbc.gridy = 1;
		buttonPanel.add(compButton, gbc);
		
		//Query
		JButton queryButton = new JButton("Query");
		queryButton.setToolTipText("Make a Query");
		queryButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //call query window
            	new Query();
            }
        });
		gbc.gridx = 0;
        gbc.gridy = 2;
        buttonPanel.add(queryButton, gbc);
        add(buttonPanel, BorderLayout.CENTER);
        
		
		//Service
		JButton serviceButton = new JButton("Service");
		serviceButton.setToolTipText("Request Service");
		serviceButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //call service window
                dispose();
            }
        });
		gbc.gridx = 0;
        gbc.gridy = 3;
        buttonPanel.add(serviceButton, gbc);
        add(buttonPanel, BorderLayout.CENTER);
		
        //Live Chat
        JButton liveBtn = new JButton("Live Chat");
        liveBtn.setToolTipText("Opens the live chat");
        liveBtn.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		//call live chat
        		new LiveChat("User 1");
        	}
        });
        gbc.gridx = 0;
        gbc.gridy = 4;
        buttonPanel.add(liveBtn, gbc);
        add(buttonPanel, BorderLayout.CENTER);
        
		//Home
		JButton backButton = new JButton("Home");
        backButton.setToolTipText("Return to Welcome screen");
        backButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new Welcome();
                dispose();
            }
        });
        gbc.gridx = 0;
        gbc.gridy = 5;
        buttonPanel.add(backButton, gbc);
        add(buttonPanel, BorderLayout.CENTER);
        
		

        compButton.setBackground(Color.BLUE);
        compButton.setForeground(Color.WHITE);
        queryButton.setBackground(Color.BLUE);
        queryButton.setForeground(Color.WHITE);
        serviceButton.setBackground(Color.BLUE);
        serviceButton.setForeground(Color.WHITE);
        backButton.setBackground(Color.LIGHT_GRAY);
        liveBtn.setBackground(Color.RED);
        liveBtn.setForeground(Color.WHITE);

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
        
        setSize(600, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
		
	}
}
