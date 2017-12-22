package com.oracle.javacert.professional.chapter04._02builtinfunctionalinterfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ImplementingFunctionAndBiFunction {
	public static void main(String[] args) {
		Function<String, Integer> f1 = String::length;
		Function<String, Integer> f2 = s -> s.length();
		
		System.out.println(f1.apply("tutku"));
		System.out.println(f2.apply("ince"));
		
		System.out.println("------------------");
		
		BiFunction<String, String, String> bf1 = String::concat;
		BiFunction<String, String, String> bf2 = (string, toAdd) -> string.concat(toAdd);
		
		System.out.println(bf1.apply("Tutku", " Ince"));
		System.out.println(bf2.apply("Utku", " Ince"));
	}
}
