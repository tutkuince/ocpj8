package com.oracle.javacert.professional.chapter03._01reviewingcollections;

import java.util.ArrayList;
import java.util.List;

public class Autoboxing {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);					// [1]
		numbers.add(new Integer(3));	// [1, 3]
		numbers.add(new Integer(5));	// [1, 3, 5]
		numbers.remove(1);				// [1, 5]
		numbers.remove(new Integer(5));	// [1]
		System.out.println(numbers);
		
		int number = numbers.get(0);	// unboxing
		System.out.println("number is " + number);
	}
}
