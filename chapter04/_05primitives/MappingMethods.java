package com.oracle.javacert.professional.chapter04._05primitives;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MappingMethods {
	public static void main(String[] args) {
		Stream<String> objStream = Stream.of("penguin", "fish");
		IntStream intStream = objStream.mapToInt(s -> s.length());
		intStream.forEach(System.out::println);
		
		System.out.println("-------------");
		
		Stream<String> objStream2 = Stream.of("penguin", "fish");
		Stream<Integer> s = objStream2.map(String::length);	// To Create Stream
		s.forEach(System.out::println);
		
		System.out.println("-------------");
		
		IntStream intStream2 = IntStream.iterate(1, n -> n + 2);
		IntStream intToint = intStream2.map(n -> n + 2);
		intToint.limit(3).forEach(System.out::println);
		
		System.out.println("-------------");
		
		 
	}
}
