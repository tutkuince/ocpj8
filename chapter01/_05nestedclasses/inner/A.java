package com.oracle.javacert.professional.chapter01._05nestedclasses.inner;

public class A {
	private int x = 10;

	class B {
		private int x = 20;

		class C {
			private int x = 30;

			public void allTheX() {
				System.out.println("C'x : " + x);
				System.out.println("C'x : " + this.x);
				System.out.println("B'x : " + B.this.x);
				System.out.println("A'x : " + A.this.x);
			}
		}
	}

	public static void main(String[] args) {
		A a = new A();

		A.B b = a.new B();

		A.B.C c = b.new C();

		c.allTheX();
	}
}
