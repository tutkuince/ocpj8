package com.oracle.javacert.professional.chapter10._01intrordbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SetupDerbyDB {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:derby://localhost:1527/Coffee";
		
		try(Connection conn = DriverManager.getConnection(url);
				Statement stmt = conn.createStatement()){
			
			stmt.executeUpdate("create table species ("
					+ "id integer primary key, "
					+ "name varchar(255), "
					+ "num_acres decimal(5, 1)"
					+ ")");
			
			stmt.executeUpdate("create table animal ("
					+ "id integer primary key, "
					+ "species_id integer, "
					+ "name varchar(255), "
					+ "date_born timestamp"
					+ ")");
			
			stmt.executeQuery("insert into species values (1, 'African Elephant', 7.5)");
			stmt.executeQuery("insert into species values (2, 'Zebra', 1.2)");

			stmt.execute("insert into animal values (1, 1, 'Elsa', '2001-05-06 02:15')");
			stmt.execute("insert into animal values (2, 2, 'Zelda', '2002-08-15 09:11')");
			stmt.execute("insert into animal values (3, 1, 'Ester', '2002-09-09 10:36')");
			stmt.execute("insert into animal values (4, 1, 'Eddie', '2010-06-08 01:24')");
			stmt.execute("insert into animal values (5, 2, 'Zoe', '2005-11-12 03:44')");
		}
	}
}
