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

public class ServiceRequest extends JFrame{
    public ServiceRequest(){
        super("Request Service");

        //ICON
		ImageIcon icon = new ImageIcon("FinalProject\\src\\GUI\\resources\\flowicon.png");
        setIconImage(icon.getImage());
		//Formatting
		JPanel buttonPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

		//Service Request.png
        JLabel imageLabel = new JLabel(new ImageIcon("FinalProject\\src\\GUI\\resources\\Service Request.png"));
        gbc.gridx = 0;
        gbc.gridy = 0;
        buttonPanel.add(imageLabel, gbc);

        //Buttons
        //Request Repair
        JButton repairButton = new JButton("Request Repair");
		repairButton.setToolTipText("Request to repair");
		repairButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
            	JOptionPane.showMessageDialog(null, "Request for repairs has been sent!");
                dispose();
            }
        });
		gbc.gridx = 0;
		gbc.gridy = 1;
		buttonPanel.add(repairButton, gbc);

        //Billing request!
        JButton billingButton = new JButton("Request Bill");
		billingButton.setToolTipText("Request to blank");
		billingButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
            	String reason = JOptionPane.showInputDialog(null, "Please specify the details of the request:", "Billing Request", JOptionPane.QUESTION_MESSAGE);
                dispose();
            }
        });
		gbc.gridx = 0;
		gbc.gridy = 2;
		buttonPanel.add(billingButton, gbc);
        
        //Network Request
        JButton networkButton = new JButton("Network Request");
		networkButton.setToolTipText("Request Network Support");
		networkButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
            	String reason = JOptionPane.showInputDialog(null, "Please specify the details of request:", "Technical/Network Request", JOptionPane.QUESTION_MESSAGE);
                dispose();
            }
        });
		gbc.gridx = 0;
		gbc.gridy = 3;
		buttonPanel.add(networkButton, gbc);

        //Network Request
        JButton internetButton = new JButton("Internet Request");
		networkButton.setToolTipText("Request to blank");
		networkButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
            	String reason = JOptionPane.showInputDialog(null, "Please specify the details of request:", "Internet Support Request", JOptionPane.QUESTION_MESSAGE);
                dispose();
            }
        });
		gbc.gridx = 0;
		gbc.gridy = 4;
		buttonPanel.add(internetButton, gbc);

        //Request Repair
        JButton deleteButton = new JButton("Delete Account");
		repairButton.setToolTipText("Delete account");
		repairButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
            	JOptionPane.showMessageDialog(null, "Account deleted!");
                dispose();
            }
        });
		gbc.gridx = 0;
		gbc.gridy = 1;
		buttonPanel.add(repairButton, gbc);

        //Billing, Technical/Network, Internet, Delete Account, Repairs.
        
        repairButton.setBackground(Color.CYAN);
        repairButton.setForeground(Color.DARK_GRAY);
        billingButton.setBackground(Color.BLUE);
        billingButton.setForeground(Color.WHITE);
        networkButton.setBackground(Color.BLUE);
        networkButton.setForeground(Color.WHITE);

        add(buttonPanel);
        this.setSize(600, 500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
