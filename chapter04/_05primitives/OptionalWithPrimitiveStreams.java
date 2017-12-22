package com.oracle.javacert.professional.chapter04._05primitives;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class OptionalWithPrimitiveStreams {
	public static void main(String[] args) {
		IntStream s = IntStream.rangeClosed(1, 10);
		OptionalDouble optional = s.average();
		
		optional.ifPresent(System.out::println);
		System.out.println(optional.getAsDouble());
		System.out.println(optional.orElseGet(() -> Double.NaN));
		
		System.out.println("---------------");
		
		LongStream longs = LongStream.of(5, 10);
		long sum = longs.sum();
		System.out.println(sum);
		
		System.out.println("---------------");
		
//		DoubleStream doubles = DoubleStream.generate(() -> Math.random());
		DoubleStream doubles = DoubleStream.generate(() -> Math.PI);
		OptionalDouble min = doubles.min();
		System.out.println(min.getAsDouble());
		System.out.println(min.orElse(Double.NaN));
		System.out.println(min.orElseGet(Math::random));
		System.out.println(min.orElseThrow(() -> new IllegalStateException()));
		
	}
}
