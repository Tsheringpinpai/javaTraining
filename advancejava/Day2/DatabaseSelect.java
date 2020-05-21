import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.database.connection.ConnectionDemo;

public class DatabaseSelect {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {


		ConnectionDemo cd = new ConnectionDemo();
		cd.connect();
		Statement st = cd.con.createStatement();
		ResultSet rs = st.executeQuery("select * from infosys order by id");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " "+rs.getString(2) + " " + rs.getInt(3));
		}

	}
}
