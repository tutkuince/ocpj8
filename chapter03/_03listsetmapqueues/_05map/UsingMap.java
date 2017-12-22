package com.oracle.javacert.professional.chapter03._03listsetmapqueues._05map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class UsingMap {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("koala", "bamboo");
		map.put("lion", "meat");
		map.put("giraffe", "leaf");
		String food = map.get("koala");
		System.out.println("koala's food : " + food);
		
		for (String string : map.keySet()) {
			System.out.print(string + ", ");
		}
		
		System.out.println("\n--------------------------");
		
		Map<String, String> map2 = new TreeMap<>();
		map2.put("mouse", "cheese");
		map2.put("cat", "mouse");
		map2.put("dog", "meat");
		String food2 = map2.get("cat");
		System.out.println("cat's food : " + food2);
		for (String string : map2.keySet()) {
			System.out.print(string + ", ");
		}
	}
}
