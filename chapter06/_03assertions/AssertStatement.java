package com.oracle.javacert.professional.chapter06._03assertions;

public class AssertStatement {
	public static void main(String[] args) {
		int numGuests = -5;
		assert numGuests > 0;
		System.out.println(numGuests);
		
		int numEggs = 0;
		assert numEggs > 0 : "Eggs count must be greater than 0";
		System.out.println(numEggs);
	}
}
