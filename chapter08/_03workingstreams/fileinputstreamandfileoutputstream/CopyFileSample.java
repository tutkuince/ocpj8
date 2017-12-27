package com.oracle.javacert.professional.chapter08._03workingstreams.fileinputstreamandfileoutputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFileSample {
	
	public static void main(String[] args) throws IOException {
		File source = new File("src\\com\\oracle\\javacert\\professional\\chapter08\\_03workingstreams\\fileinputstreamandfileoutputstream\\readwrite.txt");
		File destination = new File("src\\com\\oracle\\javacert\\professional\\chapter08\\_03workingstreams\\fileinputstreamandfileoutputstream\\readwrite.txt");
		copy(source, destination);
		System.out.println("Good job!");
	}
	
	public static void copy(File source, File destination) throws IOException {
		try (InputStream in = new FileInputStream(source); OutputStream out = new FileOutputStream(destination)) {
			int b;
			while((b = in.read()) != -1) {
				out.write(b);
				System.out.println(b);
			}
		}
	}
}
