package com.oracle.javacert.professional.chapter05._02stringclass;

public class TestStringBuilder {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append(12345).append('-');
		System.out.println(sb.length());
		System.out.println(sb.indexOf("-"));
		System.out.println(sb.charAt(2));
		
		System.out.println("-----------------");
		
		StringBuilder sb2 = sb.reverse();
		System.out.println(sb.toString());
		System.out.println(sb2.toString());
		System.out.println(sb == sb2);
		
		System.out.println("-----------------");
		
		StringBuilder sb3 = new StringBuilder("abcde");
		sb3.insert(1, '-').delete(3, 4);
		System.out.println(sb3);
		System.out.println(sb3.substring(2, 4));
	}
}
