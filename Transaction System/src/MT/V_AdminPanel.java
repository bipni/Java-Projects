package MT;

import java.awt.Color;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class V_AdminPanel extends JFrame {

	public JLabel userRegistration = new JLabel("User Registration");
	public JLabel userStatus = new JLabel("User Status");
	public JLabel userDelete = new JLabel("Delete User");
	public JLabel exit = new JLabel("Exit");
	
	V_AdminPanel() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Admin Panel");
		setSize(300,400);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		initComponents();
	}

	private void initComponents() {
		
		JPanel p = new JPanel();
		p.setSize(300, 400);
		p.setLayout(null);
		p.setBackground(Color.GRAY);
		this.add(p);
		
		userRegistration.setBounds(90, 50, 120, 50);
		userRegistration.setHorizontalAlignment(JLabel.CENTER);
		userRegistration.setForeground(Color.WHITE);
		userRegistration.setBackground(Color.DARK_GRAY);
		userRegistration.setOpaque(true);
		p.add(userRegistration);
		
		userStatus.setBounds(90, 125, 120, 50);
		userStatus.setHorizontalAlignment(JLabel.CENTER);
		userStatus.setForeground(Color.WHITE);
		userStatus.setBackground(Color.DARK_GRAY);
		userStatus.setOpaque(true);
		p.add(userStatus);
		
		userDelete.setBounds(90, 200, 120, 50);
		userDelete.setHorizontalAlignment(JLabel.CENTER);
		userDelete.setForeground(Color.WHITE);
		userDelete.setBackground(Color.DARK_GRAY);
		userDelete.setOpaque(true);
		p.add(userDelete);
		
		exit.setBounds(90, 275, 120, 50);
		exit.setHorizontalAlignment(JLabel.CENTER);
		exit.setForeground(Color.WHITE);
		exit.setBackground(Color.DARK_GRAY);
		exit.setOpaque(true);
		p.add(exit);
	}
	
	void userRegistrationListener(MouseListener me) {
		
		userRegistration.addMouseListener(me);
	}
	
	void userStatusListener(MouseListener me) {
		
		userStatus.addMouseListener(me);
	}
	
	void userDeleteListener(MouseListener me) {
		
		userDelete.addMouseListener(me);
	}
	
	void exitListener(MouseListener me) {
		
		exit.addMouseListener(me);
	}
	
}
