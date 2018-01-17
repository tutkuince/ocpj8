package com.oracle.javacert.professional.chapter10._05gettingdatafromrs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.oracle.javacert.professional.chapter10.test.JDBCUtil;

public class GetObjectMethod {
	public static void main(String[] args) throws SQLException {
		Connection conn = JDBCUtil.getConnection();
		
		PreparedStatement pstmt = conn.prepareStatement("select id, name from species");
		
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			Object idField = rs.getObject("id");
			Object nameField = rs.getObject("name");
			
			if(idField instanceof Integer) {
				int id = (Integer) idField;
				System.out.println("id: " + id);
			}
			
			if(nameField instanceof String) {
				String name = (String) nameField;
				System.out.println("name: " + name);
			}
		}
		
	}
}
