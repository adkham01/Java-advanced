package com.java.concurency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter {
	private long count= 0;
	Lock lock = new ReentrantLock();
	
	public long incAndGet() {
		this.count++;
		return this.count;
	}
	
	public long getCnt() {
		return this.count;
	}
}
public class RaseConditions {

	public static void main(String[] args) {
		Counter cnt = new Counter();
		
		Thread thread1 = new Thread(getRunnable(cnt, "Thread 1 final count"));
		Thread thread2 = new Thread(getRunnable(cnt, "Thread 2 final count"));
		thread1.start();
		thread2.start();
	}
	private static Runnable getRunnable(Counter cntr, String message) {
		return() -> {
			for(int i = 0; i < 1_000_000_000; i++) {
				cntr.incAndGet();
			}
			System.out.println(message+" "+cntr.getCnt());
		};
	}

}
