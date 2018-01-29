package com.oracle.javacert.professional.chapter02._06review.lambdas;

public class BlockLambda {
	interface LambdaFunction{
		String intKind(int a);
	}
	
	public static void main(String[] args) {
		LambdaFunction lf = (int a) -> {
			if(a % 2 == 0)
				return "Even";
			else
				return "Odd";
		};
		
		System.out.println(lf.intKind(10));
	}
}
