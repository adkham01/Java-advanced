package com.multiThreading;
class WelcomeThread2 implements Runnable{

	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println("Welcome Thread  : "+i);
		}
	}
	
}
public class MultiThreading_2 {

	public static void main(String[] args) {
		WelcomeThread2 wt = new WelcomeThread2();
		Thread t = new Thread(wt);
		t.start();
		for(int i = 1; i <= 10; i++) {
			System.out.println("Main Thread  : "+i);
		}
	}

}
