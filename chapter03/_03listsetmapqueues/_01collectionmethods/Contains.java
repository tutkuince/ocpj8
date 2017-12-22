package com.oracle.javacert.professional.chapter03._03listsetmapqueues._01collectionmethods;

import java.util.ArrayList;
import java.util.List;

public class Contains {
	public static void main(String[] args) {
		List<String> birds = new ArrayList<>();
		birds.add("Hawk");	// [Hawk]
		birds.add("Hawk");	// [Hawk, Hawk]
		System.out.println(birds);	// [Hawk, Hawk]
		
		System.out.println(birds.contains("Hawk"));	// return true
	}
}
