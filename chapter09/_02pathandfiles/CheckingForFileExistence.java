package com.oracle.javacert.professional.chapter09._02pathandfiles;

import java.io.IOException;
import java.nio.file.Paths;

public class CheckingForFileExistence {
	public static void main(String[] args) throws IOException {
		System.out.println(Paths.get("/zebra/food.source").toRealPath());
		
		System.out.println(Paths.get(".././food.txt").toRealPath());
	}
}
