package com.oracle.javacert.professional.chapter10._01intrordbs;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.oracle.javacert.professional.chapter10.test.JDBCUtil;

public class CreateAnimal {
	private static Connection conn;
	private static Statement stmt;
	
	private static String query = "create table animal ("
			+ "id integer primary key, "
			+ "species_id integer, "
			+ "name varchar(255), "
			+ "date_born timestamp)";
	
	public static void main(String[] args) throws SQLException {
		conn = JDBCUtil.getConnection();
		
		stmt = conn.createStatement();
		
		stmt.executeUpdate(query);
		
		stmt.close();
		conn.close();
	}
}
