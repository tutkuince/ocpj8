package com.oracle.javacert.professional.chapter04._02builtinfunctionalinterfaces;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

public class ImplementingSupplier {
	public static void main(String[] args) {
		Supplier<LocalDate> s1 = LocalDate::now;
		Supplier<LocalDate> s2 = () -> LocalDate.now();
		
		LocalDate d1 = s1.get();
		LocalDate d2 = s2.get();
		
		System.out.println(d1);
		System.out.println(d2);
		
		System.out.println("------------------");
		
		Supplier<StringBuilder> sb1 = StringBuilder::new;
		Supplier<StringBuilder> sb2 = () -> new StringBuilder();
		
		System.out.println(sb1.get());
		System.out.println(sb2.get());
		
		System.out.println("------------------");
		
		Supplier<ArrayList<String>> al1 = ArrayList<String>::new;
		ArrayList<String> al2 = al1.get();
		System.out.println(al2);
		System.out.println(al1);
	}
}
