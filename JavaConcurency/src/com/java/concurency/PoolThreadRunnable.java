package com.java.concurency;

import java.util.concurrent.BlockingQueue;

@SuppressWarnings("rawtypes")
public class PoolThreadRunnable implements Runnable {

	private Thread thread = null;
	private BlockingQueue taskQueue = null;
	private boolean isStoppeed = false;

	public PoolThreadRunnable(BlockingQueue taskQueue) {
		this.taskQueue = taskQueue;
	}

	@Override
	public void run() {
		this.thread = Thread.currentThread();
		while (!isStopped()) {
			try {
				Runnable runnable = (Runnable) taskQueue.take();
				runnable.run();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public synchronized void doStop() {
		isStoppeed = true;
		this.thread.interrupt();
	}

	public synchronized boolean isStopped() {
		return isStoppeed;
	}

}
