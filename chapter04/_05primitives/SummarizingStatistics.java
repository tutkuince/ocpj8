package com.oracle.javacert.professional.chapter04._05primitives;

import java.util.IntSummaryStatistics;
import java.util.OptionalInt;
import java.util.stream.IntStream;


public class SummarizingStatistics {
	public static void main(String[] args) {
		
	}
	
	public static int max(IntStream ints) {
		OptionalInt optional = ints.max();
		return optional.orElseThrow(RuntimeException::new);
	}
	
	public static int range(IntStream ints) {
		IntSummaryStatistics stats = ints.summaryStatistics();
		if(stats.getCount() == 0)
			throw new RuntimeException();
		return stats.getMax() - stats.getMin();
	}
}
