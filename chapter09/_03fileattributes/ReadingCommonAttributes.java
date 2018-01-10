package com.oracle.javacert.professional.chapter09._03fileattributes;

import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadingCommonAttributes {
	public static void main(String[] args) {
		Files.isDirectory(Paths.get("/canine/coyote/fur.jpg"));
		
		Files.isRegularFile(Paths.get("/canine/types.txt"));
		
		Files.isSymbolicLink(Paths.get("/canine/coyote"));
	}
}
