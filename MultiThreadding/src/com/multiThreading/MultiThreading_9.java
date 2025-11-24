package com.multiThreading;
class WThread extends Thread{
	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("Welcome to Core Java");
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
public class MultiThreading_9 {
	
	public static void main(String[] args) {
		WThread wt = new WThread();
		wt.start();
	}
}
