package com.oracle.javacert.professional.chapter10.test.coffee;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.oracle.javacert.professional.chapter10.test.JDBCUtil;

public class DeleteCoffee {
	private static Connection conn;
	private static Statement stmt;
	private static ResultSet rs;
	
	private static int count;
	
	private static String query = "SELECT COF_NAME, PRICE FROM COFFEE";
	
	public static void main(String[] args) throws SQLException {
		conn = JDBCUtil.getConnection();
		
		stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		rs = stmt.executeQuery(query);
		System.out.println("Deleting coffees expensive than " + 6);
		
		while(rs.next()) {
			float price = rs.getFloat("price");
			if(price > 6) {
				rs.deleteRow();	// If price is bigger than 6, row will deleted.
				count++;
			}
		}
		conn.close();
		stmt.close();
		System.out.println(count + " row(s) effected!");
	}
}
