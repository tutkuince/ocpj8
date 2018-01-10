package com.oracle.javacert.professional.chapter09._01intronio;

import java.io.File;
import java.nio.file.Path;

public class ConvertingFileToPath {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		File file = new File("pandas/cuddly.png");
		
		Path path = file.toPath();
	}
}
