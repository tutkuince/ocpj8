package com.oracle.javacert.professional.chapter09._01intronio;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class URIExamples {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws URISyntaxException {

		// Path path1 = Paths.get(new
		// URI("file:src\\com\\oracle\\javacert\\professional\\chapter08\\_01filesanddirectories"));
		// Runtime Exception

		File file = new File("src\\com\\oracle\\javacert\\professional\\chapter08\\_01filesanddirectories\\tt.txt");

		String absolutePath = file.getAbsolutePath();

		Path path2 = Paths.get(new URI(
				"file:///C:/Users/tutku/Documents/eclipse/workspace/JavaSE/JavaSE8OCP/src/com/oracle/javacert/professional/chapter08/_01filesanddirectories/tt.txt"));
		
		Path path3 = Paths.get(new URI("http://www.muditasoft.com"));
		
		URI uri = path3.toUri();
		
		Path path4 = Paths.get(new URI("ftp://username:pasword@ftp.the-ftp-server.com"));
		
	}
}
