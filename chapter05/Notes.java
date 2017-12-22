package com.oracle.javacert.professional.chapter05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Notes {
	public static void main(String[] args) {
		LocalDate date = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
	}
}
