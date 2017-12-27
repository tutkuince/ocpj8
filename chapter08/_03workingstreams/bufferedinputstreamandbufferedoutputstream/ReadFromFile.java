package com.oracle.javacert.professional.chapter08._03workingstreams.bufferedinputstreamandbufferedoutputstream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadFromFile {
	public static void main(String[] args) {
		File file = new File(
				"src/com/oracle/javacert/professional/chapter08/_03workingstreams/bufferedinputstreamandbufferedoutputstream/buffered.txt");

		InputStream in = null;

		try {
			in = new BufferedInputStream(new FileInputStream(file));

			for (int i = 0; i < file.length(); i++) {
				System.out.print((char) in.read());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
