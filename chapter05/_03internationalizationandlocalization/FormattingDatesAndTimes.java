package com.oracle.javacert.professional.chapter05._03internationalizationandlocalization;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormattingDatesAndTimes {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getMonthValue());
		System.out.println(date.getYear());
		System.out.println(date.getDayOfYear());
		
		System.out.println("-------------------");
		
		LocalTime time = LocalTime.of(11, 12, 34);
		LocalDateTime dt = LocalDateTime.of(date, time);
		System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		
		System.out.println("-------------------");
		
		DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(shortDateTime.format(dt));
		System.out.println(shortDateTime.format(date));
		// System.out.println(shortDateTime.format(time));	// UnsupportedTemporalTypeException
		
		System.out.println("-------------------");
		
		DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		System.out.println(shortF.format(dt));
		System.out.println(mediumF.format(dt));
		
		System.out.println("-------------------");
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd MMMM yyyy, hh:mm");
		System.out.println(dt.format(f));
	}
}
