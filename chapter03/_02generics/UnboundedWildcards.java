package com.oracle.javacert.professional.chapter03._02generics;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildcards {
	public static void main(String[] args) {
		List<String> keywords = new ArrayList<>();
		System.out.println("keywords---------------");
		keywords.add("java");
		printList(keywords);
		
		
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(new Integer(5));
		numbers.add(3);
		System.out.println("numbers---------------");
		printList(numbers);
		
	}
	
	public static void printList(List<?> list) {
		for (Object o : list) {
			System.out.println(o);
		}
	}
}
