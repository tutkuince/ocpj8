package com.oracle.javacert.professional.chapter03._07review;

import java.util.Arrays;

public class ComparableTest {
	public static void main(String[] args) {
		Student[] students = {new Student("129821","Tutku", 99), 
				new Student("113238", "Uður", 11), 
				new Student("131265", "Emin", 55),
				new Student("105423", "Sertaç", 9)};
		
		System.out.println("Before sorting by student id");
		System.out.println(Arrays.toString(students));
		
		Arrays.sort(students);
		System.out.println("-----------------");
		
		System.out.println("After sorting by student id");
		System.out.println(Arrays.toString(students));
	}
}

class Student implements Comparable<Student>{
	String id;
	String name;
	double cgpa;
	
	public Student(String id, String name, double chpa) {
		this.id = id;
		this.name = name;
		this.cgpa = chpa;
	}
	
	@Override
	public String toString() {
		return "\nID: " + id + " \tName: " + name + " \tCGPA: " + cgpa;
	}
	
	@Override
	public int compareTo(Student arg0) {
		return this.id.compareTo(arg0.id);
	}
	
}
