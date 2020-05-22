package com.trainings.jnit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class choicesTask {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";
		String username = "root";
		String password = "Pinpai.1";
		PreparedStatement ps = null;

		Connection con = DriverManager.getConnection(url, username, password);
		String next1 = "";
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the choice(1.Insert 2.Display 3.Delete 4.Update)");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the choice 1.all columns 2. particular column(id, salary)");
				int option = sc.nextInt();
				switch (option) {
				case 1:

					ps = con.prepareStatement("insert into infosys values(?,?,?)");
					System.out.println("Enter id, name and salary:");
					int val = sc.nextInt();
					String val1 = sc.next();
					int val2 = sc.nextInt();
					ps.setInt(1, val);
					ps.setString(2, val1);
					ps.setInt(3, val2);
					int x = ps.executeUpdate();
					if (x != 0) {
						System.out.println("Record inserted");
					}
					break;
				case 2:
					ps = con.prepareStatement("insert into infosys (id, salary) values (?,?)");
					System.out.println("Enter the id and salary: ");
					int val3 = sc.nextInt();
					int val4 = sc.nextInt();
					ps.setInt(1, val3);
					ps.setInt(2, val4);
					int executeUpdate = ps.executeUpdate();
					if (executeUpdate != 0) {
						System.out.println("Record insert on id and salary");
					}
					break;

				}

				break;
			case 2:
				System.out.println("Enter the choice (1. All rows and all columns 2. Particular row(id search))");
				int nextInt = sc.nextInt();
				switch (nextInt) {
				case 1:
					ps = con.prepareStatement("select * from infosys");
					ResultSet rs = ps.executeQuery();
					while (rs.next()) {
						System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
					}
					break;
				case 2:
					ps = con.prepareStatement("select * from infosys where id=?");
					System.out.println("Enter the id: ");
					int val5 = sc.nextInt();
					ps.setInt(1, val5);
					ResultSet rst = ps.executeQuery();
					while (rst.next()) {
						System.out.println(rst.getInt(1) + " " + rst.getString(2) + " " + rst.getInt(3));
					}
					break;

				}

				break;
			case 3:
				System.out.println("Enter the choice (1. All rows 2. Particular row(id))");
				int nextInt2 = sc.nextInt();
				switch (nextInt2) {
				case 1:
					ps = con.prepareStatement("delete from infosys");
					ps.executeUpdate();
					break;
				case 2:
					ps = con.prepareStatement("delete from infosys where id=?");
					System.out.println("Enter the id");
					int val6 = sc.nextInt();
					ps.setInt(1, val6);
					ps.executeUpdate();
					break;
				}
				break;
			case 4:
				System.out.println("Enter the choice (1. Name 2. Salary)");
				int nextInt3 = sc.nextInt();
				switch (nextInt3) {
				case 1:
					ps = con.prepareStatement("update infosys set name=? where id=?");
					System.out.println("Enter the name and id");
					String val7 = sc.next();
					int val8 = sc.nextInt();
					ps.setString(1, val7);
					ps.setInt(2, val8);
					ps.executeUpdate();
					break;
				case 2:
					ps = con.prepareStatement("update infosys set salary=? where id=?");
					System.out.println("Enter the salary and id");
					int val9 = sc.nextInt();
					int val10 = sc.nextInt();
					ps.setInt(1, val9);
					ps.setInt(2, val10);
					ps.executeUpdate();
					break;
				}
				break;

			}
			System.out.println("Do you want to continue (y/n)");
			next1 = sc.next();

		} while (next1.equals("y"));

	}

}
