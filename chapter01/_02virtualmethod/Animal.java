package com.oracle.javacert.professional.chapter01._02virtualmethod;

public abstract class Animal {
	public abstract void feed();	// virtual method
	
	public void careFor() {
		play();
	}

	public void play() {
		System.out.println("pet animal");
		
	}
}
