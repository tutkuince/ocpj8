package com.oracle.javacert.professional.chapter03._02generics;

public class Crate<T> {
	private T contents;
	
	public T emptyCrate() {
		return contents;
	}
	
	
	
	public void packCrate(T contents) {
		this.contents = contents;
	}
	
	public static void main(String[] args) {
		Elephant elephant = new Elephant();
		Crate<Elephant> crateForElephant = new Crate<>();
		crateForElephant.packCrate(elephant);
		
		
		Zebra zebra = new Zebra();
		Crate<Zebra> crateForZebra = new Crate<>();
		crateForZebra.packCrate(zebra);
		
	}
}

class Elephant{
	
}

class Zebra{
	
}

class Robot{
	
}
