package PM;

import java.awt.event.ActionListener;

import javax.swing.*;

public class View2 extends JFrame {

	private JButton addButton = new JButton("Add");
	private JButton allButton = new JButton("All");
	private JButton deleteButton = new JButton("Delete");
	private JButton logoutButton = new JButton("Log Out");
	
	View2() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Password Manager");
		setSize(500,500);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		initComponents();
	}

	private void initComponents() {
		
		JPanel panel = new JPanel();
		panel.setSize(500, 500);
		panel.setLayout(null);
		this.add(panel);
		
		addButton.setBounds(200, 50, 100, 50);
		allButton.setBounds(200, 130, 100, 50);
		deleteButton.setBounds(200, 200, 100, 50);
		logoutButton.setBounds(200, 280, 100, 50);
		
		panel.add(addButton);
		panel.add(allButton);
		panel.add(deleteButton);
		panel.add(logoutButton);
	}
	
	void addButtonListener(ActionListener al) {
		addButton.addActionListener(al);
	}
	
	void allButtonListener(ActionListener al) {
		allButton.addActionListener(al);
	}
	
	void deleteButtonListener(ActionListener al) {
		deleteButton.addActionListener(al);
	}
	
	void logoutButtonListener(ActionListener al) {
		logoutButton.addActionListener(al);
	}
}
