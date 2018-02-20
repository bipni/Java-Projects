package PM;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;

public class Controller {

	private View view;
	private View2 view2;
	
	
	Controller(View view, View2 view2) {
		
		this.view = view;
		this.view2 = view2;
		
		this.view.loginButtonListener(new LoginButtonListener());
		this.view.exitButtonListener(new ExitButtonListener());
	}
	
	class ExitButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			int reply = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit??","Message",JOptionPane.YES_NO_OPTION);

	        if(reply==JOptionPane.YES_OPTION)
	        {
	            System.exit(0);
	        }
		}
	}
	
	class LoginButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			Model model = new Model(view.userNameTextField.getText(), view.passwordField.getText());
			
			if(model.login == true) {
				view.userNameTextField.setText("");
				view.passwordField.setText("");
				view.setVisible(false);
				view2.setVisible(true);
			}
		}
		
	}
	
}
