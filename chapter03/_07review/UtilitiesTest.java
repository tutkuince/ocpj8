package com.oracle.javacert.professional.chapter03._07review;

import java.util.ArrayList;
import java.util.List;

public class UtilitiesTest {
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		intList.add(10);
		intList.add(20);
		
		System.out.println("The original list is: " + intList);
		
		Utilities.fill(intList, 100);
		System.out.println("The list after calling Utilities.fill() is: " + intList);
		
		List<String> strList = new ArrayList<>();
		strList.add("Tutku");
		strList.add("Ince");
		
		System.out.println("Ther original strList is: " + strList);
		
		Utilities.fill(strList, "Java");
		System.out.println("The list after calling Utilities.fill() is: " + strList);
	}
}

class Utilities{
	public static <T> void fill(List<T> list, T val) {
		for (int i = 0; i < list.size(); i++) {
			list.set(i, val);
		}
	}
}
