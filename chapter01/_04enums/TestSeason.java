package com.oracle.javacert.professional.chapter01._04enums;

public class TestSeason {
	public static void main(String[] args) {
		Season s = Season.SUMMER;
		System.out.println("Season.SUMMER : " + Season.SUMMER);
		System.out.println("s == Season.SUMMER : " + (s == Season.SUMMER));
		
		for (Season season : Season.values()) {
			System.out.println(season.name() + " " + season.ordinal());
		}
		
		Season summer = Season.SUMMER;
		
		switch (summer) {
		case WINTER:
			System.out.println("Get out the sled!");
			break;
		case SUMMER:
			System.out.println("Time for the pool!");
			break;
		default:
			System.out.println("Is it summer yet?");
		}
		
		switch (summer.ordinal()) {
		case 0:
			System.out.println("Get out the sled!");
			break;
		case 2:
			System.out.println("Time for the pool!");
			break;
		default:
			System.out.println("Is it summer yet?");
		}
	}
}
