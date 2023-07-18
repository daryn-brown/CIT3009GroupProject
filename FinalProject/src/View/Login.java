package View;



import javax.swing.*;

public class Login {
  public Login() {
    JFrame frame = new JFrame("Login Page");

    JLabel idLabel = new JLabel("ID");
    JLabel passwordLabel = new JLabel("Password");
    JTextField id = new JTextField();
    JPasswordField password = new JPasswordField();
    JButton loginButton = new JButton("Login");

    idLabel.setBounds(100, 100, 100, 50);
    passwordLabel.setBounds(100, 200, 100, 50);
    id.setBounds(210, 100, 200, 50);
    password.setBounds(210, 200, 200, 50);
    loginButton.setBounds(150, 300, 200, 50);

    loginButton.addActionListener(e -> {
      String idText = id.getText();
      String passwordText = password.getText();
      System.out.println(idText);
      System.out.println(passwordText);

      new CustomerPage();
    });


    frame.add(idLabel);
    frame.add(passwordLabel);
    frame.add(id);
    frame.add(password);
    frame.add(loginButton);

    frame.setSize(500, 600);

    frame.setLayout(null);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

  }
}