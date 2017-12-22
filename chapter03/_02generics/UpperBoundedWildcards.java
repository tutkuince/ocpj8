package com.oracle.javacert.professional.chapter03._02generics;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundedWildcards {
	public static void main(String[] args) {
		List<Integer> intNums = new ArrayList<>();
		intNums.add(9);
		intNums.add(2);
		intNums.add(new Integer(31));
		System.out.println("intNums -----");
		writeNumbers(intNums);
		
		
		List<Double> doubleNums = new ArrayList<>();
		doubleNums.add(13.4);
		doubleNums.add(144D);
		doubleNums.add(new Double(16));
		System.out.println("doubleNums -----");
		writeNumbers(doubleNums);
	}
	
	public static void writeNumbers(List<? extends Number> numbers) {
		for (Number number : numbers) {
			System.out.println(number);
		}
	}
}
