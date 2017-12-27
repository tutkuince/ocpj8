package com.oracle.javacert.professional.chapter08._01filesanddirectories;

import java.io.File;

public class ReadFileInformation {
	public static void main(String[] args) {
		File file = new File("src\\com\\oracle\\javacert\\professional\\chapter08\\_01filesanddirectories\\tt.txt");
		
		System.out.println("File exists: " + file.exists());
		
		if(file.exists()) {
			System.out.println("Absolute path: " + file.getAbsolutePath());
			System.out.println("Is directory: " + file.isDirectory());
			System.out.println("Parent path: " + file.getParent());
			
			if(file.isFile()) {
				System.out.println("File size: " + file.length());
				System.out.println("File LastModified: " + file.lastModified());
			} else {
				for (File subFile : file.listFiles()) {
					System.out.println("\t" + subFile.getName());
				}
			}
		}
	}
}
