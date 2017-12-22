package com.oracle.javacert.professional.chapter03._02generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		List names = new ArrayList();
		names.add(new StringBuilder("Tutku"));
		printNames(names);
		
		List<String> names2 = new ArrayList<>();
		// names2.add(new StringBuilder("Tutku")); // DOES NOT COMPILE
		names.add("Tutku");
		printNames2(names2);
	}

	@SuppressWarnings("rawtypes")
	public static void printNames(List list) {
		for (int i = 0; i < list.size(); i++) {
			String name = (String) list.get(i);	// class cast exception
			System.out.println(name);
		}
	}
	
	public static void printNames2(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			String name = (String) list.get(i);	
			System.out.println(name);
		}
	}
}
