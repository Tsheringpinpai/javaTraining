package com.database.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo {
	public static Connection con = null;

	public static Connection connect() throws ClassNotFoundException, SQLException {
		if (con == null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";
			String username = "root";
			String password = "Pinpai.1";
			con = DriverManager.getConnection(url, username, password);
			if (con != null) {
				System.out.println("Connection established");
			}
		}
		return con;
	}
}
