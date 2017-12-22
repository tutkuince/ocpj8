package com.oracle.javacert.professional.chapter04._04streams.intermediateoperations;

import java.util.stream.Stream;

public class SortedMethod {
	public static void main(String[] args) {
		Stream<String> s = Stream.of("brown-", "bear-");
		s.sorted().forEach(System.out::print);
	}
}
