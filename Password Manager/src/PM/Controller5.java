package PM;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class Controller5 {

	private View2 view2;
	private View5 view5;
	
	Controller5(View2 view2, View5 view5) {
		
		this.view2 = view2;
		this.view5 = view5;
		
		this.view5.backButtonListener(new BackButtonListener());
		this.view5.tableListSelectionListener(new TableListSelectionListener());
	}
	
	class BackButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			view5.setVisible(false);
			view2.setVisible(true);
		}
	}
	
	class TableListSelectionListener implements ListSelectionListener {

		String str;
		@Override
		public void valueChanged(ListSelectionEvent e) {
			
			ListSelectionModel lsm = (ListSelectionModel) e.getSource();
			
			int selectedRow = lsm.getMinSelectionIndex();
			int numCols = view5.dataTable.getColumnCount();
			
			DefaultTableModel model = (DefaultTableModel) view5.dataTable.getModel();

	        str = (String) model.getValueAt(selectedRow, 0);
	        int reply = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete??","Message",JOptionPane.YES_NO_OPTION);
	        
	        if(reply == JOptionPane.YES_OPTION) {
	        	Model5 model5 = new Model5(str);
	        	JOptionPane.showMessageDialog(null, "Delete Successfully!");
	        	view5.setVisible(false);
				view2.setVisible(true);
	        }
	        
		}
		
	}
}
