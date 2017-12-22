package com.oracle.javacert.professional.chapter02._05designpatterns.singleton;

public class HayStorage {
	private int quantity = 0;

	private HayStorage() {

	}
	
	private static final HayStorage instance = new HayStorage();
	
	public static HayStorage getInstance() {
		return instance;
	}
	
	public synchronized void addHay(int amount) {
		quantity += amount;
	}
	
	public synchronized boolean removeHay(int amount) {
		if(quantity < amount)
			return false;
		return true;
	}
	
	public synchronized int getHayQuantity() {
		return quantity;
	}
}
