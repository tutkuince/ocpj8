package com.oracle.javacert.professional.chapter08._03workingstreams.bufferedinputstreamandbufferedoutputstream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteToFile {
	public static void main(String[] args) throws IOException {
		File file = new File(
				"src/com/oracle/javacert/professional/chapter08/_03workingstreams/bufferedinputstreamandbufferedoutputstream/buffered.txt");

		OutputStream out = null;

		try {
			if (file.exists()) {
				out = new BufferedOutputStream(new FileOutputStream(file));

				char[] chars = { 'T', 'U', 'T', 'K', 'U', ' ', 'I', 'N', 'C', 'E' };

				byte[] bytes = new byte[chars.length];

				for (int i = 0; i < chars.length; i++) {
					bytes[i] = (byte) chars[i];
				}

				out.write(bytes);
				out.flush();
				System.out.println("Mission completed!");
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			out.close();
		}

	}
}
