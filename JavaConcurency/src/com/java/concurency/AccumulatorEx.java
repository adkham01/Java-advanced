package com.java.concurency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.LongAccumulator;

public class AccumulatorEx {

	public static void main(String[] args) {
		LongAccumulator counter = new LongAccumulator((x, y) -> x + y, 0);
		
		ExecutorService service = Executors.newFixedThreadPool(16);
		
		for(int i = 0; i < 100; i++) {
			service.submit(new Task(counter));
		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(counter.get());
	}


	private static class Task implements Runnable {
		private final LongAccumulator counter;
		
		public Task(LongAccumulator counter) {
			this.counter = counter;
		}
		@Override
		public void run() {
			// some rocessing
			counter.accumulate(1);
			
		}
	}
}
