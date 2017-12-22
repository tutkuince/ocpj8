package com.oracle.javacert.professional.chapter01._04enums;

public enum OnlyOne {
	ONCE(true);
	
	private OnlyOne(boolean b) {
		System.out.println("constructing");
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		OnlyOne firstCall = OnlyOne.ONCE;	// prints constructing
		OnlyOne secondCall = OnlyOne.ONCE;	//doesn't print anything
	}
}
