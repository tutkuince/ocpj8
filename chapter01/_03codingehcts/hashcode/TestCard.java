package com.oracle.javacert.professional.chapter01._03codingehcts.hashcode;

public class TestCard {
	public static void main(String[] args) {
		Card c1 = new Card("Hearts", "Ace");
		Card c2 = new Card("Diamonds", "King");

		System.out.println("c1.equals(c2) : " + (c1.equals(c2) ? true : false));
		System.out.println("c1's hash code : " + c1.hashCode());
		System.out.println("c2's hash code : " + c2.hashCode());

		System.out.println("-------------------------------");
		
		Card c3 = new Card("Hearts", "King");

		System.out.println("c1.equals(c3) : " + (c1.equals(c3) ? true : false));
		System.out.println("c1's hash code : " + c1.hashCode());
		System.out.println("c3's hash code : " + c3.hashCode());	//hashCode() result do not need to be unique when called on unequal objects

		System.out.println("-------------------------------");
		
		Card c4 = new Card("Hearts", "Ace");
		System.out.println("c1.equals(c4) : " + (c1.equals(c4) ? true : false));
		System.out.println("c1's hash code : " + c1.hashCode());
		System.out.println("c4's hash code : " + c4.hashCode());
	}
}
