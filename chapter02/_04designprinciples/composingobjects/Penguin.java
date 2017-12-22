package com.oracle.javacert.professional.chapter02._04designprinciples.composingobjects;

public class Penguin {
	private final Flippers flippers;
	private final WebbedFeet webbedFeet;

	public Penguin() {
		this.flippers = new Flippers();
		this.webbedFeet = new WebbedFeet();
	}

	public void flap() {
		this.flippers.flap();
	}

	public void kick() {
		this.webbedFeet.kick();
	}
}
