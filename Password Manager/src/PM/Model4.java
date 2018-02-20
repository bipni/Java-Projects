package PM;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import com.mysql.jdbc.PreparedStatement;

public class Model4 {

	public String[] name = new String[100];
	public String[] email = new String[100];
	public String[] username = new String[100];
	public String[] password = new String[100];
	
	private Connection con = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	int i = 0;
	Model4() {
		
		try{
			
			final String driver = "com.mysql.jdbc.Driver";
			final String url = "jdbc:mysql://localhost:3306/pwdb";
			String adminName = "root";
			String adminPassword = "";
			
			Class.forName(driver);
			
			try {
				
				con = DriverManager.getConnection(url,adminName, adminPassword);
				String sql = "SELECT * FROM passwordmanager";
				stmt = (PreparedStatement) con.prepareStatement(sql);
				rs = stmt.executeQuery();
				
				while(rs.next()) {
					
					name[i] = rs.getString("websitename");
					email[i] = rs.getString("email");
					username[i] = rs.getString("username");
					password[i] = rs.getString("password");
					i++;	
				}
				
			} catch(Exception e) {
				System.out.println(e);
			}
			
			
		}catch(Exception e) {
			
			JOptionPane.showMessageDialog(null, "Database is not found!");
		}
		
	}
}
