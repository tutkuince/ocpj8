package com.oracle.javacert.professional.chapter10.test.coffee;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.oracle.javacert.professional.chapter10.test.JDBCUtil;

public class InsertCoffee2 {
	private static Connection conn;
	private static Statement stmt;
	private static ResultSet rs;
	
	private static String query = "select * from coffee";
	
	public static void main(String[] args) throws SQLException {
		conn = JDBCUtil.getConnection();
		
		stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		rs = stmt.executeQuery(query);
		
		rs.moveToInsertRow();
		rs.updateString("COF_NAME", "Turkish");
		rs.updateInt("SUP_ID", 1);
		rs.updateFloat("PRICE", 10.99F);
		rs.updateInt("SALES", 0);
		rs.updateInt("TOTAL", 0);
		
		rs.insertRow();
		stmt.close();
		conn.close();
		System.out.println("1 row(s) effected!");
	}
}
