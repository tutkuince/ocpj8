package com.oracle.javacert.professional.chapter08._03workingstreams.filereaderandfilewriter;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
	public static void main(String[] args) throws IOException {
		File file = new File(
				"src/com/oracle/javacert/professional/chapter08/_03workingstreams/filereaderandfilewriter/filerw.txt");

		FileReader reader = new FileReader(file);

		for (int i = 0; i < file.length(); i++) {
			System.out.print((char) reader.read());
		}

		reader.close();
	}
}
