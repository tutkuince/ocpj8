package com.oracle.javacert.professional.chapter10._04executingstatemnt;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.oracle.javacert.professional.chapter10.test.JDBCUtil;

public class ExecuteQuery {
	public static void main(String[] args) throws SQLException {
		Connection conn = JDBCUtil.getConnection();
		Statement stmt = conn.createStatement();

		ResultSet rs = stmt.executeQuery("select * from species");

		while (rs.next()) {
			String name = rs.getString("name");
			System.out.println("Name: " + name);
		}
		
		// stmt.execute("insert into species values(3, 'Cobra', 1)"); // execute() can insert, update and delete
		// stmt.execute("delete from species where id = 3");
		// stmt.execute("update species set name='Anaconda' where id = 3");
		
	}
}
