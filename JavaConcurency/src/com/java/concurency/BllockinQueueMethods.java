package com.java.concurency;

import java.util.ArrayList;
import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class BllockinQueueMethods {

	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public static void main(String[] args) {
		BlockingQueue<String> queue = new ArrayBlockingQueue<>(5);
		
		/**
		 * put() will bkock until there is no space
		 * inside the BlockingQueue for the element 
		 */

		try {
			queue.put("1");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		/**
		 * add() will throw IllegalStateExecption if
		 * no space avaiable in BlockingQueue
		 */
		try {
			queue.add("2");
		} catch (IllegalStateException e) {
			// no space inside BlockingQueue
			e.printStackTrace();
		}
		
		// offer(o, time, TimeUnit) blocks for time if no space
		boolean wasEnqueued = queue.offer("3");
		
		/**
		 * offer (o, time, TimeUnit) blocks for time if no space,
		 * then returns false if still no space.
		 */
		try {
			boolean wasEnqueued2 = queue.offer("3", 1000, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		/**
		 *  take() blocks until an element beci=omrs available
		 */
		try {
			String element = queue.take();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		/**
		 *  poll() returns null if no element is available
		 *  
		 *  poll(long timeout, TimeUnit timeUnit) blocks up until timeout
		 *  for all element to become available. If no element is available
		 *  before that time, null will be returned.
		 */
		try {
			String string1 = queue.poll(1000, TimeUnit.MILLISECONDS); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		/**
		 *  remove() removes the element if present in the BlockingQueue
		 */
		boolean wasRemoved = queue.remove("1");
		
		/**
		 *  peek() method returns first element of BlockingQueue 
		 *  without remuving it. If BlockingQueue is empty it will return null
		 */
		String string2 = queue.peek();
		
		/**
		 *  element() method alsoreturns first element of BlockinQueue
		 *  if it is empty it will rise NoSuchElementException
		 */
		try {
			String string3 = queue.element();
		} catch (NoSuchElementException e) {
			System.err.println("BlockingQueue is empty");
		}
		
		// size() method returns Numbeer of elements inside BlockingQueue
		int size = queue.size();
		
		// remainingCapacity() method will return number of free space inside BlockingQueue
		int capacity = queue.remainingCapacity();
		
		Collection collection = new ArrayList();
		queue.drainTo(collection);
		queue.drainTo(collection, 5);
	}

}
