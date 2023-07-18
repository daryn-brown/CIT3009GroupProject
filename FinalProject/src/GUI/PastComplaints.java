package GUI;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class PastComplaints extends JFrame{
	
	private JTable table;
	
	public PastComplaints(String[][] data) {
		super("Past Complaints");

		ImageIcon icon = new ImageIcon("FinalProject\\src\\GUI\\resources\\flowicon.png");
        setIconImage(icon.getImage());
		
		String[] columnNames = {"Complaint ID", "Complaint Type", "Details", "Issue ID"};
		
		table = new JTable(data, columnNames);
		table.setBounds(getBounds());
		
		JScrollPane sp = new JScrollPane(table);
		add(sp);
		
		setSize(600, 500);
		setLocationRelativeTo(null);
		setVisible(true);
	}

}
