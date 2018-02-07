package com.oracle.javacert.professional.chapter03._07review;

import java.util.Arrays;
import java.util.Comparator;

public class MyComparator implements Comparator<String> {
	@Override
	public int compare(String a, String b) {
		return b.toLowerCase().compareTo(a.toLowerCase());
	}

	public static void main(String[] args) {
		String[] values = { "123", "Abb", "aab" };
		Arrays.sort(values, new MyComparator());
		
		for (String str : values) {
			System.out.print(str + " ");
		}
		
		
	}
}
