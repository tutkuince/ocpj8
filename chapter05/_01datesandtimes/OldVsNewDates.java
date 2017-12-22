package com.oracle.javacert.professional.chapter05._01datesandtimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class OldVsNewDates {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Creating Dates in Java 7 and Earlier
		Date d1 = new Date();	// Current date
		Date d2 = new Date();	// Current date and time
		
		Calendar c3 = Calendar.getInstance();	// Representing January 1, 2015
		c3.set(2015, Calendar.JANUARY, 1);
		Date jan = c3.getTime();
		
		// Creating Dates in Java 8 and Later
		LocalDate ld1 = LocalDate.now();
		LocalDateTime ldt2 = LocalDateTime.now();
		
		LocalDate ld3 = LocalDate.of(2015, Month.JANUARY, 1);
	}
}
