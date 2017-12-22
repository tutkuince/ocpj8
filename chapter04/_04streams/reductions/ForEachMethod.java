package com.oracle.javacert.professional.chapter04._04streams.reductions;

import java.util.stream.Stream;

public class ForEachMethod {
	public static void main(String[] args) {
		Stream<String> s = Stream.of("Monkey", "Gorilla", "Bonobo");
		s.forEach(System.out::print);
	}
}
