package com.oracle.javacert.professional.chapter04._04streams.reductions;

import java.util.stream.Stream;

public class CountMethod {
	public static void main(String[] args) {
		Stream<String> s = Stream.of("monkey", "gorilla", "bonob");
		System.out.println("s.count() : " + s.count());
	}
}
