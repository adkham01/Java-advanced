package com.review.oops;
class A14{
	
}
class B5 extends A14{
	
}
class C5{
	
}
public class Ooop_19 {

	public static void main(String[] args) {
		A14 a = new A14();
		B5 b = new B5();
		C5 c = new C5();
		System.out.println(a instanceof A14);
		System.out.println(b instanceof A14);
		System.out.println(b instanceof B5);
		System.out.println(c instanceof C5);

	}

}
