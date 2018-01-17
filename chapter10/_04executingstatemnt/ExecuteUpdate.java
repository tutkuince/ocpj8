package com.oracle.javacert.professional.chapter10._04executingstatemnt;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.oracle.javacert.professional.chapter10.test.JDBCUtil;

public class ExecuteUpdate {
	public static void main(String[] args) throws SQLException {
		Connection conn = JDBCUtil.getConnection();
		
		Statement stmt = conn.createStatement();
		
		int result = stmt.executeUpdate("insert into species values(3, 'Deer', 3.2)");
		System.out.println(result);	// 1
		
		result = stmt.executeUpdate("update species set name = '' where name = 'None'");
		System.out.println(result);	// 0
		
		result = stmt.executeUpdate("delete from species where id = 3");
		System.out.println(result);	// 1
		
		stmt.close();
		conn.close();
	}
}
