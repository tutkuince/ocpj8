package com.oracle.javacert.professional.chapter04._06streampipelineconcept;

import java.util.Optional;

public class ChainingOptionals {

	public static void main(String[] args) {
		Optional<Integer> op = Optional.of(123);
		threeDigitWithFunc(op);
		
		
	}
	
	public static void threeDigit(Optional<Integer> optional) {
		if (optional.isPresent()) {			// outer if
			Integer num = optional.get();
			String str = "" + num;

			if (str.length() == 3) {		// inner if
				System.out.println(str);
			}
		}
	}

	public static void threeDigitWithFunc(Optional<Integer> optional) {
		optional.map(n -> "" + n)
		.filter(s -> s.length() == 3)
		.ifPresent(System.out::println);
	}
}
