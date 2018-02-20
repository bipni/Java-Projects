package PM;

import javax.swing.JOptionPane;

public class Model {
	
	private String loginName = "admin";
	private String loginPassword = "admin";
	boolean login;
	
	Model() {
		
	}
	
	Model(String uname, String passWord) {
		
		if(loginName.equals(uname) && loginPassword.equals(passWord)) {
			JOptionPane.showMessageDialog(null, "Login Successfully!");
			login = true;
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect Password!");
			login = false;
		}
	}
}
