package com.oracle.javacert.professional.chapter05._01datesandtimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DatesAndTimes {
	public static void main(String[] args) {
		System.out.println("LocalTime : " + LocalTime.now());
		System.out.println("LocalDate : " + LocalDate.now());
		System.out.println("LocalDateTime : " + LocalDateTime.now());
		System.out.println("ZonedDateTime : " + ZonedDateTime.now());
		
		
		
		LocalDate date1 = LocalDate.of(2017, Month.JANUARY, 11);
		LocalDate date2 = LocalDate.of(2017, 1, 11);
		System.out.println("date1 == date2 : " + (date1 == date2));
		
		System.out.println("----------------------");
		
		Month month = Month.JANUARY;
		// boolean b1 = month == 1;	// Month is an enum. You can't compare enum with primitive
		boolean b1 = month.ordinal() == 0;
		System.out.println("month.ordinal() == 0 : " + b1);
		boolean b2 = month == Month.JANUARY;
		System.out.println(b2);
		
		System.out.println("----------------------");
		
		LocalTime time1 = LocalTime.of(6, 15);
		LocalTime time2 = LocalTime.of(6, 15, 30);
		LocalTime time3 = LocalTime.of(6, 15, 30, 200);
		System.out.println("time1 " + time1);
		System.out.println("time2 " + time2);
		System.out.println("time3 " + time3);
		
		System.out.println("----------------------");
		
		LocalDateTime dateTime1 = LocalDateTime.of(2017, Month.JANUARY, 20, 6, 15, 30);
		LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
		System.out.println("dateTime1 : " + dateTime1);
		System.out.println("dateTime2 : " + dateTime2);
		
		System.out.println("----------------------");
		
		ZoneId zone = ZoneId.of("Asia/Istanbul");
		ZonedDateTime zoned1 = ZonedDateTime.of(2017, 1, 20, 6, 15, 30, 200, zone);
		ZonedDateTime zoned2 = ZonedDateTime.of(date1, time1, zone);
		ZonedDateTime zoned3 = ZonedDateTime.of(dateTime1, zone);
		System.out.println("zoned1 : " + zoned1);
		System.out.println("zoned2 : " + zoned2);
		System.out.println("zoned3 : " + zoned3);
		
		System.out.println("----------------------");
		
		System.out.println("Default ZoneId : " + ZoneId.systemDefault()); // Default ZoneId
		
		System.out.println("----------------------");
		
		ZoneId.getAvailableZoneIds().stream().filter(z -> z.contains("US") || z.contains("America")).sorted().forEach(System.out::println);
	}
}
