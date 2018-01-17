package com.oracle.javacert.professional.chapter10._02interfacesofjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyFirstDBConnection {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:derby://localhost:1527/Coffee";

		try (Connection conn = DriverManager.getConnection(url);	// communicate with db
				Statement stmt = conn.createStatement();			// run the sql
				ResultSet rs = stmt.executeQuery("select name from animal")) {	// knows what was returned by a SELECT query
			
			while(rs.next()) {
				System.out.println(rs.getString(1));
			}
		}
	}
}
