package com.oracle.javacert.professional.chapter03._06additionsinjavaeight;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MergeMethod {
	public static void main(String[] args) {
		BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;
		
		Map<String, String> favorites = new HashMap<>();
		favorites.put("Jenny", "Bus Tour");
		favorites.put("Tom", "Tram");
		
		String jenny = favorites.merge("Jenny", "Skyride", mapper);
		String tom = favorites.merge("Tom", "Skyride", mapper);
		
		System.out.println(favorites);
		System.out.println(jenny);
		System.out.println(tom);
		
		System.out.println("----------------");
		
		
		favorites.put("Sam", null);
		favorites.merge("Sam", "Skyride", mapper);
		
		System.out.println(favorites);
		
		System.out.println("----------------");
		
		BiFunction<String, String, String> mapper2 = (v1, v2) -> null;
		Map<String, String> favorites2 = new HashMap<>();
		favorites2.put("Jenny", "Bus Tour");
		favorites2.put("Tom", "Bus Tour");
		
		favorites2.merge("Jenny", "Skyride", mapper2);
		favorites2.merge("Sam", "Skyride", mapper2);
		
		System.out.println(favorites2);
	}
}
