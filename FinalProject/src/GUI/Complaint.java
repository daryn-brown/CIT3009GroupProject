package GUI;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
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

public class Complaint extends JFrame{
	private JTextField message;
	private JComboBox type;
	
	public Complaint() {
		super("Complaint");

        //icon change path if necessary
        ImageIcon icon = new ImageIcon("FinalProject\\src\\GUI\\flowicon.png");
        setIconImage(icon.getImage());

        //window
        setSize(600, 400);
        setLocationRelativeTo(null);

        //combo box label
        JLabel comboBoxLabel = new JLabel("Choose issue type:");

        //combo box
        String[] options = {"Speed", "Connectivity", "Other"};
        JComboBox<String> comboBox = new JComboBox<>(options);
        comboBox.setMaximumSize(comboBox.getPreferredSize());

        //text area label
        JLabel textAreaLabel = new JLabel("Type your complaint here:");

        //text area
        JTextArea textArea = new JTextArea(5, 20);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

	//buttons
    //save
	JButton lodgeButton = new JButton("File Complaint");
	lodgeButton.setBackground(Color.RED);
	lodgeButton.setForeground(Color.WHITE);
	lodgeButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            //call complaint window
        	
        	int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to Submit?");
        	if (result == JOptionPane.YES_OPTION) {
        	    textArea.setText("");
        	}
        }
    });
	
	
	//cancel
	JButton cancelButton = new JButton("Cancel");
	cancelButton.setForeground(Color.white);
	cancelButton.setBackground(Color.DARK_GRAY);
	cancelButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            //call complaint window
        	dispose();
        }
    });

	//button panel
	JPanel buttonPanel = new JPanel();
	buttonPanel.add(lodgeButton);
	buttonPanel.add(cancelButton);

	//layout
	setLayout(new BorderLayout());

	JPanel topPanel = new JPanel();
	topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));

	topPanel.add(comboBoxLabel);
	topPanel.add(comboBox);
	topPanel.add(textAreaLabel);

	//align components to the left
	comboBoxLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
	comboBox.setAlignmentX(Component.LEFT_ALIGNMENT);
	textAreaLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

	add(topPanel, BorderLayout.NORTH);

	//textarea formatting
	JPanel centerPanel = new JPanel();
	centerPanel.setLayout(new GridBagLayout());
	GridBagConstraints gbc = new GridBagConstraints();
	gbc.fill = GridBagConstraints.BOTH;
	gbc.weightx = 0.8;
	gbc.weighty = 0.8;
	centerPanel.add(new JScrollPane(textArea), gbc);
	add(centerPanel, BorderLayout.CENTER);

	add(buttonPanel, BorderLayout.SOUTH);
	
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
    
  //call view all complaints
    JMenu allComp = new JMenu("Previous Complaints");
    menuBar.add(allComp);
    JMenuItem viewAll = new JMenuItem("View Past Complaints");
    allComp.add(viewAll);
    viewAll.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           //call view past complaints
        	String[][] data = {};
        	new PastComplaints(data);
        	//should pass the complaints from logged on the database
        }
    });

    // Add an ActionListener to the "About Us" menu item that shows a message dialog when clicked
    aboutUsMenuItem.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "This is a program created by Group 4.", "About Us", JOptionPane.INFORMATION_MESSAGE);
        }
    });

    // Set the menu bar for the frame
    setJMenuBar(menuBar);
	
	setVisible(true);
	}
}
