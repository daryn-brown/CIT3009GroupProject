package View;


import javax.swing.JButton;
import javax.swing.JFrame;

public class Front {
  public Front() {
    JFrame frame = new JFrame("Group Project");

    JButton customerButton = new JButton("Customer Login");
    JButton employeeButton = new JButton("Employee Login");

    customerButton.setBounds(100, 100, 200, 50);
    employeeButton.setBounds(100, 200, 200, 50);

    customerButton.addActionListener(e -> {
      
      new Login();
    });

    frame.add(customerButton);
    frame.add(employeeButton);

    frame.setSize(400, 400);
    frame.setLayout(null);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }
}
