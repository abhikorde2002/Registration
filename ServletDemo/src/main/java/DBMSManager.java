import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBMSManager {
	private String url = "jdbc:mysql://localhost:3306/new_schema";
	private String username = "root";
	private String password = "Saurabh@1182";
	private String driver = "com.mysql.cj.jdbc.Driver";
	
	public void LoadDriver(String driver) throws ClassNotFoundException {
		Class.forName(driver);
	}
	
	public Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, username, password);
		}
		catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return con;	
	}

	public String insert(User u1){
		try {
			LoadDriver(driver);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Connection cont = getConnection();
		String qr1 = "insert into userinfo values (?, ?, ?, ?, ?)";
		
		String res = null;
		try {
			PreparedStatement ps1 = cont.prepareStatement(qr1);
			ps1.setString(1, u1.getFname());
			ps1.setString(2, u1.getLname());
			ps1.setString(3, u1.getEmail());
			ps1.setString(4, u1.getPhone());
			ps1.setString(5, u1.getAdrs());
			ps1.executeUpdate();
			
			res = "Data entered successfully.";
			} 
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			res = "Data entry failed.";			
		}
		return res;
	}
}
