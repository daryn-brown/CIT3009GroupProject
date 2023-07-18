package View;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class CustomerPage {

    public CustomerPage() {
        
        JFrame frame = new JFrame("Customer Page");

        JButton complaintButton = new JButton("Lodge Complaint");
        JButton queryButton = new JButton("Make Query");
        JButton serviceButton = new JButton("Request Service");


        complaintButton.setBounds(100, 100, 200, 50);
        queryButton.setBounds(100, 200, 200, 50);
        serviceButton.setBounds(100, 300, 200, 50);

        complaintButton.addActionListener(e -> {
            JFrame complaintFrame = new JFrame("Lodge Complaint");
            JComboBox<String> complaintType = new JComboBox<String>();
            complaintType.addItem("Electricity");
            complaintType.addItem("Water");
            complaintType.addItem("Gas");
            JTextArea complaintDescription = new JTextArea();

            JLabel complaintTypeLabel = new JLabel("Complaint Type");
            JLabel complaintDescriptionLabel = new JLabel("Complaint Description");
            

            JButton submitButton = new JButton("Submit");


            submitButton.addActionListener(e1 -> {
                String complaintTypeText = (String) complaintType.getSelectedItem();
                System.out.println(complaintTypeText);
            });

            complaintTypeLabel.setBounds(100, 100, 200, 50);
            complaintDescriptionLabel.setBounds(100, 200, 200, 50);
            complaintType.setBounds(250, 100, 200, 50);
            complaintDescription.setBounds(250, 200, 200, 200);
            submitButton.setBounds(150, 450, 200, 50);

            complaintFrame.add(complaintTypeLabel);
            complaintFrame.add(complaintDescriptionLabel);
            complaintFrame.add(complaintType);  
            complaintFrame.add(complaintDescription);
            complaintFrame.add(submitButton);

            complaintFrame.setSize(600, 700);
            complaintFrame.setLayout(null);
            complaintFrame.setVisible(true);
            complaintFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);       
        });

        queryButton.addActionListener(e -> {
          
        });

        serviceButton.addActionListener(e -> {
            
        });

        frame.add(complaintButton);
        frame.add(queryButton);
        frame.add(serviceButton);

        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


    }
    
}
