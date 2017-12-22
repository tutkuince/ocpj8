package com.oracle.javacert.professional.chapter04._02builtinfunctionalinterfaces;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class ImplementingPredicateAndBiPredicate {
	public static void main(String[] args) {
		Predicate<String> p1 = String::isEmpty;
		Predicate<String> p2 = s -> s.isEmpty();
		
		System.out.println(p1.test(""));
		System.out.println(p2.test(""));
		
		System.out.println("------------------");
		
		BiPredicate<String, String> bp1 = String::startsWith;
		BiPredicate<String, String> bp2 = (string, prefix) -> string.startsWith(prefix);
		
		System.out.println(bp1.test("chicken", "chic"));
		System.out.println(bp2.test("tutku", "ince"));
	}
}
