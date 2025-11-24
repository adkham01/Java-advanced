package com.review.oops;
class A11{ 
	static int i = 10;
	int j = 10;
}
public class Ooop_6 {

	public static void main(String[] args) {
		A11 a1 = new A11();
		System.out.println(a1.j+" "+a1.i);
		a1.i += 1;
		a1.j += 1;
		System.out.println(a1.j+" "+a1.i);
		System.out.println();
		
		A11 a2 = new A11();
		System.out.println(a2.j+" "+a2.i);
		a2.i += 1;
		a2.j += 1;
		System.out.println(a2.j+" "+a2.i);
		System.out.println();
		
		A11 a3 = new A11();
		System.out.println(a3.j+" "+a3.i);
		a3.i += 1;
		a3.j += 1;
		System.out.println(a3.j+" "+a3.i);
		System.out.println();
		
		System.out.println(a1.i+" "+a1.j);
		System.out.println(a2.i+" "+a2.j);
		System.out.println(a3.i+" "+a2.j);
		
	}

}
