package com.oracle.javacert.professional.chapter05._01datesandtimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class PeriodClass {
	@SuppressWarnings({ "unused", "static-access" })
	public static void main(String[] args) {
		Period annually = Period.ofYears(1);			// every 1 year
		Period quarterly = Period.ofMonths(3);			// every 3 months
		Period everyThreeWeeks = Period.ofWeeks(3);		// every 3 weeks
		Period everyOtherDay = Period.ofDays(2);		// every 2 days
		Period everyYearAndWeek = Period.of(1, 0, 7);	// every year and 7 days
		
		
		LocalDateTime dt = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
		Period wrong1 = Period.ofDays(1).ofYears(2); // every 2 years
		dt = dt.minus(wrong1);
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(f.format(dt));
		
		Period wrong2 = Period.ofYears(1);
		wrong2 = Period.ofWeeks(1);
		
		System.out.println(Period.of(1, 2, 3));
		
		System.out.println("--------------------------");
		
		LocalDate date = LocalDate.of(2015, 1, 20);
		LocalTime time = LocalTime.of(6, 15);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		Period period = Period.ofMonths(1);
		System.out.println(date.plus(period));
		System.out.println(dateTime.plus(period));
		// System.out.println(time.plus(period));	// UnsupportedTemporalTypeException
	}
}
