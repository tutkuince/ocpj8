package com.oracle.javacert.professional.chapter08._02introstreams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MarkingTheStream {
	public static void main(String[] args) throws IOException {

		InputStream is = new FileInputStream(
				"src\\com\\oracle\\javacert\\professional\\chapter08\\_02introstreams\\text.txt");

		System.out.print((char) is.read());

		if (is.markSupported()) {
			is.mark(100);
			System.out.println((char) is.read());
			System.out.println((char) is.read());
			is.reset();
		}

		System.out.print((char) is.read());
		System.out.print((char) is.read());
		System.out.print((char) is.read());

		is.close();
	}
}
