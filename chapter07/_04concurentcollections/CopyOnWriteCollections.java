package com.oracle.javacert.professional.chapter07._04concurentcollections;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteCollections {
	public static void main(String[] args) {
		List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(4, 3, 55));
		
		for (Integer item : list) {
			System.out.print(item + " ");
			list.add(9);
		}
		
		System.out.println();
		System.out.println("Size: " + list.size());
		System.out.println(list);
		
	}
}
