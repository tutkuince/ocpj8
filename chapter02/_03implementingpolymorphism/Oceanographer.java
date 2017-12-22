package com.oracle.javacert.professional.chapter02._03implementingpolymorphism;

public class Oceanographer {
	public void checkSound(LivesInOceans animal) {
		animal.makeSound();
	}
	
	public static void main(String[] args) {
		Oceanographer o = new Oceanographer();
		o.checkSound(new Dolphins());
		o.checkSound(new Whale());
	}
}
