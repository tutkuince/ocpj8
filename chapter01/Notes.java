package com.oracle.javacert.professional.chapter01;

public class Notes {
	public static void main(String[] args) {
		String s1 = new String("s1");
		String s2 = new String(s1);
		String s3 = "s1";
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		System.out.println("--------");
		
		boolean b = null instanceof Object;
		System.out.println("null instanceof Object : " + b);
		
		
		
	}
}

class HeavyAnimal{
	
}

class Hippo extends HeavyAnimal{
	
}

class Elephant extends HeavyAnimal{
	
}
