package com.java.concurency;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ConditionClasesEx {
	private Lock lock = new ReentrantLock();
	private Condition conditionMet = lock.newCondition();
	private Object monitor;
	private int count;
	private Condition added = lock.newCondition();

	/**
	 * We assume this is Thread 1
	 * 
	 * @throws InterruptedException
	 */
	public void method1() throws InterruptedException {
		lock.lock();
		try {
			conditionMet.await();
			// can now do dependant operations
		} finally {
			lock.unlock();
		}
	}

	/**
	 * We assume this is Thread 2
	 */
	public void method2() {
		lock.lock();
		try {
			// do some operations
			conditionMet.signal();
		} finally {
			lock.unlock();
		}
	}

	/**
	 * Same sematics as wait-notify in these two methods
	 */
	public synchronized void execute() {
		// wait for monitor notify
		try {
			monitor.wait();
		} catch (InterruptedException e) {
			System.err.println("Interrupted");
		}
		// notify thread eaiting on the monitor
		monitor.notify();

		// notify all threads
		monitor.notifyAll();
	}

	public void m1() {
		lock.lock();
		// wait for monitor notify
		try {
			conditionMet.wait();
		} catch (InterruptedException e) {
			System.err.println("Interrupted");
		}
		// notify thread waiting on the monitor
		conditionMet.signal();

		// notify all threads
		conditionMet.signalAll();
		lock.unlock();
	}

	/**
	 * Perform await in loop always
	 */
	public String consume() throws InterruptedException {
		lock.lock();
		try {
			while (count == 0)
				added.await();
			return getData();
		} finally {
			lock.unlock();
		}
	}

	private String getData() {

		return null;
	}
}

public class ConditionClases {

	private static ReentrantLock lock = new ReentrantLock();

	private static void accessResource() {
		lock.lock();

		// access the resource

		lock.unlock();
		
	}
	
	protected void accessResourceSyn() {
		synchronized (this) {//<--lock.lock
			// access the resource
		}//<--lock. unlock		
	}
	
	protected static void accessResourceMethods() throws InterruptedException {
		boolean lockAcquired = lock.tryLock(5,TimeUnit.SECONDS);
		if(lockAcquired) {
			try {
				//access resource
			}finally {
				lock.unlock();
			}
		}else {
			//do alternate thing 
		}
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> accessResource()); t1.start();
		Thread t2 = new Thread(() -> accessResource()); t2.start();
		Thread t3 = new Thread(() -> accessResource()); t3.start();
		Thread t4 = new Thread(() -> accessResource()); t4.start();

	}

}
