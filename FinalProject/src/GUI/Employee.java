package GUI;

import java.awt.BorderLayout;
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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

public class Employee extends JFrame {
    private JTable table1;
    private JTable table2;
    private JPanel repPanel;
    private JPanel tecPanel;
    private JLabel repImageLabel;
    private JLabel tecImageLabel;
    private JLabel messageLabel;

    public Employee() {
        super("Employee Dashboard");

        // ICON
        ImageIcon icon = new ImageIcon("FinalProject\\src\\GUI\\resources\\flowicon.png");
        setIconImage(icon.getImage());

        setSize(600, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // select View message
        JLabel selectViewLabel = new JLabel("Please Select a View from the Menu above");
        JPanel messagePanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        messagePanel.add(selectViewLabel, gbc);
        add(messagePanel, BorderLayout.CENTER);

        // create tables
        table1 = new JTable(6, 4);
        table2 = new JTable(5, 5);

        // Create the panels
        repPanel = new JPanel();
        repPanel.add(
                repImageLabel = new JLabel(new ImageIcon("FinalProject\\src\\GUI\\resources\\Representative.png")));
        repPanel.add(new JScrollPane(table1));
        tecPanel = new JPanel();
        tecPanel.add(tecImageLabel = new JLabel(new ImageIcon("FinalProject\\src\\GUI\\resources\\Technician.png")));
        tecPanel.add(new JScrollPane(table2));

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

        // Select between Representative and Technician
        JMenu selector = new JMenu("Select View");
        menuBar.add(selector);
        JMenuItem rep = new JMenuItem("Representative View");
        JMenuItem tech = new JMenuItem("Technician View");
        selector.add(rep);
        selector.add(tech);
        rep.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                remove(tecPanel);
                remove(messagePanel);
                add(repPanel);
                revalidate();
                repaint();
            }
        });
        tech.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                remove(repPanel);
                remove(messagePanel);
                add(tecPanel);
                revalidate();
                repaint();
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
