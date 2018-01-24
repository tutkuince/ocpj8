package com.oracle.javacert.professional.chapter01._06review.localinnerclass;

public class Outer {
	private int length = 5;

	public void calculate() {
		//final int width = 20;
		int width = 20;	// effectively final
		// width++; StatusReporter.java:8: error: local variables referenced from an inner class must be final or effectively final
		class Inner {
			public void multiply() {
				System.out.println(width * length);
			}
		}
		
		Inner inner = new Inner();
		inner.multiply();
	}
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.calculate();
	}
}
