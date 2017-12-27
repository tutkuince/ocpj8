package com.oracle.javacert.professional.chapter08._01filesanddirectories;

import java.io.File;

public class FileClassMethods {
	public static void main(String[] args) {
		File file = new File(
				"src\\com\\oracle\\javacert\\professional\\chapter08\\_01filesanddirectories\\tt.txt");

		System.out.println("exists(): " + file.exists());
		System.out.println("getName(): " + file.getName());
		System.out.println("getAbsolutePath(): " + file.getAbsolutePath());
		System.out.println("isDirectory(): " + file.isDirectory());
		System.out.println("isFile(): " + file.isFile());
		System.out.println("lenth(): " + file.length()); // number of bytes in the file
		System.out.println("lastModified(): " + file.lastModified()); // returns number of milliseconds
		// System.out.println("delete(): " + file.delete()); // deletes the file or
		// directory
		System.out.println("renameTo(file): " + file.renameTo(new File(
				"src\\com\\oracle\\javacert\\professional\\chapter08\\_01filesanddirectories\\copy\\tt.txt")));
		
		System.out.println("getParent(): " + file.getParent());
		
		System.out.println("-----------");
		
		for (File file2 : file.getParentFile().listFiles()) {
			System.out.println(file2.getName());
		}
	}
}
