package com.oracle.javacert.professional.chapter10._05gettingdatafromrs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.oracle.javacert.professional.chapter10.test.JDBCUtil;

public class ReadingResultSet {
	public static void main(String[] args) throws SQLException {
		Connection conn = JDBCUtil.getConnection();
		
		String query = "select id, name from species";
		
		PreparedStatement pstmt = conn.prepareStatement(query);
		
		Map<Integer, String> idToNameMap = new HashMap<>();
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			// int id = rs.getInt(1);
			// String name = rs.getString(2);
			int id = rs.getInt("id");
			String name = rs.getString("name");
			idToNameMap.put(id, name);
		}
		
		System.out.println(idToNameMap);
	}
}
