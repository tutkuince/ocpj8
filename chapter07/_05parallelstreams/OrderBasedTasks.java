package com.oracle.javacert.professional.chapter07._05parallelstreams;

import java.util.Arrays;

public class OrderBasedTasks {
	public static void main(String[] args) {
		System.out.println("Serial Stream: " + Arrays.asList(1, 2, 3, 4, 5, 6).stream().findAny().get());
		
		System.out.println("Parallel Stream: " + Arrays.asList(1, 2, 3, 4, 5, 6).parallelStream().findAny().get());
	}
}
