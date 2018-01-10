package com.oracle.javacert.professional.chapter09._01intronio;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class FileSystemObject {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws URISyntaxException {

		Path path1 = FileSystems.getDefault().getPath("pandas/cuddly.png");

		Path path2 = FileSystems.getDefault().getPath("c:", "zooinfo", "November", "employees.txt.");

		Path path3 = FileSystems.getDefault().getPath("/home/zoodirector");

		FileSystem fileSystem = FileSystems.getFileSystem(new URI("http://www.muditasoft.com"));

		Path path = fileSystem.getPath("employees.txt");
	}
}
