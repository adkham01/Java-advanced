package com.multiThreading;
class WelcomeTherad extends Thread{
	@Override
	public void run() {
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Welcome Thread! "+i);
		}
	}
}
public class MultiThreading_1 {

	public static void main(String[] args) {
		WelcomeTherad w  = new WelcomeTherad();
		w.start();
		for(int i = 1; i <= 10; i++) {
			System.out.println("Main Thread  : "+i);
		}
	}

}
