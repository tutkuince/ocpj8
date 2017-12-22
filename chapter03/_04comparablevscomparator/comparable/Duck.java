package com.oracle.javacert.professional.chapter03._04comparablevscomparator.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Duck implements Comparable<Duck>{
	private String name;
	
	public Duck(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	@Override
	public int compareTo(Duck duck) {
		return name.compareTo(duck.name);
	}
	
	// Main method
	public static void main(String[] args) {
		List<Duck> ducks = new ArrayList<>();
		ducks.add(new Duck("Quack"));
		ducks.add(new Duck("Puddles"));
		Collections.sort(ducks);
		System.out.println(ducks);
	}
}
