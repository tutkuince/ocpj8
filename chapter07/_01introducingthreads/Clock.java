package com.oracle.javacert.professional.chapter07._01introducingthreads;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Clock extends Thread {
	public static void main(String[] args) {
		Clock clock = new Clock();
		clock.start();
	}

	@Override
	public void run() {
		while (true) {
			showClock();
			long start = System.currentTimeMillis();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
			long end = System.currentTimeMillis();
			System.out.println("Period : " + (end - start));
		}
	}

	public void showClock() {
		LocalDateTime dateTime = LocalDateTime.now();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		
		System.out.println(dtf.format(dateTime));
	}
}
