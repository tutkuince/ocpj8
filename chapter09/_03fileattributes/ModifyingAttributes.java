package com.oracle.javacert.professional.chapter09._03fileattributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class ModifyingAttributes {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get(
				"C:/Users/tutku/Documents/eclipse/workspace/JavaSE/JavaSE8OCP/src/com/oracle/javacert/professional/chapter09/_02pathandfiles/requirements.txt");

		BasicFileAttributeView view = Files.getFileAttributeView(path, BasicFileAttributeView.class);

		BasicFileAttributes data = view.readAttributes();

		FileTime lastModifiedTime = FileTime.fromMillis(data.lastModifiedTime().toMillis() + 10_000);
		
		view.setTimes(lastModifiedTime, null, null);
		
		System.out.println("Is path a directory? " + data.isDirectory());
		System.out.println("Is path a regular file? " + data.isRegularFile());
		System.out.println("Is path a symbolic link? " + data.isSymbolicLink());
		System.out.println("Path not a file, directory, nor symbolic link? " + data.isOther());
		
		System.out.println("Size (in bytes): " + data.size());
		
		System.out.println("Creation date/time: " + data.creationTime());
		System.out.println("Last modified date/time: " + data.lastModifiedTime());
		System.out.println("Last accessed date/time: " + data.lastAccessTime());
		System.out.println("Unique file identifier (if available): " + data.fileKey());
	}
}
