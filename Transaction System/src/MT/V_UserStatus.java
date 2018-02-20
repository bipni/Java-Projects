package MT;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class V_UserStatus extends JFrame {

	public JPanel p = new JPanel();
	public JScrollPane scroll = new JScrollPane(p);
	public JLabel status = new JLabel("User Information");
	
	V_UserStatus() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("User Status");
		setSize(500,500);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		initComponents();
	}

	private void initComponents() {
		
		p.setLayout(null);
		
		status.setBounds(200, 5, 100, 20);
		status.setHorizontalAlignment(JLabel.CENTER);
		scroll.setBounds(5, 40, 485, 425);
		this.add(scroll);
		this.add(status);
	}
}
