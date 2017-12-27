package com.oracle.javacert.professional.chapter08._03workingstreams.serializable;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectStreamSample {

	/**
	 * Main method
	 * 
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		List<Animal> animals = new ArrayList<>();
		animals.add(new Animal("Tommy Tiger", 5, 'T'));
		animals.add(new Animal("Peter Penguin", 8, 'P'));

		File dataFile = new File(
				"src/com/oracle/javacert/professional/chapter08/_03workingstreams/serializable/animal.data");
		createAnimalsFile(animals, dataFile);
		System.out.println(getAnimals(dataFile));
	}

	/** getAnimals() method return List of animals */
	public static List<Animal> getAnimals(File dataFile) throws IOException, ClassNotFoundException {

		List<Animal> animals = new ArrayList<>();

		try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(dataFile)))) {

			while (true) {
				Object obj = in.readObject();

				if (obj instanceof Animal)
					animals.add((Animal) obj);
			}
		} catch (EOFException e) {
			System.err.println("File end reached");
		}

		return animals;
	}

	/** createAnimalsFile() has no return type */
	public static void createAnimalsFile(List<Animal> animals, File dataFile) throws IOException {
		try (ObjectOutputStream out = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(dataFile)))) {
			for (Animal animal : animals) {
				out.writeObject(animal);
			}
		}
	}
}
