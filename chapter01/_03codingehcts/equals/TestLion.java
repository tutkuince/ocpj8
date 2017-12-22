package com.oracle.javacert.professional.chapter01._03codingehcts.equals;

public class TestLion {
	public static void main(String[] args) {
		Lion l1 = new Lion(123123, 3, "Tutku");
		
		Lion l2 = new Lion(123123, 5, "Utku");		
		
		System.out.println("l1.equals(l2) : " + l1.equals(l2));
		
		l2 = null;

		System.out.println("\nAfter l2 is null");
		
		System.out.println("\nl1.equals(l2) : " + l1.equals(l2));
	}
}
