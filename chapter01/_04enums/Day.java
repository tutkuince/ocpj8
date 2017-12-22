package com.oracle.javacert.professional.chapter01._04enums;

public enum Day {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
	
	public static void main(String[] args) {
		String nameOfDay = Day.FRIDAY.name();
		System.out.println("name of day : " + nameOfDay);
		
		int ordinal = Day.FRIDAY.ordinal();
		System.out.println("ordinal : " + ordinal);
		
		System.out.println("- - - - - ");
		
		Day[] days = Day.values();
		for (Day day : days) {
			System.out.println(day);
		}
		
		System.out.println("- - - - - ");
		
		System.out.println("toString() of Day.MONDAY : " + Day.MONDAY.toString());
		
		boolean b1 = Day.MONDAY.toString() == Day.MONDAY.toString();
		System.out.println("Day.MONDAY == Day.MONDAY : " + b1);
		
		boolean b2 = Day.MONDAY == Day.SUNDAY;
		System.out.println("Day.MONDAY == Day.SUNDAY : " + b2);
	}
}
