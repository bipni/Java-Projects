package MT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class M_UserRegistration {
	
	private String email, name, username, password, amount;
	
	private Connection con = null;;
	private PreparedStatement stmt = null;
	
	M_UserRegistration(String email, String name, String username, String password, String amount) {
		
		this.name = name;
		this.email = email;
		this.username = username;
		this.password = password;
		this.amount = amount;
		insertInfo();
	}

	private void insertInfo() {
		
		try {
			
			final String driver = "com.mysql.jdbc.Driver";
			final String url = "jdbc:mysql://localhost:3306/transaction";
			String adminName = "root";
			String adminPassword = "";
			
			Class.forName(driver);
			
			try {
				String sql = "INSERT INTO userlist " + "(email, name, username, password, amount) VALUES ('"+email+"', '"+name+"', '"+username+"', '"+password+"', '"+amount+"')";
				
				con = DriverManager.getConnection(url,adminName, adminPassword);
				stmt = con.prepareStatement(sql);
				stmt.executeUpdate();
			}
			catch(Exception e) {
				
				JOptionPane.showMessageDialog(null, "There is a problem occur!");
			}
		}
		catch(Exception e) {
			
			JOptionPane.showMessageDialog(null, "Database is not found!");
		}
	}
}
