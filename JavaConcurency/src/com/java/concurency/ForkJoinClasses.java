package com.java.concurency;

import java.util.concurrent.RecursiveTask;

public class ForkJoinClasses {

	public static void main(String[] args) {
		

	}
	/**
	 * Use cases Fork join classes
	 * Sorting
	 * Matrix multiplication
	 * Best move finder for a game
	 * Tree traversal
	 * @author Adham
	 *
	 */
	@SuppressWarnings({ "unused", "serial" })
	private class Fibonacci extends RecursiveTask<Integer>{
		final int n;
		public Fibonacci(int n) {
			this.n = n;
		}
		
		
		/**
		 *	Ideal ForkHoin Tasks
		 *	Avoid synchronisation
		 *	Do not use shared variables accross tasks
		 *	Do not preform Blocking IO operations
		 *	Are pure functions
		 *	Are isolated 
		 */
		@Override
		protected Integer compute() {
			if(n <= 1) 
				return n;
		
			Fibonacci f1 = new Fibonacci(n - 1);
			f1.fork();
			Fibonacci f2 = new Fibonacci(n - 2);
			f2.fork();
			return f2.join() + f1.join();
		}
	}
}
