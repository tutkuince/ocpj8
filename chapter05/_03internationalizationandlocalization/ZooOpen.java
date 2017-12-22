package com.oracle.javacert.professional.chapter05._03internationalizationandlocalization;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

public class ZooOpen {
	public static void main(String[] args) {
		Locale us = new Locale("en", "US");
		Locale france = new Locale("fr", "FR");
		Locale tr = new Locale("tr", "TR");
		Locale ger = new Locale("ger", "GER");
		Locale test = new Locale("test", "TEST");
		
		printProperties(us);
		System.out.println();
		printProperties(france);
		System.out.println();
		printProperties(tr);
		System.out.println();
		printProperties(ger);
		System.out.println();
		printProperties(test);
		
		System.out.println("----------------------");
		
		ResourceBundle rb = ResourceBundle.getBundle("Zoo", us);
		Set<String> keys = rb.keySet();
		keys.stream().map(k -> k + " " + rb.getString(k)).forEach(System.out::println);
		
	}

	private static void printProperties(Locale locale) {
		ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);
		System.out.println(rb.getString("hello"));
		System.out.println(rb.getString("open"));
	}
}
