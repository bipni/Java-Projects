package MT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;


public class M_UserStatus {

	private String email = "";
	private String name = "";
	private String username = "";
	private String password = "";
	private String amount = "";
	
	private Connection con = null;
	private PreparedStatement st = null;
	private ResultSet rs = null;
	
	M_UserStatus() {
		
		try {
			
			final String driver = "com.mysql.jdbc.Driver";
			final String url = "jdbc:mysql://localhost:3306/transaction";
			String adminName = "root";
			String adminPassword = "";
			
			Class.forName(driver);
			
			try {
				
				con = DriverManager.getConnection(url,adminName, adminPassword);
				String sql = "SELECT * FROM userlist";
				st = (PreparedStatement) con.prepareStatement(sql);
				rs = st.executeQuery();
				
				while(rs.next()) {
					
					email = rs.getString("email");
					name = rs.getString("name");
					username = rs.getString("username");
					password = rs.getString("password");
					amount = rs.getString("amount");
					System.out.println(email);
				}
			}
			catch(Exception e) {
				JOptionPane.showMessageDialog(null, "There is a problem occur!");
			}
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Database not found!");
		}
	}
}
