package com.java.concurency;

class Counter1 {
	
	public volatile long count1 = 0;

	public volatile long count2 = 0;

}

public class CompareAndSwap {

	public static void main(String[] args) {
		Counter1 counter1 = new Counter1();
		//Counter1 counter2 = counter1;
		Counter1 counter2 = new Counter1();

		long iterations = 1_000_000_000L;

		Thread thread1 = new Thread(() -> {
			long startTime = System.currentTimeMillis();
			for (long i = 0; i < iterations; i++) {
				counter1.count1 += 1;
			}
			long endTime = System.currentTimeMillis();
			System.out.println("Total time of Thread 1 : " + (endTime - startTime));
		});

		Thread thread2 = new Thread(() -> {
			long startTime = System.currentTimeMillis();
			for (long i = 0; i < iterations; i++) {
				counter2.count2 += 1;
			}
			long endTime = System.currentTimeMillis();
			System.out.println("Total time of Thread 2 : " + (endTime - startTime));
		});

		thread1.start();
		thread2.start();
	}

	/**
	 *  Total time of Thread 2 : 55870
	 *	Total time of Thread 1 : 55962
	 *
	 *	Total time of Thread 2 : 34691
	 *	Total time of Thread 1 : 34692
	 */
}
