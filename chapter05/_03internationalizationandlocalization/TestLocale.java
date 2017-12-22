package com.oracle.javacert.professional.chapter05._03internationalizationandlocalization;

import java.util.Locale;

public class TestLocale {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Locale locale = Locale.getDefault();
		System.out.println(locale); // using English and are sitting in the United States

		System.out.println("-------------");

		System.out.println(Locale.GERMAN);
		System.out.println(Locale.GERMANY);

		System.out.println("-------------");

		System.out.println(new Locale("tr"));
		System.out.println(new Locale("tr", "TR"));

		System.out.println("-------------");

		Locale l1 = new Locale.Builder().setLanguage("tr").setRegion("TR").build();
		Locale l2 = new Locale.Builder().setRegion("TR").setLanguage("tr").build();
		
		System.out.println("-------------");
		
		System.out.println(Locale.getDefault());
		Locale locale2 = new Locale("tr");
		Locale.setDefault(locale2);
		System.out.println(Locale.getDefault());
	}
}
