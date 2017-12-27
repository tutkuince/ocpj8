package com.oracle.javacert.professional.chapter08._01filesanddirectories;

import java.io.File;

public class FileSample {
	public static void main(String[] args) {
		System.out.println("The local separator character: " + System.getProperty("file.separator"));
		System.out.println("The local separator character: " + java.io.File.separator);
		
		
		System.out.println("-------------");
		
		File file = new File("\\home\\smith\\data\\zoo.txt");	// absolute path
		System.out.println(file.exists());
		
		System.out.println("-------------");
		
		File parent = new File("/home/smith");
		File child = new File(parent,"data/zoo.txt");
		System.out.println(child.exists());
		
		System.out.println("-------------");
		
		File file2 = new File("C:\\Users\\tutku\\Desktop\\tt.txt");
		System.out.println(file2.exists());
	}
}
