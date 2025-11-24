package com.java.concurency;

public class ThreadLocalEx2 {

	public static void main(String[] args) {
		ThreadLocal<String> thLocal = new ThreadLocal<>();
		
		InheritableThreadLocal<String> inheritableThreadLocal = new InheritableThreadLocal<>();
		
		Thread thread1 = new Thread(() -> {
			System.out.println("===Thead 1===");
			thLocal.set("Thread 1 ThreadLocal");
			inheritableThreadLocal.set("Thread 1 InheritableThreadLocal");
			
			System.out.println(thLocal.get());
			System.out.println(inheritableThreadLocal.get());
			
			Thread childThread = new Thread(() -> {
				System.out.println("===ChildThread===");
				System.err.println(thLocal.get());
				System.err.println(inheritableThreadLocal.get());
			});
			childThread.start();
		});
		Thread thread2 = new Thread(() -> {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Thread Local "+thLocal.get());
			System.out.println("InheritableThreadLocal "+inheritableThreadLocal.get());
		});
		
		thread1.start();
		thread2.start();
		
	}

}
