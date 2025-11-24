package com.multiThreading;
class A3 {
	void increment() {
		int i = 10; 
		i += 10; 
		System.out.println(Thread.currentThread().getName()+" : "+i);
	}
}
class Thread$1 extends Thread{
	A3 a;
	public Thread$1(A3 a) {
		this.a = a;
	}
	@Override
	public void run() {
		a.increment();
	}
}
class Thread$2 extends Thread{
	A3 a;
	public Thread$2(A3 a) {
		this.a = a;
	}
	@Override
	public void run() {
		a.increment();
	}
}
public class MultiThreading_13 {

	public static void main(String[] args) {
		A3 a = new A3();
		Thread$1 t1 = new Thread$1(a);
		Thread$2 t2 = new Thread$2(a);
		t1.setName("Thread-1");
		t2.setName("Thread-2");
		t1.start();
		t2.start();
	}

}
