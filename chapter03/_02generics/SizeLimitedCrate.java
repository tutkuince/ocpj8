package com.oracle.javacert.professional.chapter03._02generics;

public class SizeLimitedCrate<T, U> {
	private T contents;
	private U sizeLimit;

	public SizeLimitedCrate(T contents, U sizeLimit) {
		this.contents = contents;
		this.sizeLimit = sizeLimit;
	}

	public T getContents() {
		return contents;
	}

	public void setContents(T contents) {
		this.contents = contents;
	}

	public U getSizeLimit() {
		return sizeLimit;
	}

	public void setSizeLimit(U sizeLimit) {
		this.sizeLimit = sizeLimit;
	}

	/* Main method */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Elephant elephant = new Elephant();
		Integer numPounds = 15_000;
		
		SizeLimitedCrate<Elephant, Integer> c1 = new SizeLimitedCrate<Elephant, Integer>(elephant, numPounds);
	}
}
