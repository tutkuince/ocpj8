package com.oracle.javacert.professional.chapter03._02generics;

import java.util.List;

public class LowerBoundedWildcards {
	public static void main(String[] args) {
		
	}
	
	public static void addSound(List<? super String> list) {
		list.add("quack");
	}
}
