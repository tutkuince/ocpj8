package com.oracle.javacert.professional.chapter01._06review.statickeyword;

public class CounterWithStaticBlock {
	private static int count;
	
	static {
		// code in this static block will be executed when
		// the JVM loads the class into memory.
		count = 0;
	}
	
	public CounterWithStaticBlock() {
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
