package com.oracle.javacert.professional.chapter06._01customexceptions;

public class AutoCloseableTest2 implements AutoCloseable {
	int num;

	public AutoCloseableTest2(int num) {
		this.num = num;
	}

	@Override
	public void close() {
		System.out.println("Close: " + num);
	}

	public static void main(String[] args) {
		try (AutoCloseableTest2 a1 = new AutoCloseableTest2(1); AutoCloseableTest2 a2 = new AutoCloseableTest2(2)) {
			throw new RuntimeException();
		} catch (Exception e) {
			System.out.println("ex");
		} finally {
			System.out.println("finally");
		}
	}
}
