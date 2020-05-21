import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";
		String username = "root";
		String password = "Pinpai.1";
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement ps = con.prepareStatement("select * from infosys");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getInt("salary"));
		}

	}

}
