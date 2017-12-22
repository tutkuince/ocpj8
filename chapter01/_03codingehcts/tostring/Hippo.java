package com.oracle.javacert.professional.chapter01._03codingehcts.tostring;

public class Hippo {
	private String name;
	private double weight;

	public Hippo(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	@Override
	public String toString() {
		return "Name : " + name + ", Weight : " + weight;
	}
}
