package com.oracle.javacert.professional.chapter09._01intronio;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ConvertingPathToFile {
	public static void main(String[] args) {
		Path path = Paths.get("cuddly.png");
		
		@SuppressWarnings("unused")
		File file = path.toFile();
		
		
	}
}
