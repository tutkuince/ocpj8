package com.oracle.javacert.professional.chapter08._03workingstreams.bufferedreaderandbufferedwriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	public static void main(String[] args) throws IOException {
		File file = new File("src/com/oracle/javacert/professional/chapter08/_03workingstreams/bufferedreaderandbufferedwriter/bufferedrw.txt");
		
		BufferedWriter writer = null;
		
		if(file.exists()) {
			writer = new BufferedWriter(new FileWriter(file));
			
			writer.write("Tutku INCE");	// writes copy of the file to disk
			writer.flush();		// force to write to disk
			
			System.out.println("Mission completed!");
		}
	}
}
