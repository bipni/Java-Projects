package PM;

import java.awt.event.ActionListener;
import javax.swing.*;


public class View3 extends JFrame {

	private JLabel nameLabel = new JLabel("Website Name: ");
	private JLabel emailLabel = new JLabel("Email:");
	private JLabel userNameLabel = new JLabel("Username:");
	private JLabel passwordLabel = new JLabel("Password:");
	public JTextField nameTextField = new JTextField();
	public JTextField emailTextField = new JTextField();
	public JTextField userNameTextField = new JTextField();
	public JTextField passwordTextField = new JTextField();
	private JButton saveButton = new JButton("Save");
	private JButton backButton = new JButton("Back");
	
	View3() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Password Manager");
		setSize(500,350);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		initComponents();
	}

	private void initComponents() {
		
		JPanel panel = new JPanel();
		panel.setSize(500, 350);
		panel.setLayout(null);
		this.add(panel);
		
		nameLabel.setBounds(50, 20, 100, 30);
		emailLabel.setBounds(50, 70, 100, 30);
		userNameLabel.setBounds(50, 120, 100, 30);
		passwordLabel.setBounds(50, 170, 100, 30);
		nameTextField.setBounds(150, 20, 300, 30);
		emailTextField.setBounds(150, 70, 300, 30);
		userNameTextField.setBounds(150, 120, 300, 30);
		passwordTextField.setBounds(150, 170, 300, 30);
		saveButton.setBounds(140, 260, 80, 30);
		backButton.setBounds(270, 260, 80, 30);
		
		panel.add(nameLabel);
		panel.add(emailLabel);
		panel.add(userNameLabel);
		panel.add(passwordLabel);
		panel.add(nameTextField);
		panel.add(emailTextField);
		panel.add(userNameTextField);
		panel.add(passwordTextField);
		panel.add(saveButton);
		panel.add(backButton);
		
		
	}
	
	void saveButtonListener(ActionListener al) {
		
		saveButton.addActionListener(al);
	}
	
	void backButtonListener(ActionListener al) {
		
		backButton.addActionListener(al);
	}
}
