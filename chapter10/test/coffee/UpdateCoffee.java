package com.oracle.javacert.professional.chapter10.test.coffee;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.oracle.javacert.professional.chapter10.test.JDBCUtil;

public class UpdateCoffee {
	private static Connection conn;
	private static Statement stmt;
	private static ResultSet rs;
	
	private static int count = 0;
	
	private static String query = "SELECT COF_NAME, PRICE FROM COFFEE";
	
	public static void main(String[] args) throws SQLException {
		conn = JDBCUtil.getConnection();
		
		stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		rs = stmt.executeQuery(query);
		
		System.out.println("Updating price by + 5");
		
		while(rs.next()) {
			float price = rs.getFloat("price");
			if(!rs.wasNull()) {
				price += 5;
				rs.updateFloat("price", price);	// update
				rs.updateRow();					
				count++;	
			}
		}
		
		System.out.println(count + " row(s) effected!");
	}
}
