package com.oracle.javacert.professional.chapter03;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class ReviewQuestions {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ArrayDeque<String> greetings = new ArrayDeque<>();
		greetings.push("hello");
		greetings.push("hi");
		greetings.push("ola");
		greetings.pop();
		greetings.peek();

		while (greetings.peek() != null) {
			System.out.println(greetings.pop());
		}

		Set<Number> numbers = new HashSet<>();
		numbers.add(new Integer(86));
		numbers.add(75);
		numbers.add(new Integer(86));
		numbers.add(null);
		numbers.add(309L);
		Iterator iter = numbers.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next());
		}

		TreeSet<String> tree = new TreeSet<>();
		tree.add("one");
		tree.add("One");
		tree.add("ONE");
		System.out.println(tree);
		System.out.println(tree.ceiling("On"));

		Map<Integer, Integer> map = new HashMap<>(10);
		for (int i = 1; i <= 10; i++) {
			map.put(i, i * i);
		}
		System.out.println(map);

		Comparator<Integer> c = (o1, o2) -> o2 - o1;	// Descending
		List<Integer> list1 = Arrays.asList(5, 4, 7, 1);
		Collections.sort(list1, c);
		System.out.println(Collections.binarySearch(list1, 1));	// The result is undefined
		// System.out.println(Collections.binarySearch(list1, 1, c));	// GOOD
		
		
		
	}
}
