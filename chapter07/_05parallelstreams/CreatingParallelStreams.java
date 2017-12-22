package com.oracle.javacert.professional.chapter07._05parallelstreams;

import java.util.Arrays;
import java.util.stream.Stream;

public class CreatingParallelStreams {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Stream<Integer> stream = Arrays.asList(1, 2, 3, 4, 5, 6).stream();
		Stream<Integer> parallelStream = stream.parallel();	// 1) Creating parallel stream from another stream
		
		Stream<Integer> parallelStream2 = Arrays.asList(1, 2, 3, 4, 5, 6).parallelStream();	// 2) Creating parallel stream from Collection class
		
		
		
	}
}
