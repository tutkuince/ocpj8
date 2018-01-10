package com.oracle.javacert.professional.chapter09._02pathandfiles;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathObject {
	public static void main(String[] args) {
		Path path = Paths.get("/land/hippo/harry.happy");

		System.out.println("The Path Name is: " + path);

		for (int i = 0; i < path.getNameCount(); i++) {
			System.out.println("\tElement " + i + " is: " + path.getName(i));
		}
		
		System.out.println("\nPath is: " + path.toString());
	}
}
