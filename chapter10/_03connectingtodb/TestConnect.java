package com.oracle.javacert.professional.chapter10._03connectingtodb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnect {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
//		Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Coffee");
//		System.out.println(conn);
		
//		Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Coffee", "app", "password");
//		System.out.println(conn);
		
		Class.forName("org.apache.derby.jdbc.ClientDriver");	// used in older code before getting a Connection
		Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Coffee", "app", "password");
		System.out.println(conn);
	}
}
