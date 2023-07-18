package GUI;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class LiveChat extends JFrame{
	
	private JButton backButton;
	private JTextArea chatArea;
	private JTextField chatField;
	private JButton sendButton;
	    
	    
	public LiveChat(String name) {
		super("Live Chat");

        ImageIcon icon = new ImageIcon("flowicon.png");
        setIconImage(icon.getImage());
        setLayout(new BorderLayout());

        chatArea = new JTextArea();
        chatArea.setEditable(false);
        add(new JScrollPane(chatArea), BorderLayout.CENTER);

        JPanel southPanel = new JPanel(new BorderLayout());
        JLabel typeHereLabel = new JLabel("Type here:");
        southPanel.add(typeHereLabel, BorderLayout.NORTH);

        chatField = new JTextField();
        southPanel.add(chatField, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout());

        sendButton = new JButton("Send");
        buttonPanel.add(sendButton);
        ActionListener sendAction = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = name + "- " + chatField.getText();
                chatArea.append(text + "\n");
                chatField.setText("");
            }
        };
        sendButton.addActionListener(sendAction);
        chatField.addActionListener(sendAction);

        backButton = new JButton("Back");
        buttonPanel.add(backButton);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to Exit?");
                if (result == JOptionPane.YES_OPTION) {
                    dispose();
                }
            }
        });
        southPanel.add(buttonPanel, BorderLayout.EAST);

        add(southPanel, BorderLayout.SOUTH);
        
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
        
        setSize(600, 400);
        setLocationRelativeTo(null);
        setVisible(true);
	}
}
