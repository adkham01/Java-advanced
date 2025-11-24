package com.multiThreading;

class A10{
	void display() {
		System.out.println("Before Synchronized Block : ");
		synchronized (this) {
			for(int i = 1; i <= 10; i++) {
				System.out.println("Inside Synchronized Block : "+Thread.currentThread().getName());
			}
		}
		
	}
}
class DThread1 extends Thread{
	A10 a;
	public DThread1(A10 a) {
		this.a = a;
	}
	@Override
	public void run() {
		a.display();
	}
}
class DThread2 extends Thread{
	A10 a;
	public DThread2(A10 a) {
		this.a = a;
	}
	@Override
	public void run() {
		a.display();
	}
}
class DThread3 extends Thread{
	A10 a;
	public DThread3(A10 a) {
		this.a = a;
	}
	@Override
	public void run() {
		a.display();
	}
}
public class MultiThreading_20 {

	public static void main(String[] args) {
		A10 a = new A10();
		DThread1 t1 = new DThread1(a);
		DThread2 t2 = new DThread2(a);
		DThread3 t3 = new DThread3(a);
		
		t1.setName("AAA");
		t2.setName("BBB");
		t3.setName("CCC");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
