package MT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class DatabaseConnection {

	private Connection con = null;
	private PreparedStatement st = null;
	
	DatabaseConnection() {
		
		try {
			
			final String driver = "com.mysql.jdbc.Driver";
			final String url = "jdbc:mysql://localhost:3306/transaction";
			String adminName = "root";
			String adminPass = "";
			
			Class.forName(driver);
			
			try {
				String sql = "CREATE TABLE IF NOT EXISTS userlist(id int NOT NULL AUTO_INCREMENT, email varchar(255),name varchar(255), username varchar(255), password varchar(255), amount varchar(255), PRIMARY KEY(id))";
				
				con = DriverManager.getConnection(url, adminName, adminPass);
				st = con.prepareStatement(sql);
				st.executeUpdate();
				
			}
			catch(Exception e) {
				System.out.println(e);
				JOptionPane.showMessageDialog(null, "There is a problem occur!");
			}
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Database Not Found!");
		}
	}
}
