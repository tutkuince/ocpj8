package com.oracle.javacert.professional.chapter10.test.coffee;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.oracle.javacert.professional.chapter10.test.JDBCUtil;

public class CreateCoffee {
	private static Connection conn;
	private static Statement stmt;

	public static void main(String[] args) {
		conn = JDBCUtil.getConnection();

		String createString = "CREATE TABLE COFFEE(\r\n" + 
				"	COF_NAME VARCHAR(32) NOT NULL PRIMARY KEY,\r\n" + 
				"	SUP_ID INTEGER,\r\n" + 
				"	PRICE NUMERIC(5, 2),\r\n" + 
				"	SALES INTEGER,\r\n" + 
				"	TOTAL NUMERIC(5, 2)\r\n" + 
				")";
		
		// String dropString = "drop table coffee";
		
		System.out.println(createString);
		
		try {
			stmt = conn.createStatement();
			int rowCount = stmt.executeUpdate(createString);
			// int rowCount = stmt.executeUpdate(dropString);
			
			System.out.println("Row count: " + rowCount);
			
			conn.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}
