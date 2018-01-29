package com.oracle.javacert.professional.chapter02._06review.lambdas;

public class MyLambda {
	public static void main(String[] args) {
		LambdaFunction lf = () -> System.out.println("Hello lambda!");
		lf.call();
	}
}

interface LambdaFunction {
	void call();
}
