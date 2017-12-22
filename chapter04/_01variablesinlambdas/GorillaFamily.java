package com.oracle.javacert.professional.chapter04._01variablesinlambdas;

public class GorillaFamily {
	String walk = "walk";
	
	void everyonePlay(boolean baby) {
		String approach = "amble";
		
		play(() -> walk);	// walk is instance variable
		play(() -> baby ? "hitch a ride" : "run");	// baby is a method parameter
		play(() -> approach);	// approach is a local variable
	}
	
	void play(Gorilla g) {
		System.out.println(g.move());
	}
	
	public static void main(String[] args) {
		GorillaFamily gf = new GorillaFamily();
		gf.everyonePlay(true);
	}
}

interface Gorilla{
	String move();
}
