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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Employee extends JFrame {
    private JTable table1;
    private JTable table2;
    private JPanel panel1;
    private JPanel panel2;

    public Employee() {
        super("Employee Dashboard");

        ImageIcon icon = new ImageIcon("FinalProject\\src\\GUI\\resources\\flowicon.png");
        setIconImage(icon.getImage());
        
        setSize(600, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JLabel imageLabel = new JLabel(new ImageIcon("FinalProject\\src\\GUI\\flowicon.png"));

        //create tables
        table1 = new JTable(6,4);
        table2 = new JTable(5,5);

        //Create the panels
        panel1 = new JPanel();
        panel1.add(new JScrollPane(table1));
        panel2 = new JPanel();
        panel2.add(new JScrollPane(table2));

        add(panel1);



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
                remove(panel2);
                add(panel1);
                revalidate();
                repaint();
            }
        });
        tech.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                remove(panel1);
                add(panel2);
                revalidate();
                repaint();
            }
        });

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

    }
}
