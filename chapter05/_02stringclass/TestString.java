package com.oracle.javacert.professional.chapter05._02stringclass;

public class TestString {
	public static void main(String[] args) {
		String s1 = "bunny";
		String s2 = "bunny";
		String s3 = new String("bunny");
		String s4 = new String(s3);
		
		System.out.println("s1 == s2 : " + (s1 == s2));
		System.out.println("s1 == s3 : " + (s1 == s3));
		System.out.println("s1.equals(s3) : " + (s1.equals(s3)));
		System.out.println("s3 == s4 : " + (s3 == s4));
		System.out.println("s4.equals(s4) : " + (s3.equals(s4)));
		
		System.out.println("---------------------");
		
		String s5 = "1" + 2 + 3;
		System.out.println("s5 : " + s5);
		String s6 = 1 + 2 + "3";
		System.out.println("s6 : " + s6);
		
		System.out.println("---------------------");
		
		String s = "abcde ";
		System.out.println(s.trim().length());
		System.out.println(s.charAt(4));
		System.out.println(s.indexOf('e'));
		System.out.println(s.indexOf("de"));
		System.out.println(s.substring(2, 4).toUpperCase());
		System.out.println(s.replace('a', '1'));
		System.out.println(s.contains("DE"));
		System.out.println(s.startsWith("a"));
	}
}
