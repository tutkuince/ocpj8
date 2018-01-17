package com.oracle.javacert.professional.chapter10.test;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtil {
	private static Properties settings = new Properties();
	private static String fileSeparator;
	private static String fileName = "jdbc.properties";

	private static String url;
	private static String username;
	private static String password;
	private static String driver;

	static {
		fileSeparator = System.getProperty("file.separator");

		FileReader in = null;
		String filePath = "src" + fileSeparator + "com" + fileSeparator + "oracle" + fileSeparator + "javacert"
				+ fileSeparator + "professional" + fileSeparator + "chapter10" + fileSeparator + "test" + fileSeparator
				+ "properties" + fileSeparator + fileName;

		try {
			in = new FileReader(filePath);
			settings.load(in);

		} catch (IOException e) {

		}

		url = settings.getProperty("url");
		username = settings.getProperty("username");
		password = settings.getProperty("password");
		driver = settings.getProperty("driver");

	}

	public static void main(String[] args) {
		Connection conn = getConnection();

		if (conn != null)
			System.out.println(conn);
		else
			System.out.println("No connection!");
	}

	public static synchronized Connection getConnection() {
		Connection connection = null;

		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
