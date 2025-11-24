package com.review.oops;
class A5{
	String eid;
	String ename;
	float esal;
	String eaddr;
	public A5() {
		eid = "E-111";
		ename = "Durga";
		esal = 56645132f;
		eaddr = "Hyd";
	}
	void getEmpDetails() {
		System.out.println("Employee Details ");
		System.out.println("----------------------------");
		System.out.println("Employee ID     : "+eid);
		System.out.println("Employee Name   : "+ename);
		System.out.println("Employee Salary : "+esal);
		System.out.println("Employee Addres : "+eaddr);
	}
	
}
class A6 {
	int i,j,k;
	public A6() {
		
	}
	public A6(int i1) {
		i = i1;
	}
	public A6(int i1, int j1) {
		i = i1;
		j = j1;
	}
	public A6(int i1, int j1,int k1) {
		i = i1;
		j = j1;
		k = k1;
	}
	void add() {
		System.out.println("Addition : "+(i+j+k));
	}
}
class A7 {
	int method_1() {
		System.out.println("method_1 - A");
		return 10;
	}
	{
		System.out.println("IB - A");
	}
	int i = method_2();
	public A7() {
		System.out.println("A - CON");
	}
	int j = method_1();
	{
		System.out.println("Instance Block2 A");
	}
	int method_2() {
		System.out.println("Method 1 - A");
		return 20;
	}
}
public class Ooop_3 {

	public static void main(String[] args) {
		emp();
		System.out.println("\n=========================\n");
		mutableObj();
		System.out.println("\n=========================\n");
		A7 a = new A7();
		System.out.println("\n=========================\n");
 		paramCon();
	}
	public static void emp() {
		A5 a = new A5();
		a.getEmpDetails();
	}
	public static void mutableObj() {
		String str1 = new String("Core ");
		String str2 = str1.concat("Java ");
		String str3 = str2.concat("Learning");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println();
		
		StringBuffer sb1 = new StringBuffer("Core ");
		StringBuffer sb2 = sb1.append("Java ");
		StringBuffer sb3 = sb2.append("Learning");
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb3);
	}
	public static void paramCon() {
		A6 a1 = new A6();
		a1.add();
		A6 a2 = new A6(10);
		a2.add();
		A6 a3 = new A6(10,20);
		a3.add();
		A6 a4 = new A6(10,20,30);
		a4.add();
	}
}
