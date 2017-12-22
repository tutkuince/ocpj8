package com.oracle.javacert.professional.chapter04._02builtinfunctionalinterfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ImplementingConsumerAndBiConsumer {
	public static void main(String[] args) {
		Consumer<String> c1 = System.out::println;
		Consumer<String> c2 = x -> System.out.println(x);
		
		c1.accept("Tutku");
		c2.accept("Tutku");
		
		System.out.println("------------------");
		
		Map<String, Integer> map = new HashMap<>();
		BiConsumer<String, Integer> bc1 = map::put;	// static method references
		BiConsumer<String, Integer> bc2 = (k, v) -> map.put(k, v);	// lambda
		
		bc1.accept("Tutku", 123123);
		bc2.accept("Utku", 321321);
		System.out.println(map);
		
		System.out.println("------------------");
		
		Map<String, String> map2 = new HashMap<>();
		BiConsumer<String, String> bc3 = map2::put;
		BiConsumer<String, String> bc4 = (k, v) -> map2.put(k, v);
		
		bc3.accept("chicken", "Cluck");
		bc4.accept("chick", "Tweep");
		
		System.out.println(map2);
	}
}
