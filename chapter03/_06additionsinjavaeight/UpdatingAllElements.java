package com.oracle.javacert.professional.chapter03._06additionsinjavaeight;

import java.util.Arrays;
import java.util.List;

public class UpdatingAllElements {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
		System.out.println(numbers);
		numbers.replaceAll(n -> n * 2);
		System.out.println("A F T E R  r e p l a c e A l l ( )");
		System.out.println(numbers);
	}
}
