package com.oracle.javacert.professional.chapter01._04enums;

public enum Season2 {
	WINTER {
		@Override
		public void printHours() {
			System.out.println("Short hours");
		}
	},
	SUMMER {
		@Override
		public void printHours() {
			System.out.println("Long hours");
		}
	},
	SPRING, FALL;

	public void printHours() {
		System.out.println("Default hours");
	}
}
