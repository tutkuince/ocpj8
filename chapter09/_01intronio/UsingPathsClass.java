package com.oracle.javacert.professional.chapter09._01intronio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class UsingPathsClass {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Path path1 = Paths.get("src\\com\\oracle\\javacert\\professional\\chapter08\\_01filesanddirectories\\tt.txt");
		// java.nio.file.Path is an interface, you need a factory class to create instances of one (Paths class).
		
		Path path2 = Paths.get(path1.getParent().toString());
		
		Path path3 = Paths.get("src\\com\\oracle\\javacert\\professional\\chapter08\\_01filesanddirectories");
		
		/*
		 
		 + If a path starts with a forward slash, it is an absolute path, such as /bird/parrot.
		 
		 + If a path starts with a drive letter, it is an absolute path, such as C:\bird\parrot.
		 
		 + Otherwise, it is a relative path, such as ..\eagle.
		  
		 */
		
		Path path4 = Paths.get("_01filesanddirectories", "tt.txt");

		Path path5 = Paths.get("/", "chapter08", "_01filesanddirectories");

		String separator = System.getProperty("file.separator");

		Path path6 = Paths.get((separator + separator), "chapter08");
		
	}
}
