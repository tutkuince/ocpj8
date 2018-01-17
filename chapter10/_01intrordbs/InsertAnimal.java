package com.oracle.javacert.professional.chapter10._01intrordbs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import com.oracle.javacert.professional.chapter10.test.JDBCUtil;

public class InsertAnimal {
	private static Connection conn;
	private static PreparedStatement pstmt;
	private static ResultSet rs;
	
	private static String query = "select * from animal";
	
	public static void main(String[] args) throws SQLException {
		conn = JDBCUtil.getConnection();
		
		pstmt = conn.prepareStatement(query, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		
		rs = pstmt.executeQuery();
		
		rs.moveToInsertRow();
		rs.updateInt("id", 1);
		rs.updateInt("species_id", 1);
		rs.updateString("name", "Elsa");
		rs.updateTimestamp("date_born", Timestamp.valueOf(LocalDateTime.of(2001, 5, 6, 02, 15)));
		rs.insertRow();
		
		rs.moveToInsertRow();
		rs.updateInt("id", 2);
		rs.updateInt("species_id", 2);
		rs.updateString("name", "Zelda");
		rs.updateTimestamp("date_born", Timestamp.valueOf(LocalDateTime.of(2002, 8, 15, 9, 12)));
		rs.insertRow();
		
		rs.moveToInsertRow();
		rs.updateInt("id", 3);
		rs.updateInt("species_id", 1);
		rs.updateString("name", "Ester");
		rs.updateTimestamp("date_born", Timestamp.valueOf(LocalDateTime.of(2002, 9, 9, 10, 36)));
		rs.insertRow();
		
		rs.moveToInsertRow();
		rs.updateInt("id", 4);
		rs.updateInt("species_id", 1);
		rs.updateString("name", "Eddie");
		rs.updateTimestamp("date_born", Timestamp.valueOf(LocalDateTime.of(2010, 6, 8, 1, 25)));
		rs.insertRow();
		
		rs.moveToInsertRow();
		rs.updateInt("id", 5);
		rs.updateInt("species_id", 2);
		rs.updateString("name", "Zoe");
		rs.updateTimestamp("date_born", Timestamp.valueOf(LocalDateTime.of(2005, 11, 12, 3, 44)));
		rs.insertRow();
		
		pstmt.close();
		conn.close();
		
	}
}
