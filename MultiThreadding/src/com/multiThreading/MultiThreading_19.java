package com.multiThreading;
class A9 {
	synchronized void display() {
		for(int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}
	}
}
class DisplayThread extends Thread{
	A9 a;
	public DisplayThread(A9 a) {
		this.a = a;
	}
	@Override
	public void run() {
		a.display();
	}
}
public class MultiThreading_19 {

	public static void main(String[] args) {
		A9 a = new A9();
		DisplayThread ds1 = new DisplayThread(a);
		DisplayThread ds2 = new DisplayThread(a);
		DisplayThread ds3 = new DisplayThread(a);
		
		ds1.setName("Thread-1");
		ds2.setName("Thread-2");
		ds3.setName("Thread-3");
		
		ds1.start();
		ds2.start();
		ds3.start();
	}

}
