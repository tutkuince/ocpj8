package com.oracle.javacert.professional.chapter09._03fileattributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;

public class FileVisibility {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get(
				"C:/Users/tutku/Documents/eclipse/workspace/JavaSE/JavaSE8OCP/src/com/oracle/javacert/professional/chapter09/_02pathandfiles/requirements.txt");
		
		System.out.println("File is hidden? " + Files.isHidden(path));
		
		System.out.println("File is readable? " + Files.isReadable(path));
		
		System.out.println("File is executable? " + Files.isExecutable(path));
		
		System.out.println("File size is: " + Files.size(path));
		
		Files.setLastModifiedTime(path, FileTime.fromMillis(System.currentTimeMillis()));
		
		System.out.println("File's last modified time is: " + Files.getLastModifiedTime(path).toMillis());
		
		System.out.println("File's owner is " + Files.getOwner(path));

	}
}
