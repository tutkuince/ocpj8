package com.oracle.javacert.professional.chapter04._06streampipelineconcept;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Cats {
	public static void main(String[] args) {
		List<String> cats = new ArrayList<>();
		cats.add("Puki");
		cats.add("Panda");
		
		Stream<String> stream = cats.stream();
		cats.add("Barnie");
		System.out.println("Stream count is " + stream.count());
	}
}
