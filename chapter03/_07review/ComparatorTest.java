package com.oracle.javacert.professional.chapter03._07review;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest {
	public static void main(String[] args) {
		Employee[] employees = { new Employee("129821", "Tutku", 9999), new Employee("113238", "Uður", 1111),
				new Employee("131265", "Emin", 5555), new Employee("105423", "Sertaç", 999) };

		System.out.println("Before sorting by salary");
		System.out.println(Arrays.toString(employees));

		Arrays.sort(employees, new SalaryComparator());
		System.out.println("--------------");

		System.out.println("After sorting by salary");
		System.out.println(Arrays.toString(employees));
	}
}

class Employee {
	String id;
	String name;
	Double salary;

	public Employee(String id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "\nID: " + id + "\t Name: " + name + "\tSalary: " + salary; 
	}
}

class SalaryComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.salary.compareTo(emp2.salary);
	}
}
