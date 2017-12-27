package com.oracle.javacert.professional.chapter08._03workingstreams.fileinputstreamandfileoutputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadFromFile {
	public static void main(String[] args) {
		File file = new File(
				"src/com/oracle/javacert/professional/chapter08/_03workingstreams/fileinputstreamandfileoutputstream/write.txt");
		InputStream in = null;
		if (file.exists()) {
			try {
				in = new FileInputStream(file);

				for (int i = 0; i < file.length(); i++) {
					System.out.print((char) in.read());
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
