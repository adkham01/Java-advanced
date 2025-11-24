package com.review.oops;
class A13{
	void add(int i, int j) {
		System.out.println("Addition : "+(i+j));
	}
	void add(float f, float k) {
		System.out.println("Addition : "+(f+k));
	}
	void add(String str1, String str2) {
		System.out.println("Concatination : "+str1+str2);
	}
}
public class Ooop_18 {

	public static void main(String[] args) {
		A13 a = new A13();
		a.add(25, 25);
		a.add(84.1f, 15.9f);
		a.add("Core ", "Java");
	}

}
