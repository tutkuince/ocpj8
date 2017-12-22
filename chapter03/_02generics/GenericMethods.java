package com.oracle.javacert.professional.chapter03._02generics;

public class GenericMethods {
	public static void main(String[] args) {
		
	}
	
	public static <T> Crate<T> ship(T t){
		System.out.println("Preparing " + t);
		return new Crate<T>();
	}
	
	public static <T> void sink(T t) {}
	
	public static <T> T identity(T t) { return t;}
	
	// public static T noGood(T t) { return t;} // DOES NOT COMPILE
}
