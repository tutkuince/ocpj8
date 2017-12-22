package com.oracle.javacert.professional.chapter05._01datesandtimes;

import java.time.ZoneId;

public class FindingTimeZone {
	public static void main(String[] args) {
		ZoneId.getAvailableZoneIds().stream().filter(z -> z.contains("US") || z.contains("America")).sorted().forEach(System.out::println);
	}
}
