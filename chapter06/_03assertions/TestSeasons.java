package com.oracle.javacert.professional.chapter06._03assertions;

public class TestSeasons {
	public static void main(String[] args) {
		test(Seasons.WINTER);
	}
	
	public static void test(Seasons s) {
		switch (s) {
		case SPRING:
		case FALL:
			System.out.println("Shorter hours");
			break;
		case SUMMER:
			System.out.println("Longer hours");
			break;
		default:
			assert false : "Invalid season";
		}
	}
}
