package com.review.oops;

import java.util.ArrayList;

class A3{
	void add(int ...is) {
		System.out.println("No of arguments : "+is.length);
		int result = 0;
		System.out.print("Argument List : ");
		for(int i = 0; i < is.length;i++) {
			System.out.print(is[i]+" ");
			result += is[i];
		}
		System.out.println();
		System.out.println("Addition : "+result);
		System.out.println("-------------------");
	}
}
class A4{
	
}
class Employee2{
	String eid = "E-222";
	String ename = "Durga";
	float esal = 35000f;
	String eaddr = "Hyd";
	String emobile = "+48-09876546789";
	
	public  String toString() {
		System.out.println("Employee Details");
		System.out.println("-----------------------------");
		System.out.println("Employee ID     : "+eid);
		System.out.println("Employee Nmae   : "+ename);
		System.out.println("Employee Salary : "+esal);
		System.out.println("Employee Addres : "+eaddr);
		System.out.println("Employee Mobile : "+emobile);
		
		return "";
	}
}
public class Ooop_2 {

	public static void main(String[] args) {
		vararg();
		System.out.println("\n================================\n");
		ref();
		System.out.println("\n================================\n");
		emp();
		System.out.println("\n================================\n");
		toStringMethod();
	}
	public static void vararg() {
		A3 a = new A3();
		a.add();
		a.add(10);
		a.add(10,20);
		a.add(10,20,30);
	}
	public static void ref() {
		A4 a = new A4();
		int hashCode = a.hashCode();
		System.out.println("Object HashCode : "+hashCode);
		String ref = a.toString();
		System.out.println("Object reference : "+ref);
	}
	public static void emp() {
		Employee3 emp = new Employee3();
		System.out.println(emp);
	}
	public static void toStringMethod() {
		String str = new String("abc");
		System.out.println(str);
		
		Exception e = new Exception("My own Exception");
		System.out.println(e);
		
		Thread t = new Thread();
		System.out.println(t);
		
		Integer i = new Integer(10);
		System.out.println(i);
		
		ArrayList al = new ArrayList();
		al.add("AAA");
		al.add("BBB");
		al.add("DDD");
		al.add("DDD");
		System.out.println(al);
	}

}
