package com.oracle.javacert.professional.chapter04._05primitives;

import java.util.function.BooleanSupplier;

public class ForBoolean {
	public static void main(String[] args) {
		BooleanSupplier b1 = () -> true;
		BooleanSupplier b2 = () -> Math.random() > .5;
		
		System.out.println(b1.getAsBoolean());
		System.out.println(b2.getAsBoolean());
	}
}
