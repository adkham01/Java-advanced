package com.java.concurency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemaphoreInJava {
	private static final transient Semaphore semaphore = new Semaphore(4);

	public static void main(String[] args) throws InterruptedException {

		ExecutorService service = Executors.newFixedThreadPool(64);

		service.shutdown();
		service.awaitTermination(1, TimeUnit.MINUTES);
	}

	static class Task implements Runnable {
		@Override
		public void run() {
			// some processing

			// only three threads can accquire at a time
			semaphore.acquireUninterruptibly(8);
			// IO call to the slow service
			semaphore.release(8);

			// rest processing

			/**
			 * return type boolean Try to acquire, if no permit avilable, do not block.
			 * continue doing something
			 */
			semaphore.tryAcquire();

			/**
			 * Same as above bub, with TimeOut
			 */
			try {
				semaphore.tryAcquire(50, TimeUnit.SECONDS);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

			/**
			 * return type boolean Returns count of permits avilable
			 */
			semaphore.availablePermits();
		}
	}

}
