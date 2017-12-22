package com.oracle.javacert.professional.chapter05._01datesandtimes;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class InstantClass {
	public static void main(String[] args) throws InterruptedException {
		Instant now = Instant.now();
		Thread.sleep(100);
		Instant later = Instant.now();
		
		Duration duration = Duration.between(now, later);
		System.out.println("duration : " + duration.toMillis());
		
		System.out.println("----------------");
		
		LocalDate date = LocalDate.of(2015, 5, 25);
		LocalTime time = LocalTime.of(11, 55, 00);
		ZoneId zone = ZoneId.of("US/Eastern");
		ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time, zone);
		Instant instant = zonedDateTime.toInstant();
		System.out.println("zonedDateTime : " + zonedDateTime);
		System.out.println("instant : " + instant);
		
		System.out.println("----------------");
		
		Instant nextDay = instant.plus(1, ChronoUnit.DAYS);
		System.out.println("next day : " + nextDay);
		Instant nextHour = instant.plus(1, ChronoUnit.HOURS);
		System.out.println("next hour : " + nextHour);
		Instant nextWeek = instant.plus(1, ChronoUnit.WEEKS);
		System.out.println("next week : " + nextWeek);	// it must be smaller than 1 day // exception
		
		
		
	}
}
