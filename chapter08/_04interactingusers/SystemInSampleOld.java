package com.oracle.javacert.professional.chapter08._04interactingusers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInSampleOld {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String userInput = reader.readLine();
		
		System.out.println("You enterede the following: " + userInput);
	}
}
