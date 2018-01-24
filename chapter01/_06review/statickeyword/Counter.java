package com.oracle.javacert.professional.chapter01._06review.statickeyword;

// Counter class should count the number of instances created from that class 
public class Counter {
	//private int count; // variable to store the number of objects created for every Counter object created
	private static int count;
	
	public Counter() {
		count++;
	}
	
	/** method to print the counter value so far */
	public void printCount() {
		System.out.println("Number of instances created so far is: " + count);
	}
	
	public static void main(String[] args) {
		Counter c1 = new Counter();
		c1.printCount();	// 1
		
		Counter c2 = new Counter();
		c2.printCount();	// 2
	}
}
