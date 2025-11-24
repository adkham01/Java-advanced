package com.java.concurency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

class ConsumerRunnable implements Runnable {

	private BlockingQueue<String> queue = null;

	private AtomicBoolean keepRunning = new AtomicBoolean(true);

	public ConsumerRunnable(BlockingQueue<String> queue) {
		this.queue = queue;
	}

	public void stop() {
		System.out.println("Stopped thred");
		this.keepRunning.set(false);
	}

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName() + " Consumer started.");

		long objectsConsumed = 0;
		while (this.keepRunning.get()) {
			String obj = takeObjectFromQueue();
			if (obj != null) {
				objectsConsumed++;
			}
		}
		System.out.println(Thread.currentThread().getName() + " Finishing up ");
		while (this.queue.size() > 0) {
			String obj = takeObjectFromQueue();
			if (obj != null) {
				objectsConsumed++;
			}
		}
		System.out.println(Thread.currentThread().getName() + " Consumer finished : " + objectsConsumed);

	}

	private String takeObjectFromQueue() {
		try {
			return this.queue.poll(1000, TimeUnit.MICROSECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
			return null;
		}
	}
}

public class ThreadCongestionEx1 {

	public static void main(String[] args) {
		int objectsToProduce = 1_000_000;

		BlockingQueue<String> queue = new ArrayBlockingQueue<>(objectsToProduce);

		ConsumerRunnable[] consumerRunnables = new ConsumerRunnable[3];

		synchronized (ThreadCongestionEx1.class) {
			for (int i = 0; i < consumerRunnables.length; i++) {
				consumerRunnables[i] = new ConsumerRunnable(queue);
				Thread consumingThread = new Thread(consumerRunnables[i]);
				consumingThread.start();
			}
		}

		Thread producingThread = new Thread(() -> {
			for (int i = 0; i < objectsToProduce; i++) {
				try {
					queue.put("" + i);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			System.out.println("All objects are produced! ");
			System.out.println(" => produced " + objectsToProduce);
			synchronized (ThreadCongestionEx1.class) {
				for (int i = 0; i < consumerRunnables.length; i++) {
					consumerRunnables[i].stop();
				}
			}
		});
		producingThread.start();

	}

}
