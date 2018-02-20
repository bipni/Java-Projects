package MT;

public class MoneyTransaction {

	public static void main(String args[]) {
		
		DatabaseConnection dc = new DatabaseConnection();
		
		V_AdminPanel v_AdminPanel = new V_AdminPanel();
		V_UserRegistration v_UserRegistration = new V_UserRegistration();
		V_UserStatus v_UserStatus = new V_UserStatus();
		
		v_AdminPanel.setVisible(true);
		
		C_AdminPanel c_AdminPanel = new C_AdminPanel(v_AdminPanel, v_UserRegistration, v_UserStatus);
		C_UserRegistration c_UserRegistration = new C_UserRegistration(v_AdminPanel, v_UserRegistration);
	}
}
