package com.oracle.javacert.professional.chapter10._06closingdbresources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClosingResources {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:derby://localhost:1527/Coffee";

		try (Connection conn = DriverManager.getConnection(url);				// 3) and then the Collection
				Statement stmt = conn.createStatement();						// 2) followed by the Statement	 !STANDART ORDER TO CLOSE RESOURCES!
				ResultSet rs = stmt.executeQuery("select name from animal")) {	// 1) ResultSet is closed first
													
			while (rs.next()) {
				System.out.println(rs.getString("name"));
			}
		}
	}
}
