package com.oracle.javacert.professional.chapter09._02pathandfiles;

import java.nio.file.Path;
import java.nio.file.Paths;

public class DerivingPathWithRelativize {
	public static void main(String[] args) {
		
		Path path1 = Paths.get("fish.txt");
		Path path2 = Paths.get("birds.txt");
		
		System.out.println(path1.relativize(path2));
		System.out.println(path2.relativize(path1));
		
		System.out.println();
		
		Path path3 = Paths.get("E:\\habitat");
		Path path4 = Paths.get("E:\\santuary\\raven");
		
		System.out.println(path3.relativize(path4));
		System.out.println(path4.relativize(path3));
	}
}
