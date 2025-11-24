package com.multiThreading;
class WelcomeThread3 implements Runnable{
	@Override
	public void run() {
		for(int i = 1;i <= 10; i++) {
			System.out.println("Welcome Thread : "+i);
		}
		
	}
}
public class MultiThreading_5 {

	public static void main(String[] args) {
		Runnable r = new WelcomeThread3();
		ThreadGroup tg = new ThreadGroup("Java");
		Thread t = new Thread(tg,r);
		t.start();
		for(int i = 1;i <= 10;i++) {
			System.out.println("Main Thread : "+i);
		}
	}
	public static void smth() {
		ThreadGroup tg = new ThreadGroup("Java");
		Thread t = new Thread(tg,"Core Java");
		System.out.println(t);
	}
}
