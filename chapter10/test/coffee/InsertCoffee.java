package com.oracle.javacert.professional.chapter10.test.coffee;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.oracle.javacert.professional.chapter10.test.JDBCUtil;

public class InsertCoffee {
	
	private static Connection conn;
	private static Statement stmt;
	
	public static void main(String[] args) throws SQLException {
		conn = JDBCUtil.getConnection();
		
		stmt = conn.createStatement();
		
		System.out.println(stmt.executeUpdate("INSERT INTO COFFEE VALUES ('Turkish', 1, 9.99, 0, 0)"));
		System.out.println(stmt.executeUpdate("insert into coffee values('House Blend', 2, 5.99, 0, 0)"));
		System.out.println(stmt.executeUpdate("insert into coffee values('Kenya', 3, 5.99, 0, 0)"));
		System.out.println(stmt.executeUpdate("insert into coffee values('Espresso', 4, 8.99, 0, 0)"));
		System.out.println(stmt.executeUpdate("insert into coffee(COF_NAME, SUP_ID) values('Arabian Roast', 5)"));
		
		stmt.close();
		conn.close();
	}
}
