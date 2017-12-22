package com.oracle.javacert.professional.chapter04._06streampipelineconcept;

import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BasicCollectors {
	public static void main(String[] args) {
		Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
		String result = ohMy.collect(Collectors.joining(", "));
		System.out.println(result);
		
		System.out.println("--------------");
		
		Stream<String> ohMy2 = Stream.of("lions", "tigers", "bears");
//		Double result2 = ohMy2.collect(Collectors.averagingDouble(x -> x.length()));
		Double result2 = ohMy2.collect(Collectors.averagingDouble(String::length));
		System.out.println(result2);
		
		System.out.println("--------------");
		
		Stream<String> ohMy3 = Stream.of("lions", "tigers", "bears");
		TreeSet<String> result3 = ohMy3.filter(s -> s.startsWith("t")).collect(Collectors.toCollection(TreeSet::new));
		System.out.println(result3);
	}
}
