package com.oracle.javacert.professional.chapter04._03optional;

import java.util.Optional;

public class OptionalWithFunctionalInterface {
	public static void main(String[] args) {
		Optional<Double> opt = OptionalClass.average(90, 100);
		opt.ifPresent(System.out::println);
		
		System.out.println("----------------");
		
		Optional<Double> opt2 = OptionalClass.average();	
		System.out.println(opt2.orElse(Double.NaN));	// NaN
		System.out.println(opt2.orElseGet(() -> Math.random()));	// 0 to 1 random number
		System.out.println(opt2.orElseThrow(() -> new IllegalStateException()));	//IllegalStateException 
	}
}
