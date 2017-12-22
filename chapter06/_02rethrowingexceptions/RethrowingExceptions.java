package com.oracle.javacert.professional.chapter06._02rethrowingexceptions;

import java.sql.SQLException;
import java.time.format.DateTimeParseException;

public class RethrowingExceptions {
	public void parseData() throws SQLException, DateTimeParseException{
		
	}
	
	public void multiCatch() throws SQLException, DateTimeParseException{
		try {
			parseData();
		} catch (SQLException | DateTimeParseException e) {
			System.err.println(e);
			throw e;
		}
	}
	
	public void rethrowing() throws SQLException, DateTimeParseException{
		try {
			parseData();
		} catch (Exception e) {
			System.err.println(e);
			throw e;
		}
	}
}
