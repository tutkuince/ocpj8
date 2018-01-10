package com.oracle.javacert.professional.chapter09._02pathandfiles;

import java.nio.file.Path;
import java.nio.file.Paths;

public class CheckingPathType {
	public static void main(String[] args) {

		Path path1 = Paths.get("C:\\birds\\egret.txt");
		System.out.println("Path1 is Absolute? " + String.valueOf(path1.isAbsolute()).toUpperCase());
		System.out.println("Absolute Path1: " + path1.toAbsolutePath());

		System.out.println();

		Path path2 = Paths.get("birds/condor.txt");
		System.out.println("Path2 is Absolute? " + String.valueOf(path2.isAbsolute()).toUpperCase());
		System.out.println("Absolute Path2 " + path2.toAbsolutePath());
	}
}
