package PM;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Controller2 {

	private View view;
	private View2 view2;
	private View3 view3;
	private View4 view4;
	private View5 view5;
	
	Controller2(View view, View2 view2, View3 view3, View4 view4, View5 view5/*, Model4 model4*/) {
		
		this.view = view;
		this.view2 = view2;
		this.view3 = view3;
		this.view4 = view4;
		this.view5 = view5;
		
		this.view2.addButtonListener(new AddButtonListener());
		this.view2.allButtonListener(new AllButtonListener());
		this.view2.deleteButtonListener(new DeleteButtonListener());
		this.view2.logoutButtonListener(new LogoutButtonListener());
	}
	
	class AddButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			view2.setVisible(false);
			view3.setVisible(true);
		}
		
	}
	
	class AllButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Model4 model4 = new Model4();
			for(int k = 0; k<model4.i;k++) {
				view4.defaultTable.addRow(new Object[] {model4.name[k], model4.email[k], model4.username[k], model4.password[k]});
			}
			view4.setVisible(true);
			view2.setVisible(false);
			
		}		
	}
	
	class DeleteButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Model4 model4 = new Model4();
			for(int k = 0; k<model4.i;k++) {
				view5.defaultTable.addRow(new Object[] {model4.name[k], model4.email[k], model4.username[k], model4.password[k]});
			}
			
			
			
			view5.setVisible(true);
			view2.setVisible(false);
			
		}
		
	}
	
	class LogoutButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			int reply = JOptionPane.showConfirmDialog(null, "Are you sure you want to log out??","Message",JOptionPane.YES_NO_OPTION);

	        if(reply==JOptionPane.YES_OPTION)
	        {
	        	view2.setVisible(false);
				view.setVisible(true);
	        }
		}
		
	}
}
