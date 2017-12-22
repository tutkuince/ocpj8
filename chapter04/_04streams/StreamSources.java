package com.oracle.javacert.professional.chapter04._04streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamSources {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Stream<String> empty = Stream.empty();	// count is 0
		Stream<Integer> singleElement = Stream.of(1); // count is 1
		Stream<Integer> fromArray = Stream.of(1, 2, 3);	// count is 3
		
		System.out.println("count of empty : " + empty.count());
		System.out.println("count of singleElement : " + singleElement.count());
		System.out.println("count of fromArray : " + fromArray.count());
		
		System.out.println("---------------");
		
		List<String> list = Arrays.asList("a", "b", "c");
		Stream<String> fromList = list.stream();	// create stream from list
		Stream<String> fromListParallel = list.parallelStream();	// create stream from list that is allowed to process elements in parallel
		
		System.out.println("---------------");
		
		Stream<Double> randoms = Stream.generate(Math::random);
		Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
		
		// randoms.forEach(System.out::println); // print random numbers until you kill it.
		
		
	}
}
