package com.oracle.javacert.professional.chapter07._05parallelstreams;

import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectMethod {
	public static void main(String[] args) {
		Stream<String> ohMy1 = Stream.of("lions", "tigers", "bears").parallel();

		ConcurrentMap<Integer, String> map1 = ohMy1
				.collect(Collectors.toConcurrentMap(String::length, k -> k, (s1, s2) -> s1 + "," + s2));
		System.out.println(map1);
		System.out.println(map1.getClass());
		
		System.out.println("-----------------------");
		
		Stream<String> ohMy2 = Stream.of("lions", "tigers", "bears").parallel();
		ConcurrentMap<Integer, List<String>> map2 = ohMy2.collect(Collectors.groupingByConcurrent(String::length));
		System.out.println(map2);
	}
}
