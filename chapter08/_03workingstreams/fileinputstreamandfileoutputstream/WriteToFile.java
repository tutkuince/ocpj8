package com.oracle.javacert.professional.chapter08._03workingstreams.fileinputstreamandfileoutputstream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteToFile {
	public static void main(String[] args) throws IOException {
		char[] letters = { 'T', 'U', 'T', 'K', 'U' };

		File file = new File(
				"src/com/oracle/javacert/professional/chapter08/_03workingstreams/fileinputstreamandfileoutputstream/write.txt");

		if (file.exists()) {
			OutputStream out = new FileOutputStream(file);

			for (char c : letters) {
				out.write((int) c);
				System.out.println((int) c);
			}
			
			out.close();
		}
	}
}
