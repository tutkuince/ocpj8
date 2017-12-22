package com.oracle.javacert.professional.chapter03._04comparablevscomparator.comparable;

@SuppressWarnings("rawtypes")
public class LegacyDuck implements Comparable {
	private String name;

	@Override
	public int compareTo(Object o) {
		LegacyDuck d = (LegacyDuck) o;	// cast because no generic
		return name.compareTo(d.name);
	}
}
