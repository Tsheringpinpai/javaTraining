import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InnerJoin {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";
		String username = "root";
		String password = "Pinpai.1";
		Connection con = DriverManager.getConnection(url, username, password);
		if (con != null) {
			System.out.println("Connection established");
		}
		Statement st = con.createStatement();
		ResultSet x = st.executeQuery("select e.name, c.vendor, p.salary from payroll p\r\n"+
				     " inner join company c on p.id = c.id\r\n"+
				     "inner join employee e on p.emp_id=e.emp_id ");

		while(x.next()) {
			
		System.out.println(x.getString(1)+"  "+ x.getString(2)+ " " + x.getInt(3));
		}
	}

}
