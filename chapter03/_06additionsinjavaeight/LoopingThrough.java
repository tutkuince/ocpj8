package com.oracle.javacert.professional.chapter03._06additionsinjavaeight;

import java.util.Arrays;
import java.util.List;

public class LoopingThrough {
	public static void main(String[] args) {
		List<String> cats = Arrays.asList("Annie", "Ripley", "Puki", "Panda");
		/*
		for (String cat : cats) {
			System.out.println(cat);
		}
		*/
		cats.forEach(c -> System.out.println(c));
		System.out.println("--- O R ---");
		cats.forEach(System.out::println);
	}
}
