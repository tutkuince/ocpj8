package com.oracle.javacert.professional.chapter10._05gettingdatafromrs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.oracle.javacert.professional.chapter10.test.JDBCUtil;

public class ReadingResultSetCount {
	public static void main(String[] args) throws SQLException {
		Connection conn = JDBCUtil.getConnection();

		PreparedStatement pstmt = conn.prepareStatement("select count(*) from species");

		ResultSet rs = pstmt.executeQuery();

		if (rs.next()) {
			System.out.println(rs.getInt(1));
			// System.out.println(rs.getInt("count"));	// Throws a SQLException
			// int id = rs.getInt(0);	// BAD CODE
		}
	}
}
