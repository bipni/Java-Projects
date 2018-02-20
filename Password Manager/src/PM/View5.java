package PM;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class View5 extends JFrame {

	private JLabel dataLabel = new JLabel("Select From The Table");
	public JTable dataTable = new JTable();
	private JScrollPane dataScrollPane = new JScrollPane(dataTable);
	public DefaultTableModel defaultTable = new DefaultTableModel();
	private JButton deleteButton = new JButton("Delete");
	private JButton backButton = new JButton("Back");
	String[] columnName = {"Website Name", "Email", "Username", "Password"};
	
	View5() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Password Manager");
		setSize(1000,500);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		initComponents();
	}

	private void initComponents() {
		
		JPanel panel = new JPanel();
		panel.setSize(1000, 500);
		panel.setLayout(null);
		this.add(panel);
		
		dataLabel.setBounds(400, 10, 200, 30);
		dataLabel.setHorizontalAlignment(JLabel.CENTER);
		dataTable.setSelectionBackground(Color.YELLOW);
		dataScrollPane.setBounds(10, 60, 980, 350);
		deleteButton.setBounds(365, 420, 80, 30);
		backButton.setBounds(475, 420, 80, 30);
		
		dataTable.setModel(defaultTable);
		dataTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		dataTable.setFillsViewportHeight(true);
		defaultTable.setColumnIdentifiers(columnName);
		
		panel.add(dataLabel);
		panel.add(dataScrollPane);
		panel.add(deleteButton);
		panel.add(backButton);
	}
	
	void deleteButtonListener(ActionListener al) {
		
		deleteButton.addActionListener(al);
	}
	
	void backButtonListener(ActionListener al) {
		
		backButton.addActionListener(al);
	}
	
	void tableListSelectionListener(ListSelectionListener lsl) {
		
		ListSelectionModel rowSM = dataTable.getSelectionModel();
		
		rowSM.addListSelectionListener(lsl);
	}
}
