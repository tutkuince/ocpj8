package com.oracle.javacert.professional.chapter09._02pathandfiles.interactingwithfiles;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadingFileData {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get(
				"C:/Users/tutku/Documents/eclipse/workspace/JavaSE/JavaSE8OCP/src/com/oracle/javacert/professional/chapter09/_02pathandfiles/text.txt");

		if (Files.exists(path)) {
			try (BufferedReader reader = Files.newBufferedReader(path, Charset.forName("UTF-16"))) {

				String currentLine;

				while ((currentLine = reader.readLine()) != null) {
					System.out.println(currentLine);
				}
			}
		}
	}
}
