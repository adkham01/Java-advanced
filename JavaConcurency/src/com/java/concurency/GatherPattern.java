package com.java.concurency;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GatherPattern {

	private ExecutorService service = Executors.newFixedThreadPool(4);
	public static void main(String[] args) {
		
	}
	private Set<Integer> getPrices(int productId){
		Set<Integer> prices = Collections.synchronizedSet(new HashSet<>());
		service.submit(new Task(url1, productId, prices));
		service.submit(new Task(url2, productId, prices));
		service.submit(new Task(url3, productId, prices));
		
		Thread.sleep(3 * 1000);
		
		return prices;
	}
	private class Task implements Runnable {
		private String url;
		private int productId;
		private Set<Integer> prices;
		
		
		
		@SuppressWarnings("unused")
		public Task(String url, int productId, Set<Integer> prices) {
			this.url = url;
			this.productId = productId;
			this.prices = prices;
		}



		@Override
		public void run() {
			int price = 0;
			
			//make http call
			
			prices.add(price);
			
		}
	}

}
