package com.oracle.javacert.professional.chapter05._03internationalizationandlocalization;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class FormatNumbers {
	public static void main(String[] args) throws ParseException {
		int attendeesPerYear = 3_200_000;
		int attendeesPerMonth = attendeesPerYear / 12;

		NumberFormat us = NumberFormat.getInstance(Locale.US);
		System.out.println(us.format(attendeesPerMonth));

		NumberFormat g = NumberFormat.getInstance(Locale.GERMAN);
		System.out.println(g.format(attendeesPerMonth));

		NumberFormat ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
		System.out.println(ca.format(attendeesPerMonth));

		System.out.println("------------------------");

		double price = 48;
		NumberFormat us2 = NumberFormat.getCurrencyInstance(Locale.US); // for formatting monetary amounts
		System.out.println(us2.format(price));

		System.out.println("------------------------");

		NumberFormat en = NumberFormat.getInstance(Locale.US);
		NumberFormat fr = NumberFormat.getInstance(Locale.FRANCE);

		String s = "40.55";

		System.out.println(en.parse(s));
		System.out.println(fr.parse(s));

		System.out.println("------------------------");
		
		String amt = "$92,807.99";
		NumberFormat cf = NumberFormat.getCurrencyInstance(Locale.US);
		double value = (Double) cf.parse(amt);
		System.out.println(value);

	}
}
