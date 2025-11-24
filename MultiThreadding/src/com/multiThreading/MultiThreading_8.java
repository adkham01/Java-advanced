package com.multiThreading;
class MyThread extends Thread{
	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
public class MultiThreading_8 {

	public static void main(String[] args) {
		MyThread mt1 = new MyThread();
		MyThread mt2 = new MyThread();
		MyThread mt3 = new MyThread();
		
		mt1.setName("First Thread");
		mt2.setName("Second Thread");
		mt3.setName("Third Thread");
		
		mt1.start();
		mt2.start();
		mt3.start();
	}

}
