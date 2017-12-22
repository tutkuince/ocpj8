package com.oracle.javacert.professional.chapter02._02functionalprogramming;

public class Animal {
	private String species;
	private boolean canHop;
	private boolean canSwim;

	public Animal(String species, boolean canHop, boolean canSwimg) {
		this.species = species;
		this.canHop = canHop;
		this.canSwim = canSwimg;
	}

	public boolean canHop() {
		return canHop;
	}

	public boolean canSwim() {
		return canSwim;
	}

	@Override
	public String toString() {
		return species;
	}
}
