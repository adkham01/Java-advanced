package com.multiThreading;
class A5 {
	StringBuffer sb  = new StringBuffer("Core");
	void add() {
		sb.append(" Java");
		System.out.println(Thread.currentThread().getName()+" : "+sb);
	}
}
class Thread_F extends Thread{
	A5 a;
	public Thread_F(A5 a) {
		this.a = a;
	}
	@Override
	public void run() {
		a.add();	}
}
class Thread_S extends Thread{
	A5 a;
	public Thread_S(A5 a) {
		this.a = a;
	}
	@Override
	public void run() {
		a.add();
	}
	
}
public class MultiThreading_15 {

	public static void main(String[] args) {
		A5 a = new A5();
		Thread_F t1 = new Thread_F(a);
		Thread_S t2 = new Thread_S(a);
		t1.setName("Thread-1");
		t2.setName("Thread-2");
		t1.start();
		t2.start();

	}

}
