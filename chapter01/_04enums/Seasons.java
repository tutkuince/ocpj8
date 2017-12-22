package com.oracle.javacert.professional.chapter01._04enums;

public enum Seasons {
	WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");
	
	private String expectedVisitors;
	
	private Seasons(String expectedVisitors) {
		this.expectedVisitors = expectedVisitors;
	}
	
	public void printExpectedVisitors() {
		System.out.println(expectedVisitors);
	}
}
