package com.oracle.javacert.professional.chapter04._06streampipelineconcept;

import java.io.*;
import java.util.*;
import java.util.function.Supplier;

public class ExceptionCaseStudy {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Supplier<List<String>> s = ExceptionCaseStudy::create; // DOES NOT COMPILE

		Supplier<List<String>> s = () -> {
			try {
				return ExceptionCaseStudy.create();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		};
		
		Supplier<List<String>> s2 = ExceptionCaseStudy::createSafe;
	}

	public static List<String> create() throws IOException {
		throw new IOException();
	}
	
	public static List<String> createSafe(){
		try {
			return ExceptionCaseStudy.create();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
