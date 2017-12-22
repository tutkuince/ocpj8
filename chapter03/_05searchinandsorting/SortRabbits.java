package com.oracle.javacert.professional.chapter03._05searchinandsorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortRabbits {
	static class Rabbit {
		int id;
	}

	public static void main(String[] args) {
		List<Rabbit> rabbits = new ArrayList<>();
		rabbits.add(new Rabbit());
		Comparator<Rabbit> c = (r1, r2) -> r1.id - r2.id;
		// Collections.sort(rabbits);	// Rabbit class is not Comparable. Sorting will fail without Comparable
		Collections.sort(rabbits, c);
		
		List<String> names = Arrays.asList("Fluffy", "Hoppy");	// [Fluffy, Hoppy]
		System.out.println(names);
		Comparator<String> c1 = Comparator.reverseOrder();
		int index = Collections.binarySearch(names, "Hoppy", c1);
		System.out.println("index : " + index);
	}
}
