package com.oracle.javacert.professional.chapter08._02introstreams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class SkippingOverData {
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream(
				"src\\com\\oracle\\javacert\\professional\\chapter08\\_02introstreams\\text.txt");

		System.out.print((char) is.read());	//	A = 65
		is.skip(2);		//	skip BC
		is.read();		// 	like skip(1)

		System.out.print((char) is.read());	// C
		System.out.print((char) is.read());	// D
		
		is.close();
	}
}
