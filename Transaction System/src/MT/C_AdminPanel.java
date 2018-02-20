package MT;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

public class C_AdminPanel {
	
	V_AdminPanel v_AdminPanel;
	V_UserRegistration v_UserRegistration;
	V_UserStatus v_UserStatus;
	
	C_AdminPanel(V_AdminPanel v_AdminPanel, V_UserRegistration v_UserRegistration, V_UserStatus v_UserStatus) {
		
		this.v_AdminPanel = v_AdminPanel;
		this.v_UserRegistration = v_UserRegistration;
		this.v_UserStatus = v_UserStatus;
		
		v_AdminPanel.userRegistrationListener(new UserRegistration());
		v_AdminPanel.userStatusListener(new UserStatus());
		v_AdminPanel.userDeleteListener(new UserDelete());
		v_AdminPanel.exitListener(new exit());
	}

	class UserRegistration implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			
			v_UserRegistration.setVisible(true);
			v_AdminPanel.setVisible(false);
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			
			v_AdminPanel.userRegistration.setBackground(Color.LIGHT_GRAY);
			v_AdminPanel.userRegistration.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		}

		@Override
		public void mouseExited(MouseEvent e) {
			
			v_AdminPanel.userRegistration.setBackground(Color.DARK_GRAY);
		}

		@Override
		public void mousePressed(MouseEvent e) {
			
			v_AdminPanel.userRegistration.setForeground(Color.YELLOW);
			v_AdminPanel.userRegistration.setBackground(Color.BLACK);
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			
			v_AdminPanel.userRegistration.setForeground(Color.WHITE);
			v_AdminPanel.userRegistration.setBackground(Color.DARK_GRAY);
		}
		
	}
	
	class UserStatus implements MouseListener {
		
		@Override
		public void mouseClicked(MouseEvent e) {
			
			M_UserStatus m_UserStatus = new M_UserStatus();
			
			v_UserStatus.setVisible(true);
			v_AdminPanel.setVisible(false);			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			
			v_AdminPanel.userStatus.setBackground(Color.LIGHT_GRAY);
			v_AdminPanel.userStatus.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		}

		@Override
		public void mouseExited(MouseEvent e) {
			
			v_AdminPanel.userStatus.setBackground(Color.DARK_GRAY);
		}

		@Override
		public void mousePressed(MouseEvent e) {
			
			v_AdminPanel.userStatus.setForeground(Color.YELLOW);
			v_AdminPanel.userStatus.setBackground(Color.BLACK);
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			
			v_AdminPanel.userStatus.setForeground(Color.WHITE);
			v_AdminPanel.userStatus.setBackground(Color.DARK_GRAY);
		}
		
	}
	
	class UserDelete implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			
			v_AdminPanel.userDelete.setBackground(Color.LIGHT_GRAY);
			v_AdminPanel.userDelete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		}

		@Override
		public void mouseExited(MouseEvent e) {
			
			v_AdminPanel.userDelete.setBackground(Color.DARK_GRAY);
		}

		@Override
		public void mousePressed(MouseEvent e) {
			
			v_AdminPanel.userDelete.setForeground(Color.YELLOW);
			v_AdminPanel.userDelete.setBackground(Color.BLACK);
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			
			v_AdminPanel.userDelete.setForeground(Color.WHITE);
			v_AdminPanel.userDelete.setBackground(Color.DARK_GRAY);
		}
		
	}
	
	
	class exit implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			
			int reply = JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirmation!", JOptionPane.YES_NO_OPTION);
			
			if(reply == JOptionPane.YES_OPTION) {
				System.exit(0);
			}
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			
			v_AdminPanel.exit.setBackground(Color.LIGHT_GRAY);
			v_AdminPanel.exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		}

		@Override
		public void mouseExited(MouseEvent e) {
			
			v_AdminPanel.exit.setBackground(Color.DARK_GRAY);
		}

		@Override
		public void mousePressed(MouseEvent e) {
			
			v_AdminPanel.exit.setForeground(Color.YELLOW);
			v_AdminPanel.exit.setBackground(Color.BLACK);
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			
			v_AdminPanel.exit.setForeground(Color.WHITE);
			v_AdminPanel.exit.setBackground(Color.DARK_GRAY);
		}
		
	}
}
