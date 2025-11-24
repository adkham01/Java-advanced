package com.multiThreading;
class HiThread extends Thread{
	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println("Welcome to Core Java : "+i);
		} 
	}
}
public class MultiThreading_10 {

	public static void main(String[] args) throws InterruptedException  {
		HiThread ht = new HiThread();
		ht.start();
		ht.join();
		for(int i = 1; i <= 10; i++) {
			System.out.println("Main Thread : "+i);
		}
	}

}
