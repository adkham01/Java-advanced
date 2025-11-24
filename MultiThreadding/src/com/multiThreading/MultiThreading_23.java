package com.multiThreading;
class ThreadScope extends ThreadLocal<String>{
	@Override
	protected String initialValue() {
		
		return "Data is not Defined";
	}
}
class A12 {
	
	void Method_1() {
		System.out.println("Method_1() Thread-1 Scope : "+Thread$_1.ts.get());
		System.out.println("Method_2() Thread-2 Scope : "+Thread$_2.ts.get());
	}
	void Method_2() {
		System.out.println("Method_2() Thread-2 Scope : "+Thread$_2.ts.get());
		System.out.println("Method_1() Thread-1 Scope : "+Thread$_1.ts.get());
	}
}
class Thread$_1 extends Thread{
	static ThreadScope ts = new ThreadScope();
	A12 a;
	public Thread$_1(A12 a) {
		this.a = a;
	}
	@Override
	public void run() {
		ts.set("AAA");
		a.Method_1();
	}
}
class Thread$_2 extends Thread{
	static ThreadScope ts  = new ThreadScope();
	A12 a;
	public Thread$_2(A12 a) {
		this.a = a;
	}
	@Override
	public void run() {
		ts.set("BBB");
		a.Method_2();
	}
}
public class MultiThreading_23 {

	public static void main(String[] args) {
		A12 a = new A12();
		
		Thread$_1 t1 = new Thread$_1(a);
		Thread$_2 t2 = new Thread$_2(a);
		
		t1.setName("Thread-1");
		t2.setName("Thread-2");
		
		t1.start();
		t2.start();
		
	}

}
