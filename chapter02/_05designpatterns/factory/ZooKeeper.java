package com.oracle.javacert.professional.chapter02._05designpatterns.factory;

public class ZooKeeper {
	public static void main(String[] args) {
		final Food food = FoodFactory.getFood("polar bear");
		food.consumed();
	}
}
