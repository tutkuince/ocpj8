package com.oracle.javacert.professional.chapter03._03listsetmapqueues._01collectionmethods;

import java.util.ArrayList;
import java.util.List;

public class Remove {
	public static void main(String[] args) {
		List<String> birds = new ArrayList<>();
		birds.add("Hawk");	// [Hawk]
		birds.add("Hawk");	// [Hawk, Hawk]
		System.out.println(birds.remove("Cardinal")); 	// prints false
		System.out.println(birds.remove("Hawk"));		// prints true
		System.out.println(birds);	// [Hawk]
		birds.remove(0);
		System.out.println(birds);	// []
		
	}
}
