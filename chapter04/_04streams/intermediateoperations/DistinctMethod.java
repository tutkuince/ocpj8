package com.oracle.javacert.professional.chapter04._04streams.intermediateoperations;

import java.util.stream.Stream;

public class DistinctMethod {
	public static void main(String[] args) {
		Stream<String> s = Stream.of("duck", "duck", "duck", "goose");
		s.distinct().forEach(System.out::print);	// duckgoose
	}
}
