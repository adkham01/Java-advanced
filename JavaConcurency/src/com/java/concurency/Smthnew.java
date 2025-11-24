package com.java.concurency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class VolatileKeyword{
	volatile int cnt = 0;
	public boolean isTrue() {
		Lock lock = new ReentrantLock();
		if(this.cnt == 10) {
			return true;
		}
		lock.lock();
		this.cnt++;
		lock.unlock();
		return false;
	}
}

public class Smthnew {
	
	public static void main(String[] args) {
		VolatileKeyword ist = new VolatileKeyword();
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i < 10; i++) {
					System.out.println("Indx : "+i+" -> "+ist.isTrue()+" "+Thread.currentThread().getName());
				}
				
			}
		};
		
		Thread t1 = new Thread(runnable, "Thread 1 ");
		Thread t2 = new Thread(runnable, "Thread 2 ");
		t1.start();
		t2.start();
	}

}
