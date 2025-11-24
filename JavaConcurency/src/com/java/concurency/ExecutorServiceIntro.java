package com.java.concurency;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

class Task implements Runnable{
	@Override
	public void run() {
		System.out.println("Thread Name : "+Thread.currentThread().getName());
		
	}
}
public class ExecutorServiceIntro {

	public static void main(String[] args) throws InterruptedException {
		//Getting count of cores in CPU
		int coreCount = Runtime.getRuntime().availableProcessors(); 
		
		/**
		 * Types of Pools
		 * 1.FixedThreadPool
		 * 2.CachedThreadPool (it don't require pass an argumet)
		 * 3.SceduledThreadPool
		 * 4.SingleThreadPool
		 */
		ExecutorService service = Executors.newFixedThreadPool(coreCount);
		System.out.println(coreCount);
		for(int i = 0; i < 64; i++) {
			service.execute(new Task());
		}
		
		//initiate shutdown
		service.shutdown();
		//will throw RejectionExecutionException
		// service.execcute(new Task());
		
		//will return true, since shutdown has begun
		service.isShutdown();
		
		//will return true if all tasks are completed
		//including queued ones
		service.isTerminated();
		
		//block untill all tasks are completed or if timeout occcurs
		service.awaitTermination(coreCount, TimeUnit.SECONDS);
		
		

	}
	/**
	 * 
	 * @param nThreads CorePoolSize Minimum/Base size of the pool
	 *  MaximumPoolSize Maximum size of the pool
	 *  long keepAliveTime+unit Time to keep an idle thread alive (after which it is killed) 
	 *  threadFactory ThreadFactory The factory to use to create new threads
	 *  handler RejectedExcecutionHandler Callback to use when tasks sub,itted are rejected
	 *  
	 * @return
	 */
	public static ExecutorService newFixedThreadPool(int nThreads) {
		return ThreadPoolExecutor(nThreads, nThreads, 0L,TimeUnit.MICROSECONDS, new LinkedBlockingQueue<Runnable>());
	}
	public void ThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit,
			BlockingQueue<Runnable> workQueue, ThreadFactory threadFactory,
			RejectedExecutionHandler handler) {
		
	}
	private static ExecutorService ThreadPoolExecutor(int nThreads, int nThreads2, long l, TimeUnit microseconds,
			LinkedBlockingQueue<Runnable> linkedBlockingQueue) {
		
		return null;
	}

}
