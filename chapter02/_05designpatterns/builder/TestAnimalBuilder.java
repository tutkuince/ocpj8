package com.oracle.javacert.professional.chapter02._05designpatterns.builder;

import java.util.Arrays;

import com.oracle.javacert.professional.chapter02._05designpatterns.singleton.Animal;

public class TestAnimalBuilder {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		AnimalBuilder duckBuilder = new AnimalBuilder();
		duckBuilder.setAge(4).setFavoriteFoods(Arrays.asList("grass", "fish")).setSpecies("duck");
		Animal duck = duckBuilder.build();

		Animal flamingo = new AnimalBuilder().setFavoriteFoods(Arrays.asList("algae", "insects")).setSpecies("flamingo")
				.build();
	}
}
