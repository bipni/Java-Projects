package PM;

import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

import javax.swing.*;

public class View extends JFrame {

	private JLabel userNameLabel = new JLabel("Username:");
	private JLabel passwordLabel = new JLabel("Password:");
	public JTextField userNameTextField = new JTextField();
	public JPasswordField passwordField = new JPasswordField();
	private JButton loginButton = new JButton("Login");
	private JButton exitButton = new JButton("Exit");
	
	public static String a, b;
	
	View() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Password Manager");
		setSize(500,300);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		initComponents();
	}

	private void initComponents() {
		
		JPanel panel = new JPanel();
		panel.setSize(500, 300);
		panel.setLayout(null);
		this.add(panel);
		
		userNameLabel.setBounds(50, 50, 100, 30);
		passwordLabel.setBounds(50, 110, 100, 30);
		userNameTextField.setBounds(120, 50, 300, 30);
		passwordField.setBounds(120, 110, 300, 30);
		loginButton.setBounds(140, 200, 80, 30);
		exitButton.setBounds(270, 200, 80,30);
		
		panel.add(userNameLabel);
		panel.add(userNameTextField);
		panel.add(passwordLabel);
		panel.add(passwordField);
		panel.add(loginButton);
		panel.add(exitButton);
	}
	
	void loginButtonListener(ActionListener al) {
		loginButton.addActionListener(al);
	}
	
	void exitButtonListener(ActionListener al) {
		exitButton.addActionListener(al);
	}
}
