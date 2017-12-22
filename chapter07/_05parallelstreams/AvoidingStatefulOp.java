package com.oracle.javacert.professional.chapter07._05parallelstreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AvoidingStatefulOp {
	public static void main(String[] args) {
		List<Integer> data = Collections.synchronizedList(new ArrayList<>());
		Arrays.asList(1, 2, 3, 4, 5, 6)
		.parallelStream()
		.map(i -> { data.add(i); return i;	// AVOID STATEFUL LAMBDA EXPRESSIONS!
		})
		.forEachOrdered(s -> System.out.print(s + " "));
		
		System.out.println();
		
		for (Integer e : data) {
			System.out.print(e + " ");
		}
		
		System.out.println();
		
		System.out.println(Arrays.asList('w', 'o', 'l', 'f').stream().reduce("", (c, s1) -> c + s1, (s2, s3) -> s2 + s3));
		
		System.out.println(Arrays.asList("w", "o", "l", "f").parallelStream().reduce("_", String::concat));
	}
}
