package com.oracle.javacert.professional.chapter08._02introstreams;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LowVsHighLevelStreams {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(
					"src\\com\\oracle\\javacert\\professional\\chapter08\\_01filesanddirectories\\tt.txt"));
			System.out.println(bufferedReader.readLine());
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try (ObjectInputStream objStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream(
				"src\\com\\oracle\\javacert\\professional\\chapter08\\_01filesanddirectories\\tt.txt")))) {
			System.out.println(objStream.readObject());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
