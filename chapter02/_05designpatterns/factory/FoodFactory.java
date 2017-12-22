package com.oracle.javacert.professional.chapter02._05designpatterns.factory;

public class FoodFactory {
	public static Food getFood(String animalName) {
		switch (animalName) {
		case "zebra":
			return new Hay(100);
		case "rabbit":
			return new Pellets(5);
		case "goat":
			return new Pellets(30);
		case "fish":
			return new Fish(10);
		}

		throw new UnsupportedOperationException("Unsupported animal: " + animalName);
	}
}
