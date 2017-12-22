package com.oracle.javacert.professional.chapter01._05nestedclasses.staticnested;

public class Enclosing {
	static class Nested{
		private int price = 6;
	}
	
	public static void main(String[] args) {
		Nested nested = new Nested();
		System.out.println(nested.price);
	}
}
