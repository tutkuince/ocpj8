package com.oracle.javacert.professional.chapter04._04streams.reductions;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ReduceMethod {
	public static void main(String[] args) {
		String[] array = new String[] { "w", "o", "l", "f" };
		String result = "";
		for (String string : array) {
			result += string;
		}
		System.out.println("result : " + result);

		Stream<String> stream = Stream.of("w", "o", "l", "f");
		String word = stream.reduce("", (s, c) -> s + c);
		System.out.println("word : " + word);

		Stream<String> stream2 = Stream.of("w", "o", "l", "f");
		String word2 = stream2.reduce("", String::concat);
		System.out.println("word2 : " + word2);

		System.out.println("--------------");
		
		Stream<Integer> stream3 = Stream.of(3, 5, 6);
		System.out.println(stream3.reduce(1, (a, b) -> a * b));

		System.out.println("--------------");
		
		BinaryOperator<Integer> op = (a, b) -> a * b;
		Stream<Integer> empty = Stream.empty();
		Stream<Integer> oneElement = Stream.of(3);
		Stream<Integer> threeElements = Stream.of(3, 5, 6);

		empty.reduce(op).ifPresent(System.out::println); // no output
		oneElement.reduce(op).ifPresent(System.out::println); // 3
		threeElements.reduce(op).ifPresent(System.out::println);// 90
		
		
		Stream<String> s1 = Stream.of("T", "U", "T", "K", "U");
		//String str = s1.reduce("", (s, u) -> s + u);
		String str = s1.reduce("", String::concat);
		System.out.println(str);
		
	}
}
