package com.java.concurency;

public class StopThread {

	public static class StoppableRunnable implements Runnable {
		private boolean stopRequested = false;

		public synchronized void requestStop() {
			this.stopRequested = true;
		}

		public synchronized boolean isStopRequested() {
			return this.stopRequested;
		}

		private void sleep(long mills) {
			try {
				Thread.sleep(mills);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}

		@Override
		public void run() {
			System.out.println("StoppableRunnable Running");
			while (!isStopRequested()) {
				sleep(1000);
				System.out.println("............");
			}
			System.out.println("StoppableRunnable Stopped");

		}
	}

	public static void main(String[] args) {
		StoppableRunnable runnable = new StoppableRunnable();
		Thread t1 = new Thread(runnable,"My own Thread");
		t1.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Requesting stop");
		runnable.requestStop();
		System.out.println("Stop requested");
	}

}
