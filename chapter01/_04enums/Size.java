package com.oracle.javacert.professional.chapter01._04enums;

public enum Size {
	SMALL("S", 1), MEDIUM("M", 2), LARGE("L", 3), EXTRA_LARGE("XL", 4);
	
	private String abbrevation;	//	abbrevation = kýsaltma
	private int no;
	
	private Size(String abbrevation, int no) {
		this.abbrevation = abbrevation;
		this.no = no;
	}
	
	public String getAbbrevation() {
		return abbrevation;
	}
	
	public int getNo() {
		return no;
	}
}
