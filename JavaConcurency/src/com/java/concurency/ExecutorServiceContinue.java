package com.java.concurency;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceContinue {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args){
		// create the pool
		ExecutorService service = Executors.newFixedThreadPool(10);

		// submit the tasks for execution
		for (int i = 0; i < 100; i++) {
			service.execute(new Task1());
			System.out.println("Thread Name : " + Thread.currentThread().getName());
		}

		/**
		 * submit the task with Callable Interface and storing it in a List
		 */
		List<Future> allFutures = new ArrayList<>();
		for(int i = 0; i < 100; i++) {			
			Future<Integer> f = service.submit(new Task2());
			allFutures.add(f);
		}
		for(int i = 0; i < 100; i++) {
		 	Future<Integer> future = allFutures.get(i);
			try {
				Integer result = future.get();
				System.out.println("Result of future # "+ (i+1) + " = "+result);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				
				e.printStackTrace();
			}
			
		}
	}

	/**
	 * Classs with implementing Callable Interface for returning a value. 
	 * Difference between Callable and Runnable interface. 
	 * Callable Interface returns any vallue Runnable Interface  returns nothing.
	 * 
	 * @author Adham
	 *
	 */
	static class Task2 implements Callable<Integer> {

		@Override
		public Integer call() throws Exception {

			return new Random().nextInt();
		}

	}

	/**
	 * Class for ExecutorService with Runnable Interface
	 * 
	 * @author Adham
	 *
	 */
	static class Task1 implements Runnable {

		@Override
		public void run() {
			System.out.println("Thread Name : " + Thread.currentThread().getName());

		}

	}

}
