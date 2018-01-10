package com.oracle.javacert.professional.chapter09._02pathandfiles;

import java.nio.file.Path;
import java.nio.file.Paths;

public class CleaningUpPathWithNormalize {
	public static void main(String[] args) {
		
		Path path1 = Paths.get("E:\\data");
		Path path2 = Paths.get("E:\\user\\home");
		
		Path relativePath = path1.relativize(path2);
		System.out.println(relativePath);
		
		System.out.println(path1.resolve(relativePath));
		System.out.println(path1.resolve(relativePath).normalize());
	}
}
