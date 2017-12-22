package com.oracle.javacert.professional.chapter04._06streampipelineconcept;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingIntoMap {
	public static void main(String[] args) {
		Stream<String> ohMy = Stream.of("lion", "tigers", "bears");
		Map<String, Integer> map = ohMy.collect(Collectors.toMap(s -> s, String::length));
		System.out.println(map);
	}
}
