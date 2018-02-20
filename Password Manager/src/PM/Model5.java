package PM;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import com.mysql.jdbc.PreparedStatement;

public class Model5 {

	String str;
	
	private Connection con = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	int i = 0;
	Model5(String str) {
		
		this.str = str;
		try{
			
			final String driver = "com.mysql.jdbc.Driver";
			final String url = "jdbc:mysql://localhost:3306/pwdb";
			String adminName = "root";
			String adminPassword = "";
			
			Class.forName(driver);
			
			try {
				
				con = DriverManager.getConnection(url,adminName, adminPassword);
				String sql = "DELETE FROM passwordmanager WHERE websitename = \"" + this.str + "\"";
				stmt = (PreparedStatement) con.prepareStatement(sql);
				stmt.execute();
				System.out.print(this.str);
			} catch(Exception e) {
				System.out.println(e);
			}
			
			
		}catch(Exception e) {
			
			JOptionPane.showMessageDialog(null, "Database is not found!");
		}
		
	}
}
