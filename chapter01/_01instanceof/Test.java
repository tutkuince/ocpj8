package com.oracle.javacert.professional.chapter01._01instanceof;

public class Test {
	public static void main(String[] args) {
		HeavyAnimals hippo = new Hippo();

		boolean b1 = hippo instanceof HeavyAnimals;
		boolean b2 = hippo instanceof Hippo;
		boolean b3 = hippo instanceof Elephant;

		System.out.println("hippo instanceof HeavyAnimals : " + b1);
		System.out.println("hippo instanceof Hippo : " + b2);
		System.out.println("hippo instanceof Elephant : " + b3);

		boolean b4 = hippo instanceof Object;

		Hippo nullHippo = null;
		boolean b5 = nullHippo instanceof Object;

		System.out.println("hippo instanceof Object : " + b4);
		System.out.println("nullHippo instanceof Object : " + b5);

		// Hippo anotherHippo = new Hippo();
		// boolean b6 = anotherHippo instanceof Elephant;	// DOES NOT COMPILE
	}
}
