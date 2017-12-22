package com.oracle.javacert.professional.chapter07._05parallelstreams;

import java.util.Arrays;

public class IndependentOperations {
	public static void main(String[] args) {
		
		Arrays.asList("jackal", "kangaroo", "lemur")
		.parallelStream()
		.map(s -> s.toUpperCase())
		.forEach(s -> System.out.println(s));
		//.forEach(System.out::println);
		
		System.out.println("-------------");
		
		Arrays.asList("tutku", "utku", "ince")
		.parallelStream()
		.map(s -> {System.out.println(s); return s.toUpperCase();})
		.forEach(System.out::println);
		
		System.out.println("-------------");
		
		Arrays.asList("tutku", "uður", "musa", "utku", "emin", "alper")
		.parallelStream()
		.filter(s -> s.startsWith("t") || s.startsWith("u"))
		.map(s -> {System.out.println(s); return s.toUpperCase();})
		.forEach(System.out::println);
		
		
		// map(), forEach() and filter() can be processed independently, although order is never guaranteed.
	}
}
