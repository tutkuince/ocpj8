package com.oracle.javacert.professional.chapter04._02builtinfunctionalinterfaces;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class ImplementingUnaryOperatorandBinaryOperator {
	public static void main(String[] args) {
		UnaryOperator<String> u1 = String::toUpperCase;
		UnaryOperator<String> u2 = s -> s.toUpperCase();
		
		System.out.println(u1.apply("tutku"));
		System.out.println(u2.apply("ince"));
		
		System.out.println("------------------");
		
		BinaryOperator<String> b1 = String::concat;
		BinaryOperator<String> b2 = (string, toAdd) -> string.concat(toAdd);
		
		System.out.println(b1.apply("Tutku", " Ince"));
		System.out.println(b2.apply("Utku", " Ince"));
	}
}
