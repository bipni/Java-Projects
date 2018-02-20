package PM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Statement;

public class Model3 {

	private String name, email, username, password;
	
	private Connection con = null;;
	private PreparedStatement stmt = null;
	
	Model3(String name, String email, String username, String password) {
		
		this.name = name;
		this.email = email;
		this.username = username;
		this.password = password;
		insertInfo();
	}
	
	public void insertInfo() {
		try{
			
			final String driver = "com.mysql.jdbc.Driver";
			final String url = "jdbc:mysql://localhost:3306/pwdb";
			String adminName = "root";
			String adminPassword = "";
			
			Class.forName(driver);
			
			try {
				
				con = DriverManager.getConnection(url,adminName, adminPassword);
				String sql = "INSERT INTO passwordmanager " + "(websitename, email, username, password) VALUES ('"+name+"', '"+email+"', '"+username+"', '"+password+"')";
				stmt = con.prepareStatement(sql);
				stmt.executeUpdate();
				
			} catch(Exception e) {
				System.out.println(e);
			}
			
		}catch(Exception e) {
			
			JOptionPane.showMessageDialog(null, "Database is not found!");
		}
	
	}
}
