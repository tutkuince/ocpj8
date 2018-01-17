package com.oracle.javacert.professional.chapter10.test.book;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.oracle.javacert.professional.chapter10.test.JDBCUtil;

public class InsertBook {
	private static Connection conn;
	private static Statement stmt;
	
	private static String insertBook1 = "insert into"
			+ " books(isbn, title, publishdate, edition, publishername, description, stock)"
			+ " values('978-0132761697', 'The Java Tutorial', '2013-09-09', 5, 'Tutku Ince', 'Become a Java Software Engineer', true)";
	private static String insertBook2 = "insert into"
			+ " books(isbn, title, publishdate, edition, publishername, description, stock)"
			+ " values('351-1032761694', 'Amazon Web Services', '2016-03-03', 2, 'Tutku Ince', 'How to use aws', true)";
	
	public static void main(String[] args) throws SQLException {
		conn = JDBCUtil.getConnection();
		
		stmt = conn.createStatement();
		
		int rowCount = 0;
		
		rowCount += stmt.executeUpdate(insertBook1);
		
		rowCount += stmt.executeUpdate(insertBook2);
		
		conn.close();
		stmt.close();
		
		System.out.println(rowCount + " row(s) effected");
	}
}
