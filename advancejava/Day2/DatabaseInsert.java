import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseInsert {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";
		String username = "root";
		String password = "Pinpai.1";
		Connection con = DriverManager.getConnection(url, username, password);
		if (con != null) {
			System.out.println("Connection established");
		}
		Statement st = con.createStatement();

		int x = st.executeUpdate("update infosys set salary=salary+5000 where id in(1023, 12)");

		if (x != 0) {
			System.out.println("Record Updated");
		}

	}
}
