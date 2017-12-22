package com.oracle.javacert.professional.chapter03._03listsetmapqueues._01collectionmethods;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Add {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		System.out.println(" - - LIST - -");
		System.out.println(list.add("Tutku"));	// add() method returns true or false
		System.out.println(list.toString());
		
		System.out.println(" - - SET - -");
		
		Set<String> set = new HashSet<>();
		System.out.println(set.add("Tutku"));
		System.out.println(set.toString());
		System.out.println(set.add("Tutku"));
		System.out.println(set.toString());
	}
}
