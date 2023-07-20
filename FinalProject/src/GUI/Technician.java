package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

public class Technician extends JFrame {

    private JLabel selectViewLabel;
    private JTable table;
    private JScrollPane scrollPane;
    private GridBagConstraints gbc;

    public Technician() {
        super("Technician Dashboard");

        // ICON
        ImageIcon icon = new ImageIcon("FinalProject\\src\\GUI\\resources\\flowicon.png");
        setIconImage(icon.getImage());

        // Formatting
        setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // graphics icon
        JLabel imageLabel = new JLabel(new ImageIcon("FinalProject\\src\\GUI\\resources\\Technician.png"));
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(imageLabel, gbc);

        // select View message
        selectViewLabel = new JLabel("Please Select a View from the Menu above");

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(selectViewLabel, gbc);

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
        JMenuItem view1 = new JMenuItem("Customer Complaints");
        JMenuItem view2 = new JMenuItem("View Specific Complaint");
        selector.add(view1);
        selector.add(view2);
        view1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // view 1
                // Remove select view label
                selectViewLabel.setVisible(false);
                if (scrollPane != null) {
                    remove(scrollPane);
                }
                gbc.insets = new Insets(5, 5, 5, 5);
                gbc.fill = GridBagConstraints.BOTH;
                gbc.weightx = 1;
                gbc.weighty = 1;
                // Create column names for the table
                String[] columnNames = { "Complaint ID", "Complaint Type", "Complaint Details", "Issue ID" };

                // Create a table model and set the column names
                DefaultTableModel model = new DefaultTableModel(columnNames, 0);

                // Create a new JTable with the table model
                table = new JTable(model);

                // Create a new JScrollPane to hold the table
                scrollPane = new JScrollPane(table);

                // Add the scroll pane to the frame
                gbc.gridx = 0;
                gbc.gridy = 1;
                add(scrollPane, gbc);

                // Repaint the frame
                revalidate();
                repaint();
            }
        });
        view2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // view 2
                // Remove select view label and scroll pane from option 1 if they exist
                selectViewLabel.setVisible(false);
                if (scrollPane != null) {
                    remove(scrollPane);
                }
                gbc.insets = new Insets(5, 5, 5, 5);
                gbc.fill = GridBagConstraints.BOTH;
                gbc.weightx = 1;
                gbc.weighty = 1;
                // Create column names for the table
                String[] columnNames = { "Customer ID", "First Name", "Last Name", "Email Address", "Number",
                        "Type of Issue", "Details" };

                // Create a table model and set the column names
                DefaultTableModel model = new DefaultTableModel(columnNames, 0);

                // Create a new JTable with the table model
                table = new JTable(model);

                // Create a new JScrollPane to hold the table
                scrollPane = new JScrollPane(table);

                // Add the scroll pane to the frame
                gbc.gridx = 0;
                gbc.gridy = 1;
                add(scrollPane, gbc);

                // Repaint the frame
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

        // window
        setSize(600, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

    }
}
