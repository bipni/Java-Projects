package MT;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class V_UserRegistration extends JFrame {

	public JLabel email_Label = new JLabel("Email:");
	public JLabel name_Label = new JLabel("Name:");
	public JLabel username_Label = new JLabel("Username:");
	public JLabel password_Label = new JLabel("Password:");
	public JLabel amount_Label = new JLabel("Amount");
	public JTextField email_Text = new JTextField();
	public JTextField name_Text = new JTextField();
	public JTextField username_Text = new JTextField();
	public JTextField password_Text = new JTextField();
	public JTextField amount_Text = new JTextField();
	public JButton add = new JButton("Add");
	public JButton back = new JButton("Back");
	
	V_UserRegistration() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("User Registration");
		setSize(500,350);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		initComponents();
	}

	private void initComponents() {
		
		JPanel p = new JPanel();
		p.setSize(500, 350);
		p.setLayout(null);
		p.setBackground(Color.GRAY);
		this.add(p);
		
		email_Label.setBounds(50, 20, 100, 30);
		name_Label.setBounds(50, 70, 100, 30);
		username_Label.setBounds(50, 120, 100, 30);
		password_Label.setBounds(50, 170, 100, 30);
		amount_Label.setBounds(50, 220,100,30);
		email_Text.setBounds(150, 20, 300, 30);
		name_Text.setBounds(150, 70, 300, 30);
		username_Text.setBounds(150, 120, 300, 30);
		password_Text.setBounds(150, 170, 300, 30);
		amount_Text.setBounds(150, 220, 300, 30);
		add.setBounds(140, 275, 80, 30);
		back.setBounds(270, 275, 80, 30);
		
		p.add(email_Label);
		p.add(name_Label);
		p.add(username_Label);
		p.add(password_Label);
		p.add(amount_Label);
		p.add(email_Text);
		p.add(name_Text);
		p.add(username_Text);
		p.add(password_Text);
		p.add(amount_Text);
		p.add(add);
		p.add(back);
	}
	
	void addButtonListener (ActionListener ae) {
		
		add.addActionListener(ae);
	}
	
	void backButtonListener(ActionListener ae) {
		
		back.addActionListener(ae);
	}
}
