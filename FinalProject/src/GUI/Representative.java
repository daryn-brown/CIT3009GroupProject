package GUI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Representative extends JFrame {
    public Representative() {

        super("Representative Dashboard");

        // ICON
        ImageIcon icon = new ImageIcon("FinalProject\\src\\GUI\\resources\\flowicon.png");
        setIconImage(icon.getImage());

        // Formatting
        JPanel buttonPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // graphics icon
        JLabel imageLabel = new JLabel(new ImageIcon("FinalProject\\src\\GUI\\resources\\Representative.png"));
        gbc.gridx = 0;
        gbc.gridy = 0;
        buttonPanel.add(imageLabel, gbc);
        add(buttonPanel);

        // Window
        setSize(600, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        // Create a JMenuBar
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("Window");
        menuBar.add(fileMenu);

        // Create a "Home" menu item and add it to the "File" menu
        JMenuItem homeItem = new JMenuItem("Return to Home Page");
        fileMenu.add(homeItem);
        homeItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Welcome();
            }
        });

        // Create a "Close" menu item and add it to the "File" menu
        JMenuItem closeMenuItem = new JMenuItem("Close Application");
        fileMenu.add(closeMenuItem);
        closeMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Create a "Help" menu and add it to the menu bar
        JMenu helpMenu = new JMenu("Help");
        menuBar.add(helpMenu);
        JMenuItem aboutUsMenuItem = new JMenuItem("About Us");
        helpMenu.add(aboutUsMenuItem);
        // Add an ActionListener to the "About Us" menu item that shows a message dialog
        aboutUsMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "This is a program created by Group 4.", "About Us",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Select views
        JMenu selector = new JMenu("Select View");
        menuBar.add(selector);
        JMenuItem view1 = new JMenuItem("View List of Services");
        JMenuItem view2 = new JMenuItem("View all Customer complaints");
        JMenuItem view3 = new JMenuItem("Assign complaint to Technician");
        selector.add(view1);
        selector.add(view2);
        selector.add(view3);
        view1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //view 1 View List of Services
            }
        });
        view2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //view 2 All Customer complaints
            }
        });
        view3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //view 3 Assign to Technician
            }
        });

        // Create a "Live chat" menu and add it to the menu bar
        JMenu liveMenu = new JMenu("Live chat");
        menuBar.add(liveMenu);
        JMenuItem livechatMenuItem = new JMenuItem("Open Live chat");
        liveMenu.add(livechatMenuItem);
        livechatMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LiveChat("Employee");
            }
        });

        // Set the menu bar for the frame
        setJMenuBar(menuBar);

    }
}
