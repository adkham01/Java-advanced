package com.review.oops;

class Employee1 {
	String eid = "E-111";
	String ename = "Java";
	float esal = 25000f;
	String eaddr = "Hyderabad";
	String eemail = "druga@drugasoft.com";
	 
	void displayEmpDtails() {
		System.out.println("\nThis is how write class");
		System.out.println("Employee Details");
		System.out.println("----------------------------");
		System.out.println("Employee ID      : "+eid);
		System.out.println("Employee Name    : "+ename);
		System.out.println("Employee Salary  : "+esal);
		System.out.println("Employee Address : "+eaddr);
	}
}
abstract class A1 {
	void method_1() {
		System.out.println("\nMethod 1 A1");
	}
	abstract void method_2();
	abstract void method_3();
}
class B1 extends A1 {
	@Override
	void method_2() {
		System.out.println("Method 2 B1");
	}
	@Override
	void method_3() {
		System.out.println("Method 3 B1");
	}
	void method_4() {
		System.out.println("This is how to write Abstract Class!");
	}
}
interface I1 {
	int i = 20;
	void method_1();
	void method_2();
	void method_3();
}
class A2 implements I1 {

	@Override
	public void method_1() {
		System.out.println("\nMethod 1 A2");
	}

	@Override
	public void method_2() {
		System.out.println("Method 2 A2");
	}

	@Override
	public void method_3() {
		System.out.println("Method 3 A2");
	}
	public void method_4() {
		System.out.println("This is how to use Interface in JAVA");
	}
	
}
public class Ooop_1 {

	public static void main(String[] args) {
		empClass();
		System.out.println("\n===============================\n");
		abstractClass();
		System.out.println("\n================================\n");
		interfaceI();

	}
	public static void empClass() {
		Employee1 emp = new Employee1();
		emp.displayEmpDtails();
	}
	public static void abstractClass() {
		A1 a = new B1();
		a.method_1();
		a.method_2();
		a.method_3();
		System.out.println();
		B1 b = new B1();
		b.method_1();
		b.method_2();
		b.method_3();
		b.method_4();
	}
	public static void interfaceI() {
		I1 i1 = new A2();
		i1.method_1();
		i1.method_2();
		System.out.println(i1.i);
		System.out.println(I1.i);
		
		A2 a = new A2();
		a.method_1();
		a.method_2();
		a.method_3();
		a.method_4();
		System.out.println(a.i);
		
	}

}
