package com.oracle.javacert.professional.chapter10._01intrordbs;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.oracle.javacert.professional.chapter10.test.JDBCUtil;

public class CreateSpecies {
	private static Connection conn;
	private static PreparedStatement pstmt;
	
	private static String query = "create table species ("
			+ "id integer primary key, "
			+ "name varchar(255) not null, "
			+ "num_acres decimal(5, 2)"
			+ ")";
	
	public static void main(String[] args) throws Exception {
		conn = JDBCUtil.getConnection();
		pstmt = conn.prepareStatement(query);
		
		pstmt.execute();
	}
}
