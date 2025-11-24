package com.multiThreading;

class A6 {
	String str1 = new String("Core");
	String str2 = null;
	void add() {
		str2 = str1.concat(" Java");
		System.out.println(Thread.currentThread().getName()+" : "+str2);
		System.out.println(str2.hashCode());
	}
}
class Thread4 extends Thread{
	A6 a;
	public Thread4(A6 a) {
		this.a = a;
	}
	@Override
	public void run() {
		a.add();
	}
}
class Thread5 extends Thread{
	A6 a;
	public Thread5(A6 a) {
		this.a = a;
	}
	@Override
	public void run() {
		a.add();
	}
}
public class MultiThreading_16 {

	public static void main(String[] args) {
		A6 a = new A6();
		Thread4 t1 = new Thread4(a);
		Thread5 t2 = new Thread5(a);
		
		t1.setName("Thread-1");
		t2.setName("Thread-2");
		
		t1.start();
		t2.start();

	}

}
