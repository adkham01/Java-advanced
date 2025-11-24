package com.review.oops;

class A9{
	public A9() {
		this(10);
		System.out.println("CLass A 0 arg Parametrized Constructor");
	}	
	A9(int i){
		this(22.22f);
		System.out.println("Class A Integeral Parametrized Constructor");
	}
	A9(float f){
		this(33.333);
		System.out.println("Class A Float Parametrized Constructor");
	}
	A9(double d){
		System.out.println("Class A Double Parametrized Constructor");
	}
}
class A10{
	A10 getref1() {
		A10 a = new A10();
		return a;
	}
	A10 getref2() {
		return this;
	}
}
public class Ooop_5 {

	public static void main(String[] args) {
		A9 a1 = new A9();
		A10 a2 = new A10();
		System.out.println("\n=================================\n");
		System.out.println(a2);
		System.out.println("-----------------------");
		System.out.println(a2.getref1());
		System.out.println(a2.getref1());
		System.out.println(a2.getref1());
		System.out.println("-----------------------");
		System.out.println(a2.getref2());
		System.out.println(a2.getref2());
		System.out.println(a2.getref2());
	}

}
