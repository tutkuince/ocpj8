package com.oracle.javacert.professional.chapter03._07review;

public class BoxPrinterTest {
	public static void main(String[] args) {
		BoxPrinter<Integer> val1 = new BoxPrinter<>(new Integer(10));
		System.out.println(val1);
		
		BoxPrinter<String> val2 = new BoxPrinter<>(new String("Hello World!"));
		System.out.println(val2);
	}
}

// This program shows container implementation using generics
class BoxPrinter<T> {
	private T val;

	public BoxPrinter(T arg) {
		val = arg;
	}

	public String toString() {
		return "[" + val + "]";
	}
}
