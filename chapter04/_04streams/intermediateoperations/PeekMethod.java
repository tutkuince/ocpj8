package com.oracle.javacert.professional.chapter04._04streams.intermediateoperations;

import java.util.stream.Stream;

public class PeekMethod {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("black bear", "brown bear", "grizzly");
		long count= stream.filter(s -> s.startsWith("g")).peek(System.out::println).count();
		System.out.println(count);
	}
}
