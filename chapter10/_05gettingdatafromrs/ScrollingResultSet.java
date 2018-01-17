package com.oracle.javacert.professional.chapter10._05gettingdatafromrs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.oracle.javacert.professional.chapter10.test.JDBCUtil;

public class ScrollingResultSet {
	public static void main(String[] args) throws SQLException {
		Connection conn = JDBCUtil.getConnection();
		
		PreparedStatement pstmt = conn.prepareStatement("select id from species order by id", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		
		ResultSet rs = pstmt.executeQuery();
		
		rs.afterLast();
		System.out.println(rs.previous());	// true
		System.out.println(rs.getInt(1));	// 3 is last
		System.out.println(rs.previous());	// true
		System.out.println(rs.getInt(1));	// 2
		
		System.out.println(rs.first());		// true
		System.out.println(rs.getInt(1));	// 1 is first
		
		// rs.beforeFirst();
		// System.out.println(rs.getInt(1));	Throws SQLException
		
		System.out.println("-----------------------");
		
		// System.out.println(rs.absolute(0)); absolute(0) is before than first row.
		System.out.println(rs.absolute(1));
		System.out.println(rs.getInt(1));
		
		System.out.println("-----------------------");
		
		System.out.println(rs.absolute(-1));	// absolute(-1) is last. counting from the end of the ResultSet rather tham from the beginning.
		System.out.println(rs.getInt(1));
		
		System.out.println("-----------------------");
		
		System.out.println("first: " + rs.first());
		System.out.println("first: " + rs.getInt(1));
		
		System.out.println(rs.relative(2));
		System.out.println(rs.getInt(1));
		System.out.println();
		System.out.println(rs.relative(-1));
		System.out.println(rs.getInt(1));
		System.out.println(rs.relative(-1));
		System.out.println(rs.getInt(1));
		System.out.println(rs.relative(2));
		System.out.println(rs.getInt(1));
		System.out.println(rs.relative(-2));
		System.out.println(rs.getInt(1));
	}
}
