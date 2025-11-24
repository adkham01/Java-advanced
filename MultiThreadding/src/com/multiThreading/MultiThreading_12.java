package com.multiThreading;
class A2{
	int i = 10;
	void add() {
		this.i = this.i + 10;
		System.out.println(Thread.currentThread()+" : "+this.i);
	}
}
class Thread_1 extends Thread{
	A2 a;
	public Thread_1(A2 a) {
		this.a = a;
	}
	@Override
	public void run() {
		a.add();
	}
}
class Thread_2 extends Thread{
	A2 a;
	public Thread_2(A2 a) {
		this.a = a;
	}
	@Override
	public void run() {
		a.add();
	}
}
public class MultiThreading_12 {

	public static void main(String[] args) {
		A2 a = new A2();
		Thread_1 t1 = new Thread_1(a);
		Thread_2 t2 = new Thread_2(a);
		t1.start();
		t2.start();

	}

}
