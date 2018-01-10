package com.oracle.javacert.professional.chapter09._04newstreammethods;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PrintingFileContents {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get(
				"C:/Users/tutku/Documents/eclipse/workspace/JavaSE/JavaSE8OCP/src/com/oracle/javacert/professional/chapter09/_02pathandfiles/requirements.txt");
		
		// Files.lines(path).forEach(System.out::println);
		
		Files.lines(path).filter(s -> !s.equals("TOPICS")).forEach(s -> System.out.println(s));
	}
}
