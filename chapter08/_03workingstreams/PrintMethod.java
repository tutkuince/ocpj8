package com.oracle.javacert.professional.chapter08._03workingstreams;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import com.oracle.javacert.professional.chapter08._03workingstreams.serializable.Animal;

public class PrintMethod {
	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter out = new PrintWriter("zoo.log");

		out.print(5); // PrintWriter method
		out.write(String.valueOf(5)); // Writer method

		out.print(2.0); // PrintWriter method
		out.write(String.valueOf(2.0)); // Writer method
		
		Animal animal = new Animal("Cat", 1, 'C');
		out.print(animal);
		out.write(animal == null ? "null" : animal.toString());
		
		out.close();
	}
}
