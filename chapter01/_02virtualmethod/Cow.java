package com.oracle.javacert.professional.chapter01._02virtualmethod;

public class Cow extends Animal {
	@Override
	public void feed() {
		addHay();
	}

	private void addHay() { // not virtual

	}
}
