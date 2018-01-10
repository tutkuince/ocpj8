package com.oracle.javacert.professional.chapter09._02pathandfiles;

import java.nio.file.Path;
import java.nio.file.Paths;

public class JoiningPathWithResolve {
	public static void main(String[] args) {
		final Path path1 = Paths.get("/cats/../panter");
		final Path path2 = Paths.get("food");
		
		System.out.println(path1.resolve(path2));
	}
}
