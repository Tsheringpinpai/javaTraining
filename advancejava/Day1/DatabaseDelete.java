import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseDelete {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";
		String username = "root";
		String password = "Pinpai.1";
		Connection con = DriverManager.getConnection(url, username, password);
		if(con != null) {
			System.out.println("Connection established");
			Statement stmt = con.createStatement();
			int x = stmt.executeUpdate("delete from infosys where id=1023");
			if(x!=0) {
				System.out.println("Record deleted");
			}
		}
		
	}


}
