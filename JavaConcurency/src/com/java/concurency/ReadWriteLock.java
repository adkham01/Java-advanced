package com.java.concurency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLock {

	private ReentrantLock rwLock = new ReentrantLock();
	
	private Lock readLock = rwLock.readLock();
	private Lock writeLock = rwLock.writeLock();
			
	private void readResource() {
		readLock.lock();
		//view the resource 
		readLock.unlock();
	}
	
	private void writeResource() {
		writeLock.lock();
		// update the resource
		writeLock.unlock();
	}
	public static void main(String[] args) {
		ReadWriteLock obj = new ReadWriteLock();
		Thread t1 = new Thread(() ->  obj.readResource()); t1.start();
		Thread t2 = new Thread(() ->  obj.readResource()); t2.start();
		Thread t3 = new Thread(() ->  obj.readResource()); t3.start();
		Thread t4 = new Thread(() ->  obj.readResource()); t4.start();
	} 

}
