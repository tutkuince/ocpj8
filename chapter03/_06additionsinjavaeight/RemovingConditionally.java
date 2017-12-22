package com.oracle.javacert.professional.chapter03._06additionsinjavaeight;

import java.util.ArrayList;
import java.util.List;

public class RemovingConditionally {
	public static void main(String[] args) {
		List<String> jobs = new ArrayList<>();
		jobs.add("Java Developer");		// [Java Developer]
		jobs.add("Assistant");			// [Java Developer, Assistant]
		jobs.add("Android Developer");	// [Java Developer, Assistant, Android Developer]
		System.out.println(jobs);
		jobs.removeIf(s -> s.startsWith("A"));
		System.out.println("A F T E R  r e m o v e I f ( )");
		System.out.println(jobs);
	}
}
