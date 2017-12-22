package com.oracle.javacert.professional.chapter05._01datesandtimes;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationClass {
	public static void main(String[] args) {
		Duration daily = Duration.ofDays(1);
		Duration hourly = Duration.ofHours(1);
		Duration everyMinute = Duration.ofMinutes(1);
		Duration everyTenSecond = Duration.ofSeconds(10);
		Duration everyMilli = Duration.ofMillis(1);
		Duration everyNano = Duration.ofNanos(1);
		
		System.out.println("daily : " + daily);
		System.out.println("hourly : " + hourly);
		System.out.println("everyMinute : " + everyMinute);
		System.out.println("everyTenSeconds : " + everyTenSecond);
		System.out.println("everyMilli : " + everyMilli);
		System.out.println("everyNano : " + everyNano);
		
		System.out.println("----------------------");
		
		Duration daily2 = Duration.of(1, ChronoUnit.DAYS);
		Duration hourly2 = Duration.of(1, ChronoUnit.HOURS);
		Duration everyMinute2 = Duration.of(1, ChronoUnit.MINUTES);
		Duration everyTenSecond2 = Duration.of(60, ChronoUnit.SECONDS);
		Duration everyMilli2 = Duration.of(1, ChronoUnit.MILLIS);
		Duration everyNano2 = Duration.of(1, ChronoUnit.NANOS);
		
		System.out.println("daily : " + daily2);
		System.out.println("hourly : " + hourly2);
		System.out.println("everyMinute : " + everyMinute2);
		System.out.println("everyTenSeconds : " + everyTenSecond2);
		System.out.println("everyMilli : " + everyMilli2);
		System.out.println("everyNano : " + everyNano2);
		
		System.out.println(Duration.of(1, ChronoUnit.HALF_DAYS));	// 12 hours
		
		System.out.println("----------------------");
		
		LocalTime one = LocalTime.of(5, 15);
		LocalTime two = LocalTime.of(6, 30);
		LocalDate date = LocalDate.of(2016, 1, 20);
		
		System.out.println(ChronoUnit.HOURS.between(one, two));
		System.out.println(ChronoUnit.MINUTES.between(one, two));
		System.out.println(ChronoUnit.MINUTES.between(one, date));	// DateTimeException
	}
}
