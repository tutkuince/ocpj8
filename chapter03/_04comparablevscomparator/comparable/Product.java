package com.oracle.javacert.professional.chapter03._04comparablevscomparator.comparable;

public class Product implements Comparable<Product>{
	private int id;
	private String name;
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Product))
			return super.equals(obj);
		
		Product other = (Product) obj;
		return this.id == other.id;
	}
	
	@Override
	public int compareTo(Product product) {
		return this.name.compareTo(product.name);
	}
	
	@Override
	public String toString() {
		return name;
	}
}
