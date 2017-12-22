package com.oracle.javacert.professional.chapter04._04streams.intermediateoperations;

import java.util.stream.Stream;

public class MapMethod {
	public static void main(String[] args) {
		Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
//		s.map(x -> x.length()).forEach(x -> System.out.print(x));
		s.map(String::length).forEach(System.out::print);
	}
}
