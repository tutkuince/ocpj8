package com.oracle.javacert.professional.chapter07._05parallelstreams;

import java.util.Arrays;

public class ProcessingTaskInParallel {
	public static void main(String[] args) {
		
		System.out.println("Serial Stream");
		Arrays.asList(1, 2, 3, 4, 5, 6).stream().forEach((s) -> System.out.print(s + " "));	// Result is predictable! (Serial stream)
		
		System.out.println();
		
		System.out.println("\nParallel Stream");
		Arrays.asList(1, 2, 3, 4, 5, 6).parallelStream().forEach((s) -> System.out.print(s + " "));	// Result is unpredictable! (Parallel Stream)
		
		System.out.println();
		
		System.out.println("\nParallel Stream but used forEachOrdered()");
		Arrays.asList(1, 2, 3, 4, 5, 6).parallelStream().forEachOrdered((s) -> System.out.print(s + " "));	// Result is ordered! But slower!
	}
}
