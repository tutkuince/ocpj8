package com.oracle.javacert.professional.chapter03._07review;

import java.util.ArrayList;
import java.util.List;

public class WildCardUse {
	public static void printList(List<?> list) {
		for (Object o : list) {
			System.out.println("[" + o + "]");
		}
	}
	
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		intList.add(10);
		intList.add(100);
		printList(intList);
		
		System.out.println("---------------------");
		
		List<String> strList = new ArrayList<>();
		strList.add("10");
		strList.add("100");
		printList(strList);
	}
}
