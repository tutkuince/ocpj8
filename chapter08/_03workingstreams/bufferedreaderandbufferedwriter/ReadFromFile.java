package com.oracle.javacert.professional.chapter08._03workingstreams.bufferedreaderandbufferedwriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
	public static void main(String[] args) throws IOException {
		File file = new File(
				"src/com/oracle/javacert/professional/chapter08/_03workingstreams/bufferedreaderandbufferedwriter/bufferedrw.txt");
		
		BufferedReader reader = null;
		
		if(file.exists()) {
			reader = new BufferedReader(new FileReader(file));
			
			System.out.println(reader.readLine());
		}
	}
}
