package com.multiThreading;
class Hellothread2 implements Runnable{
	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println("Hello Thread : "+i);
		}
		
	}
}
public class MultiThreading_4 {

	public static void main(String[] args) {
		Runnable r1 = new Hellothread2();
		Thread t1 = new Thread(r1);
		t1.start();
		for(int i = 1;i <= 10; i++) {
			System.out.println("Main Thread : "+i);
		}
	}
	public static void smth() {
		Runnable r = new Thread();
		Thread t = new Thread(r,"Core Java");
		System.out.println(t);
	}
}
