import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseInsert {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";
		String username = "root";
		String password = "Pinpai.1";
		Connection con = DriverManager.getConnection(url, username, password);
		if(con != null) {
			System.out.println("Connection established");
			Statement stmt = con.createStatement();
			int x = stmt.executeUpdate("insert into infosys values(1023, 'rahul', 20000)");
			if(x!=0) {
				System.out.println("Record inserted");
			}
		}
		
	}


}
