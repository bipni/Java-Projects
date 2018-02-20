package PM;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller4 {

	private View2 view2;
	private View4 view4;
	
	Controller4(View2 view2, View4 view4) {
		
		this.view2 = view2;
		this.view4 = view4;
		
		this.view4.backButtonListener(new BackButtonListener());
	}
	
	class BackButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			int rowCount = view4.defaultTable.getRowCount();
			
			for(int i = rowCount-1; i>=0; i--) {
				view4.defaultTable.removeRow(i);
			}
			view4.setVisible(false);
			view2.setVisible(true);
		}
		
		
	}
}
