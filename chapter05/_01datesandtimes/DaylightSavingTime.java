package com.oracle.javacert.professional.chapter05._01datesandtimes;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DaylightSavingTime {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2016, Month.MARCH, 13);
		LocalTime time = LocalTime.of(1, 30);
		ZoneId zone = ZoneId.of("US/Eastern");
		ZonedDateTime dateTime = ZonedDateTime.of(date, time, zone);
		
		System.out.println(dateTime);
		
		dateTime = dateTime.plusHours(1);
		
		System.out.println(dateTime);
		
		System.out.println("----------------");
		
		LocalDate date2 = LocalDate.of(2016, Month.NOVEMBER, 6);
		LocalTime time2 = LocalTime.of(1, 30);
		ZoneId zone2 = ZoneId.of("US/Eastern");
		ZonedDateTime dateTime2 = ZonedDateTime.of(date2, time2, zone2);
		
		System.out.println(dateTime2);
		
		dateTime2 = dateTime2.plusHours(1);
		
		System.out.println(dateTime2);
		
		dateTime2 = dateTime2.plusHours(1);
		
		System.out.println(dateTime2);
	}
}
