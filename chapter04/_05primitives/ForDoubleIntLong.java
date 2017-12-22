package com.oracle.javacert.professional.chapter04._05primitives;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class ForDoubleIntLong {
	public static void main(String[] args) {
		DoubleStream empty = DoubleStream.empty();	// empty stream
		empty.forEach(System.out::println);
		
		DoubleStream oneValue = DoubleStream.of(3.14);
		DoubleStream varargs = DoubleStream.of(1.0, 1.1, 1.2);
		oneValue.forEach(System.out::println);
		System.out.println("-----------");
		varargs.forEach(x -> System.out.println(x));
		
		System.out.println("-----------");
		
		DoubleStream random = DoubleStream.generate(Math::random);
		DoubleStream fractions = DoubleStream.iterate(.5, d -> d / 2);
		random.limit(3).forEach(System.out::println);
		System.out.println();
		fractions.limit(3).forEach(System.out::println);
		
		System.out.println("-----------");
		
		IntStream count = IntStream.iterate(1, n -> n + 1).limit(3);
		count.forEach(System.out::println);
		
		System.out.println("-----------");
		
		IntStream range = IntStream.range(1, 4);
		range.forEach(System.out::println);
		
		System.out.println("-----------");
		
		IntStream rangeClosed = IntStream.rangeClosed(1, 3);
		rangeClosed.forEach(System.out::println);
	}
}
