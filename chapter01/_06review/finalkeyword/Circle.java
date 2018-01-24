package com.oracle.javacert.professional.chapter01._06review.finalkeyword;

public class Circle extends Shape{
	@Override
	public Shape getParentShape() {
		// TODO Auto-generated method stub
		return super.getParentShape();
	}
	
	// Cannot override setParentShape() method. Cause that method use final keyword.
}
