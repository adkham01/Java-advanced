package com.multiThreading;
class HelloThread implements Runnable {
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println("Hello Thread : "+i);
		}
	}
}
public class MultiThreading_3 {

	public static void main(String[] args) {
		Runnable r = new HelloThread();
		Thread t = new Thread(r);
		t.start();
		for(int i = 1; i <= 10; i++) {
			System.out.println("Main Thread : "+i);
		}
	}
	public static void smt() {
		Thread t = new Thread("Core Java");
		System.out.println(t);
		Runnable r1 = new Thread();
		System.out.println(r1);
		Thread t1 = new Thread(r1);
		System.out.println(t1);

	}
}
