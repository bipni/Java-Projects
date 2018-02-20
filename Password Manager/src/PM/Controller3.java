package PM;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Controller3 {

	private View2 view2;
	private View3 view3;
	
	Controller3(View2 view2, View3 view3) {
		
		this.view2 = view2;
		this.view3 = view3;
		
		this.view3.saveButtonListener(new SaveButtonListener());
		this.view3.backButtonListener(new BackButtonListener());
	}
	
	class SaveButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			Model3 model3 = new Model3(view3.nameTextField.getText(), view3.emailTextField.getText(), view3.userNameTextField.getText(), view3.passwordTextField.getText());
			
			JOptionPane.showMessageDialog(null, "Successfully Saved!");
			view3.nameTextField.setText("");
			view3.emailTextField.setText("");
			view3.userNameTextField.setText("");
			view3.passwordTextField.setText("");
			view3.setVisible(false);
			view2.setVisible(true);
			
		}
		
	}
	
	class BackButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			view3.setVisible(false);
			view2.setVisible(true);
			
		}
		
	}
}
