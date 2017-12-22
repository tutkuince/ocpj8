package com.oracle.javacert.professional.chapter02._04designprinciples.hasarelationship;

public class Bird {
	private Beak beak; // has-a relationship
	private Foot rightFoot; // has-a relationship
	private Foot leftFoot; // has-a relationship

	public Beak getBeak() {
		return beak;
	}

	public void setBeak(Beak beak) {
		this.beak = beak;
	}

	public Foot getRightFoot() {
		return rightFoot;
	}

	public void setRightFoot(Foot rightFoot) {
		this.rightFoot = rightFoot;
	}

	public Foot getLeftFoot() {
		return leftFoot;
	}

	public void setLeftFoot(Foot leftFoot) {
		this.leftFoot = leftFoot;
	}

}
