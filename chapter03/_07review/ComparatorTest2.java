package com.oracle.javacert.professional.chapter03._07review;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest2 {
	public static void main(String[] args) {
		Student[] students = {new Student("129821","Tutku", 99), 
				new Student("113238", "Uður", 11), 
				new Student("131265", "Emin", 55),
				new Student("105423", "Sertaç", 9)};
		
		System.out.println("Before sort by id");
		System.out.println(Arrays.toString(students));
		
		Comparator<Student> byId = (s1, s2) -> Integer.valueOf(s1.id) - Integer.valueOf(s2.id);	//asc order
		
		Arrays.sort(students, byId);
		System.out.println("-------------");
		
		System.out.println("After sort by id");
		System.out.println(Arrays.toString(students));
	}
}
