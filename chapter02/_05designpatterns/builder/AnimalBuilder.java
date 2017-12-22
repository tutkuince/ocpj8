package com.oracle.javacert.professional.chapter02._05designpatterns.builder;

import java.util.List;

import com.oracle.javacert.professional.chapter02._05designpatterns.singleton.Animal;

public class AnimalBuilder {
	private String species;
	private int age;
	private List<String> favoriteFoods;
	
	public AnimalBuilder setAge(int age) {
		this.age = age;
		return this;
	}
	
	public AnimalBuilder setSpecies(String species) {
		this.species = species;
		return this;
	}
	
	public AnimalBuilder setFavoriteFoods(List<String> favoriteFoods) {
		this.favoriteFoods = favoriteFoods;
		return this;
	}
	
	public Animal build() {
		return new Animal(species, age, favoriteFoods);
	}
}
