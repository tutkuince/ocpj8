package com.oracle.javacert.professional.chapter03._01reviewingcollections;

import java.util.Arrays;
import java.util.List;

public class ArrayAndList {
	public static void main(String[] args) {
		String[] array = {"gerbil", "mouse"};
		List<String> list = Arrays.asList(array);	// returns fixed size list
		list.set(1, "test");
		array[0] = "new";
		
		System.out.println("Reading array");
		readArray(array);
		System.out.println();
		
		System.out.println("Reading list");
		System.out.println(list.toString());
		
	}
	
	public static void readArray(String[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if(array.length - 1 > i) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
}
