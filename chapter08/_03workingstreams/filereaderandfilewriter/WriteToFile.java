package com.oracle.javacert.professional.chapter08._03workingstreams.filereaderandfilewriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	public static void main(String[] args) throws IOException {
		File file = new File(
				"src/com/oracle/javacert/professional/chapter08/_03workingstreams/filereaderandfilewriter/filerw.txt");

		FileWriter writer = new FileWriter(file);

		writer.write(new char[] { 'T', 'U', 'T', 'K', 'U', ' ', 'I', 'N', 'C', 'E' });

		writer.close();
	}
}
