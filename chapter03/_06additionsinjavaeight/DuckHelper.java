package com.oracle.javacert.professional.chapter03._06additionsinjavaeight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DuckHelper {
	public static int compareByWeight(Duck d1, Duck d2) {
		return d1.getWeight() - d2.getWeight();
	}
	
	public static int compareByName(Duck d1, Duck d2) {
		return d1.getName().compareTo(d2.getName());
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Comparator<Duck> byWeight = (d1, d2) -> DuckHelper.compareByWeight(d1, d2);
		Comparator<Duck> byWeight = DuckHelper::compareByWeight;
		
		// Comparator<Duck> byName = (d1, d2) -> DuckHelper.compareByName(d1, d2); 
		Comparator<Duck> byName = DuckHelper::compareByName;
		
		Duck d1 = new Duck("Quack", 20);
		Duck d2 = new Duck("DoubleQuack", 40);
		List<Duck> list = new ArrayList<>();
		list.add(d2);
		list.add(d1);
		System.out.println(list);
		Collections.sort(list, byWeight);
		System.out.println("After sorting by weight");
		System.out.println(list);
		System.out.println("--------------------------------");
		System.out.println(list);
		System.out.println("After sorting by name");
		Collections.sort(list,byName);
		System.out.println(list);
		
		Consumer<List<Integer>> methodRef1 = Collections::sort;
		Consumer<List<Integer>> lambda1 = l -> Collections.sort(l);
		
		String str = "abc";
		Predicate<String> methodRef2 = str::startsWith;
		Predicate<String> lambda2 = l -> str.startsWith(l);
		
		Predicate<String> methodRef3 = String::isEmpty;
		Predicate<String> lambda3 = l -> l.isEmpty();
		
		Supplier<ArrayList<String>> methodRef4 = ArrayList::new;
		Supplier<ArrayList<String>> lambda4 = () -> new ArrayList<>();
	}
}
