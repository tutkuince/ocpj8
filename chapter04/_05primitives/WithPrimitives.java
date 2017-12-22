package com.oracle.javacert.professional.chapter04._05primitives;

import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class WithPrimitives {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1, 2, 3);
		System.out.println(stream.reduce(0, (s, n) -> s + n));
		
		Stream<Integer> stream2 = Stream.of(1, 2, 3);
		System.out.println(stream2.mapToInt(x -> x).sum());
		
		IntStream intStream = IntStream.of(1, 2, 3);
		OptionalDouble avg = intStream.average();
		System.out.println(avg.getAsDouble());
		
		System.out.println("-----------------");
		
		IntStream count = IntStream.iterate(1, n -> n + 1).limit(5);
		count.forEach(System.out::print);
		
		System.out.println("\n-----------------");
		
		IntStream range = IntStream.range(1, 6);
		range.forEach(System.out::print);
		
		System.out.println("\n-----------------");
		
		IntStream rangeClosed = IntStream.rangeClosed(1, 5);
		rangeClosed.forEach(System.out::print);
	}
}
