package com.java.concurency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Phaser;

public class PhraserVSCoundownLatch {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService executor = Executors.newFixedThreadPool(4);

		CountDownLatch latch = new CountDownLatch(3);
		executor.submit(new DependentService(latch));
		executor.submit(new DependentService(latch));
		executor.submit(new DependentService(latch));

		latch.await();

		System.out.println("All Dependent services initialized");
		// program initialized, perform other operations

		Phaser phaser = new Phaser(3);
		executor.submit(new DependentServiceWithPhaser(phaser));
		executor.submit(new DependentServiceWithPhaser(phaser));
		executor.submit(new DependentServiceWithPhaser(phaser));
		phaser.awaitAdvance(1);//Similar to await
		
		CyclicBarrier barrier = new CyclicBarrier(3);
		executor.submit(new CyclicBarrierEx(barrier));
		executor.submit(new CyclicBarrierEx(barrier));
		executor.submit(new CyclicBarrierEx(barrier));

		Thread.sleep(2000);
	}

	public static class DependentService implements Runnable {
		private CountDownLatch latch;

		public DependentService(CountDownLatch latch) {
			this.latch = latch;
		}

		@Override
		public void run() {
			// Startup task

			latch.countDown();

			// continue w/ other operations

		}
	}

	public static class DependentServiceWithPhaser implements Runnable {
		private Phaser phaser;

		public DependentServiceWithPhaser(Phaser phaser) {
			this.phaser = phaser;
		}
 
		@Override
		public void run() {
			// Startup task

			phaser.arrive();

			// continue w/ other operations

		}
	}

	public static class CyclicBarrierEx implements Runnable {
		private CyclicBarrier barrier;

		public CyclicBarrierEx(CyclicBarrier barrier) {
			this.barrier = barrier;
		}

		@Override
		public void run() {

			while (true) {
				try {
					barrier.await();
				} catch (InterruptedException | BrokenBarrierException e) {
					e.getMessage();
				}
				// send message to correspondinig system
			}

		}
	}

}
