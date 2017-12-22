package com.oracle.javacert.professional.chapter01._02virtualmethod;

public class Bird extends Animal {
	@Override
	public void feed() {
		addSeed();
	}

	private void addSeed() {	// not virtual

	}
}
