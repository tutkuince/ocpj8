package com.oracle.javacert.professional.chapter02._04designprinciples.encapsulating;

public class Animal {
	private String species;
	private int age;

	public Animal(String species) {
		this.setSpecies(species);
	}

	public void setSpecies(String species) {
		if (species == null || species.trim().length() == 0) {
			throw new IllegalArgumentException("Species is required");
		}

		this.species = species;
	}

	public String getSpecies() {
		return species;
	}

	public void setAge(int age) {
		if (age < 0) {
			throw new IllegalArgumentException("Age cannot be a newgative number");
		}

		this.age = age;
	}

	public int getAge() {
		return age;
	}
}
