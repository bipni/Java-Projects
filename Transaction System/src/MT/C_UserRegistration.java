package MT;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class C_UserRegistration {

	V_UserRegistration v_UserRegistration;
	V_AdminPanel v_AdminPanel;
	
	C_UserRegistration(V_AdminPanel v_AdminPanel, V_UserRegistration v_UserRegistration) {
		
		this.v_AdminPanel = v_AdminPanel;
		this.v_UserRegistration = v_UserRegistration;
		
		v_UserRegistration.addButtonListener(new AddButtonListener());
		v_UserRegistration.backButtonListener(new BackButtonListener());
	}
	
	class AddButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(v_UserRegistration.email_Text.getText().equals("") || v_UserRegistration.name_Text.getText().equals("") || v_UserRegistration.username_Text.getText().equals("") || v_UserRegistration.password_Text.getText().equals("") || v_UserRegistration.amount_Text.getText().equals("")) {
				
				JOptionPane.showMessageDialog(null, "Required All Field!");
			}
			else {
				M_UserRegistration m_UserRegistration = new M_UserRegistration(v_UserRegistration.email_Text.getText(), v_UserRegistration.name_Text.getText(), v_UserRegistration.username_Text.getText(), v_UserRegistration.password_Text.getText(), v_UserRegistration.amount_Text.getText());
				
				JOptionPane.showMessageDialog(null, "User Added to Database.");

				v_AdminPanel.setVisible(true);
				v_UserRegistration.setVisible(false);
			}
		}
		
	}
	
	class BackButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			v_AdminPanel.setVisible(true);
			v_UserRegistration.setVisible(false);
		}
		
	}
}
