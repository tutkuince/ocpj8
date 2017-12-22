package com.oracle.javacert.professional.chapter04;

//import java.util.function.Predicate;
import java.util.stream.Stream;

public class Notes {
	public static void main(String[] args) {
		Stream<String> stream = Stream.iterate("", (s) -> s + "1");
		stream.limit(2).map(x -> x + "2").forEach(System.out::println);
		
//		Predicate<? super String> predicate = s -> s.length() > 3;
//		Stream<String> stream1 = Stream.iterate("-", (s) -> s + s);
//		boolean b1 = stream1.noneMatch(predicate);
//		boolean b2 = stream1.anyMatch(predicate);
//		System.out.println(b1 + " " + b2);
	}
}
