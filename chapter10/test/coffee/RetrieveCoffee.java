package com.oracle.javacert.professional.chapter10.test.coffee;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.oracle.javacert.professional.chapter10.test.JDBCUtil;

public class RetrieveCoffee {
	private static Connection conn;
	private static Statement stmt;
	private static ResultSet rs;

	private static String query1 = "SELECT COF_NAME, PRICE FROM COFFEE WHERE SUP_ID=1";
	private static String query2 = "select * from coffee";

	public static void main(String[] args) throws SQLException {
		conn = JDBCUtil.getConnection();
		
		//retrieveCoffeeAndPrice();
		
		retrieveAllCoffees();
	}

	public static void retrieveCoffeeAndPrice() throws SQLException {
		System.out.println("\nQuery: " + query1);
		System.out.format("%n %-20s %5s %18s %10s %n", "Coffe Name", "Price", "Coffee Name", "Price");
		System.out.println("---------------------------------------------------------");

		stmt = conn.createStatement();
		rs = stmt.executeQuery(query1);

		while (rs.next()) {
			String s = rs.getString("COF_NAME");
			float n = rs.getFloat("PRICE");
			System.out.format("%-20s %5.2f %5s", s, n, "");

			s = rs.getString(1);
			n = rs.getFloat(2);

			System.out.format("(%9s %13.2f) %n", s, n);
		}
		
		
	}
	
	public static void retrieveAllCoffees() throws SQLException {
		stmt = conn.createStatement();
		rs = stmt.executeQuery(query2);
		
		while(rs.next()) {
			String s = rs.getString("COF_NAME");
			int i1 = rs.getInt("SUP_ID");
			float f1 = rs.getFloat("PRICE");
			if(rs.wasNull())		// If f1 is null, f1 will be -1 (Absence of value)
				f1 = -1;
			int i2 = rs.getInt("SALES");
			if(rs.wasNull())		// If i2 is null, i2 will be -1 (Absence of value)
				i2 = -1;
			float f2 = rs.getFloat("TOTAL");
			if(rs.wasNull())		// If f2 is null, f2 will be -1 (Absence of value)
				f2 = -1;
			
//			s = rs.getString(1);	COLUMN POSITION => It starts from 1 not 0
//			i1 = rs.getInt(2);
//			f1 = rs.getFloat(3);
//			i2 = rs.getInt(4);
//			f2 = rs.getFloat(5);
			
			System.out.println("[Name: " + s + "] [SUP_ID: " + i1 + "] [PRICE: " + f1 + "] [SALES: " + i2 + "] [TOTAL: " + f2 + "]");
		}
		
	}
}
