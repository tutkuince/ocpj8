package com.oracle.javacert.professional.chapter09._02pathandfiles.interactingwithfiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadingAllLines {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get(
				"C:/Users/tutku/Documents/eclipse/workspace/JavaSE/JavaSE8OCP/src/com/oracle/javacert/professional/chapter09/_02pathandfiles/requirements.txt");
		
		final List<String> lines = Files.readAllLines(path);
		
		for (String line : lines) {
			System.out.println(line);
		}
	}
}
