package com.multiThreading;
class A8 {
	synchronized void display() {
		for(int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}
	}
}
class Thread8 extends Thread{
	A8 a;
	public Thread8(A8 a) {
		this.a = a;
	}
	@Override
	public void run() {
		a.display();
	}
}
class Thread9 extends Thread{
	A8 a;
	public Thread9(A8 a) {
		this.a = a;
	}
	@Override
	public void run() {
		a.display();
	}
}
class Thread10 extends Thread{
	A8 a;
	public Thread10(A8 a) {
		this.a = a;
	}
	@Override
	public void run() {
		a.display();
	}
}
public class MultiThreading_18 {

	public static void main(String[] args) {
		A8 a = new A8();
		Thread8 t1 = new Thread8(a);
		Thread9 t2 = new Thread9(a);
		Thread10 t3 = new Thread10(a);
		
		t1.setName("Thread-1");
		t2.setName("Thread-2");
		t3.setName("Thread-3");
		
		t1.start();
		t2.start();
		t3.start();

	}

}
