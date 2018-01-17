package com.oracle.javacert.professional.chapter10._01intrordbs;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.oracle.javacert.professional.chapter10.test.JDBCUtil;

public class InsertSpecies {
	private static Connection conn;
	private static Statement stmt;
	
	public static void main(String[] args) throws SQLException {
		conn = JDBCUtil.getConnection();
		
		stmt = conn.createStatement();
		
		System.out.println(stmt.executeUpdate("insert into species values(1, 'African Elephant', 7.5)"));
		System.out.println(stmt.executeUpdate("insert into species values(2, 'Zebra', 1.2)"));
		
		stmt.close();
		conn.close();
	}
}
