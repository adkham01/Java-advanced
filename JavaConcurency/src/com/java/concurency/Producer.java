package com.java.concurency;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	BlockingQueue<String> blockingQueue = null;

	public Producer(BlockingQueue<String> queue) {
		this.blockingQueue = queue;
	}

	@Override
	public void run() {
		while (true) {
			long timeMills = System.currentTimeMillis();
			try {
				this.blockingQueue.put("" + timeMills);
			} catch (InterruptedException e) {
				System.err.println("Producer was Interrupted");
			}

			sleep(1000);
		}

	}

	private void sleep(long timeMills) {
		try {
			Thread.sleep(timeMills);
		} catch (InterruptedException e) {
			System.err.println("Thread Interrupted");
		}
	}
}
