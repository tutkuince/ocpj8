package com.oracle.javacert.professional.chapter02._05designpatterns.factory;

public class Hay extends Food {
	public Hay(int quantity) {
		super(quantity);
	}

	@Override
	public void consumed() {
		System.out.println("Hay eaten: " + getQuantity());
	}
}
