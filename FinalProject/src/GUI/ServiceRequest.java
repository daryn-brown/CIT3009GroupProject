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
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ServiceRequest extends JFrame {
    public ServiceRequest() {
        super("Request Service");

        // ICON
        ImageIcon icon = new ImageIcon("FinalProject\\src\\GUI\\resources\\flowicon.png");
        setIconImage(icon.getImage());
        // Formatting
        JPanel buttonPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Service Request.png
        JLabel imageLabel = new JLabel(new ImageIcon("FinalProject\\src\\GUI\\resources\\Service Request.png"));
        gbc.gridx = 0;
        gbc.gridy = 0;
        buttonPanel.add(imageLabel, gbc);

        // Buttons
        // Request Repair
        JButton repairButton = new JButton("Request Repair");
        repairButton.setToolTipText("Request to repair");
        repairButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String reason = JOptionPane.showInputDialog(null, "Please specify the details of request:",
                        "Request Repairs", JOptionPane.QUESTION_MESSAGE);

            }
        });
        gbc.gridx = 0;
        gbc.gridy = 1;
        buttonPanel.add(repairButton, gbc);

        // Billing request
        JButton billingButton = new JButton("Request Bill");
        billingButton.setToolTipText("Request Billing Information");
        billingButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String reason = JOptionPane.showInputDialog(null, "Please specify the details of the request:",
                        "Billing Request", JOptionPane.QUESTION_MESSAGE);

            }
        });
        gbc.gridx = 0;
        gbc.gridy = 2;
        buttonPanel.add(billingButton, gbc);

        // Network Request
        JButton networkButton = new JButton("Network Request");
        networkButton.setToolTipText("Request Network Support");
        networkButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String reason = JOptionPane.showInputDialog(null, "Please specify the details of request:",
                        "Technical/Network Request", JOptionPane.QUESTION_MESSAGE);
            }
        });
        gbc.gridx = 0;
        gbc.gridy = 3;
        buttonPanel.add(networkButton, gbc);

        // Internet Request
        JButton internetButton = new JButton("Internet Request");
        internetButton.setToolTipText("Request Internet help");
        internetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String reason = JOptionPane.showInputDialog(null, "Please specify the details of request:",
                        "Internet Support Request", JOptionPane.QUESTION_MESSAGE);

            }
        });
        gbc.gridx = 0;
        gbc.gridy = 4;
        buttonPanel.add(internetButton, gbc);

        // Delete account
        JButton deleteButton = new JButton("Delete Account");
        deleteButton.setToolTipText("Delete account");
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to Submit?");
                if (result == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "Account deleted!");
                    dispose();
                    new Welcome();
                }
            }
        });
        gbc.gridx = 0;
        gbc.gridy = 5;
        buttonPanel.add(deleteButton, gbc);

        // return
        JButton returnButton = new JButton("Customer Dashboard");
        returnButton.setToolTipText("Return to customer Dashboard");
        returnButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Customer();
            }
        });
        gbc.gridx = 0;
        gbc.gridy = 6;
        buttonPanel.add(returnButton, gbc);

        // Billing, Technical/Network, Internet, Delete Account, Repairs.

        repairButton.setBackground(Color.BLUE);
        repairButton.setForeground(Color.WHITE);
        billingButton.setBackground(Color.BLUE);
        billingButton.setForeground(Color.WHITE);
        networkButton.setBackground(Color.BLUE);
        networkButton.setForeground(Color.WHITE);
        deleteButton.setBackground(Color.RED);
        deleteButton.setForeground(Color.WHITE);
        internetButton.setBackground(Color.BLUE);
        internetButton.setForeground(Color.WHITE);
        returnButton.setBackground(Color.CYAN);
        returnButton.setForeground(Color.DARK_GRAY);

        add(buttonPanel);
        this.setSize(600, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
