package com.review.oops;
class A12{
	int i = 20;
	static int j = 10;
	static void method_1() {
		System.out.println("Method 1 A");
		System.out.println();
		A12 a = new A12();
		System.out.println(a.i);
	}
	void method_2() {
		System.out.println("Method_2 A");
		System.out.println(this.i);
		System.out.println(this.j);
		this.method_1();
	}
}
public class Ooop_7 {

	public static void main(String[] args) {
		A12 a = new A12();
		a.method_1();
		a = null;
		a.method_1();
		A12.method_1();

	}

}
