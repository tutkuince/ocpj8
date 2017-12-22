package com.oracle.javacert.professional.chapter02._04designprinciples.javabeans;

public class Bird {
	private String name;
	private boolean isBird;
	private int age;
	private int numChildren;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isBird() {	// boolean getter 
		return isBird;
	}

	public void setBird(boolean isBird) {
		this.isBird = isBird;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNumChildren() {
		return numChildren;
	}

	public void setNumChildren(int numChildren) {
		this.numChildren = numChildren;
	}

}
