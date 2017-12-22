package com.oracle.javacert.professional.chapter01._02virtualmethod;

public class Lion extends Animal {
	@Override
	public void feed() {
		addMeat();
	}

	private void addMeat() {	// not virtual

	}
	
	@Override
	public void play() {		// overriden method
		System.out.println("toss in meat");
	}
}
