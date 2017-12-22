package com.oracle.javacert.professional.chapter07._05parallelstreams;

import java.util.ArrayList;
import java.util.List;

public class WhaleDataCalculator {

	public static void main(String[] args) {
		WhaleDataCalculator calculator = new WhaleDataCalculator();

		// Define data
		List<Integer> data = new ArrayList<>();
		for (int i = 0; i < 4000; i++) {
			data.add(i);
		}
		
		// Process data
		long start = System.currentTimeMillis();
		// calculator.processAllData(data);	// Tasks completed nearly 40 seconds
		calculator.processAllDataWithParallel(data);	// Tasks completed nearly 5 seconds
		double time = (System.currentTimeMillis() - start) / 1000.0;
		
		// Report result
		System.out.println("\n Tasks completed in: " + time + " seconds");
	}

	public int processRecord(int input) {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return input + 1;
	}

	public void processAllData(List<Integer> data) {
		data.stream().map(a -> processRecord(a)).count();
	}
	
	public void processAllDataWithParallel(List<Integer> data) {
		data.parallelStream().map(a -> processRecord(a)).count();
	}
}
