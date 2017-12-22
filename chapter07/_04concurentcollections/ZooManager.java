package com.oracle.javacert.professional.chapter07._04concurentcollections;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ZooManager {
	
	public static void main(String[] args) {
		ZooManager zm = new ZooManager();
		
		zm.put("penguin", "1");
		zm.put("flamingo", "2");
		
		// for (String string : foodData.keySet()) {
		//	foodData.remove(string);	// ConcurentModificationError
		//}
		
		zm.put2("penguin", "1");
		zm.put2("flamingo", "2");
		
		for (String string : foodData2.keySet()) {
			foodData2.remove(string);
		}
	}
	
	private static Map<String, String> foodData = new HashMap<>();

	public synchronized void put(String key, String value) {
		foodData.put(key, value);
	}

	public synchronized String get(String key) {
		return foodData.get(key);
	}
	
	
	private static Map<String, String> foodData2 = new ConcurrentHashMap<>();
	
	public void put2(String key, String value) {
		foodData2.put(key, value);
	}
	
	public String get2(String key) {
		return foodData2.get(key);
	}
}
