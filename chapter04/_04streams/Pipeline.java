package com.oracle.javacert.professional.chapter04._04streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Pipeline {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
		List<String> filtered = new ArrayList<>();
		
		for (String name : list) {
			if(name.length() == 4) {
				filtered.add(name);
			}
		}
		Collections.sort(filtered);
		Iterator<String> iter = filtered.iterator();
		
		if(iter.hasNext())
			System.out.println(iter.next());
		if(iter.hasNext())
			System.out.println(iter.next());
		
		System.out.println("----------------");

		
		
		list.stream().filter(s -> s.length() == 4)
			.sorted()
			.limit(2)
			.forEach(System.out::println);
		
		System.out.println("----------------");
		
		/*
		 	Stream.generate(() -> "Elsa")
			.filter(n -> n.length() == 4)
			.sorted()
			.limit(2)
			.forEach(System.out::println);	// infinite loop
		 */	
		
		Stream.generate(() -> "Elsa")
			.filter(n -> n.length() == 4)
			.limit(2)
			.sorted()
			.forEach(System.out::println);
	}
}
