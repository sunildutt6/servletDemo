package com.sunil.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountDAO {
	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root",
				"Rashmikala12");
				Statement statement = connection.createStatement();
				ResultSet rs = statement.executeQuery("select * from account");
				
				) {
			System.out.println(connection);
			// int result = statement.executeUpdate("insert into account
			// values(1,'kala','sunil',12000)");
			// System.out.println(result + " rows got inserted");

			// int result = statement.executeUpdate("update account set bal= 50000 where
			// accno = 1");
			// System.out.println(result + " rows got updated");

			// int result = statement.executeUpdate("delete from account where accno = 1");
			// System.out.println(result + " rows got deleted");

			while (rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getInt(4));
				System.out.println("****************");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
