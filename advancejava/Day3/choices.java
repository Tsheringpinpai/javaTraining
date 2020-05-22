package com.trainings.jnit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class choices {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";
		String username = "root";
		String password = "Pinpai.1";
		PreparedStatement ps = null;

		Connection con = DriverManager.getConnection(url, username, password);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice(1.Insert 2.Display 3.Delete)");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			ps = con.prepareStatement("insert into infosys values(?,?,?)");
			ps.setInt(1, 1067);
			ps.setString(2, "mahesh");
			ps.setInt(3, 89000);
			int x = ps.executeUpdate();
			if (x != 0) {
				System.out.println("Record inserted");
			}
			break;
		case 2:
			ps = con.prepareStatement("select * from infosys");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
			}

		}

	}

}
