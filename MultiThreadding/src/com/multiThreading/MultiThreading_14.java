package com.multiThreading;
class A4{
	int i = 10;
	void increment() {
		int j = 10;
		
		this.i += 10;
		j += 10;
		System.out.println(Thread.currentThread().getName()+" Inistance Varable : "+this.i);
		System.out.println(Thread.currentThread().getName()+" Local Variable    : "+j);
	}
}
class ThreadF extends Thread{
	A4 a;
	public ThreadF(A4 a) {
		this.a = a;
	}
	@Override
	public void run() {
		a.increment();
	}
}
class ThreadS extends Thread{
	A4 a;
	public ThreadS(A4 a) {
		this.a = a;
	}
	@Override
	public void run() {
		a.increment();
	}
}
public class MultiThreading_14 {

	public static void main(String[] args) {
		A4 a = new A4();
		ThreadF t1 = new ThreadF(a);
		ThreadS t2 = new ThreadS(a);
		t1.setName("Thread-1");
		t2.setName("Thread-2");
		t1.start();
		t2.start();
	}

}
