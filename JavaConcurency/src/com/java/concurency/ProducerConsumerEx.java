package com.java.concurency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerEx {

	public static void main(String[] args) {
		BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(5);
		
		Producer producer = new Producer(blockingQueue);
		Consumer consumer = new Consumer(blockingQueue);
		
		Thread proThread = new Thread(producer);
		Thread conThread = new Thread(consumer); 
		
		proThread.start();
		conThread.start();

	}

}
