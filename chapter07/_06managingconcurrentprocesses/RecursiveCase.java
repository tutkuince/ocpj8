package com.oracle.javacert.professional.chapter07._06managingconcurrentprocesses;

public class RecursiveCase {
	public static void main(String[] args) {
		System.out.println(factorial(3));
	}

	public static int factorial(int n) {
		if (n <= 1)
			return 1;
		else
			return n * factorial(n - 1);
	}
}
