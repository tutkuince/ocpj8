package com.oracle.javacert.professional.chapter02._05designpatterns.factory;

public abstract class Food {
	private int quantity;
	
	public Food(int quantity) {
		this.quantity = quantity;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public abstract void consumed();
}
