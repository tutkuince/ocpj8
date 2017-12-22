package com.oracle.javacert.professional.chapter04._04streams.reductions;

import java.util.Optional;
import java.util.stream.Stream;

public class MinAndMaxMethod {
	public static void main(String[] args) {
		Stream<String> stream1 = Stream.of("monkey", "ape", "bonobo");
		Optional<String> min = stream1.min((s1, s2) -> s1.length() - s2.length());
		min.ifPresent(System.out::println);
		

		Stream<String> stream2 = Stream.of("monkey", "ape", "bonobo");
		Optional<String> max = stream2.max((s3, s4) -> s3.length() - s4.length());
		max.ifPresent(System.out::println);
	}
}
