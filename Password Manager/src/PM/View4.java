package PM;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class View4 extends JFrame {

	private JLabel dataLabel = new JLabel("All Password Data");
	private JTable dataTable = new JTable();
	private JScrollPane dataScrollPane = new JScrollPane(dataTable);
	public JButton backButton = new JButton("Back");
	public DefaultTableModel defaultTable = new DefaultTableModel();
	String[] columnName = {"Website Name", "Email", "Username", "Password"};
	
	View4() {
		
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
		
		dataTable.setModel(defaultTable);
		dataTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		dataTable.setFillsViewportHeight(true);
		defaultTable.setColumnIdentifiers(columnName);
		
		dataTable.setSelectionBackground(Color.YELLOW);
		dataScrollPane.setBounds(10, 60, 980, 350);
		backButton.setBounds(460, 420, 80, 30);
		
		panel.add(dataLabel);
		panel.add(dataScrollPane);
		panel.add(backButton);

	}
	
	public void backButtonListener(ActionListener al) {
		
		backButton.addActionListener(al);
	}
}
