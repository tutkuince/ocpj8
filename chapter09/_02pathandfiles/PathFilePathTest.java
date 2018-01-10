package com.oracle.javacert.professional.chapter09._02pathandfiles;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathFilePathTest {

	public static void main(String[] args) {
		printPathInformation(Paths.get("/zoo/armadillo/shells.txt"));
		System.out.println();
		printPathInformation(Paths.get("armadillo/shells.txt"));
	}

	public static void printPathInformation(Path path) {
		System.out.println("Filename is: " + path.getFileName());
		System.out.println("\nRoot is: " + path.getRoot());

		Path currentPath = path;

		while ((currentPath = currentPath.getParent()) != null) {
			System.out.println("\tCurrent parent is: " + currentPath);
		}
	}
}
