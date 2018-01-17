package com.oracle.javacert.professional.chapter10.test.book;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.oracle.javacert.professional.chapter10.test.JDBCUtil;

public class CreateBooks {
	private static Connection conn;
	private static Statement stmt;
	
	public static void main(String[] args) throws SQLException {
		conn = JDBCUtil.getConnection();
		
		String createString = "create table books("
				+ "ISBN VARCHAR(14) not null primary key,\n"
				+ "title varchar(100) not null,\n"
				+ "publishdate date not null,\n"
				+ "edition integer,\n"
				+ "publishername varchar(50),\n"
				+ "description clob(1024m),\n"
				+ "coverpicture blob(1024m),\n"
				+ "stock boolean\n"
				+ ")";
		
		System.out.println(createString);
		
		stmt = conn.createStatement();
		int rowCount = stmt.executeUpdate(createString);
		
		System.out.println(rowCount + " row(s) effected");
		
		conn.close();
		stmt.close();
	}
}
