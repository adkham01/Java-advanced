package com.multiThreading;
class A{
	void m1() {
		for(int i = 1; i <=10; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
class Thread1 extends Thread{
	A a;
	public Thread1(A a) {
		this.a = a;
	}
	
	@Override
	public void run() {
		a.m1();
	}
}
class Thread2 extends Thread{
	A a;
	public Thread2(A a) {
		this.a = a;
	}
	
	@Override
	public void run() {
		a.m1();
	}
}
class Thread3 extends Thread{
	A a;
	public Thread3(A a) {
		this.a = a;
	}
	
	@Override
	public void run() {
		a.m1();
	}
}
public class MultiThreading_7 {

	public static void main(String[] args) {
		A a = new A();
		
		Thread1 t1 = new Thread1(a);
		Thread2 t2 = new Thread2(a);
		Thread3 t3 = new Thread3(a);
		
		t1.setName("First Thread");
		t2.setName("Second Thread");
		t3.setName("Third Thread");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
