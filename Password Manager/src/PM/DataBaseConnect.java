package PM;

import java.sql.*;

import javax.swing.JOptionPane;

public class DataBaseConnect {

	private Connection con;
	private PreparedStatement create;
	
	
	DataBaseConnect() {
		try{
			
			final String driver = "com.mysql.jdbc.Driver";
			final String url = "jdbc:mysql://localhost:3306/pwdb";
			String adminName = "root";
			String adminPassword = "";
			
			Class.forName(driver);
			
			try {
				
				con = DriverManager.getConnection(url,adminName, adminPassword);
				create = con.prepareStatement("CREATE TABLE IF NOT EXISTS passwordmanager(id int NOT NULL AUTO_INCREMENT, websitename varchar(255),email varchar(255), username varchar(255), password varchar(255), PRIMARY KEY(id))");
				create.executeUpdate();
				
			} catch(Exception e) {
				System.out.println(e);
			}
			
		}catch(Exception e) {
			
			JOptionPane.showMessageDialog(null, "Database is not found!");
		}
	}
}