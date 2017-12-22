package com.oracle.javacert.professional.chapter03._01reviewingcollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAndArrayList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Fluffy");
		list.add("Webby");

		String[] array = new String[list.size()];
		array[0] = list.get(1);
		array[1] = list.get(0);

		
		System.out.println("Read array");
		readArray(array);
		System.out.println();

		String[] array1 = { "gerbil", "mouse" };
		List<String> list1 = Arrays.asList(array1);	// returns fixed size list
		list1.set(1, "Test");
		array[0] = "new";

		System.out.println("\nRead array1");
		readArray(array1);
		System.out.println();
		
		System.out.println("\nRead list1");
		readList(list1);
		System.out.println();

		String[] array2 = (String[]) list1.toArray();
		// list1.remove(1); // throws UnsupportedOperationException

		System.out.println("\nRead array2");
		readArray(array2);

	}

	public static void readList(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "-");
		}
	}

	public static void readArray(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "-");
		}
	}
}
