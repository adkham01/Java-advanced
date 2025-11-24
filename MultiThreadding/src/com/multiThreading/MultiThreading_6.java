package com.multiThreading;

public class MultiThreading_6 {

	public static void main(String[] args) {
		Thread t = new Thread();
		t.setName("Java");
		System.out.println(t.getName());
		t.setPriority(10);
		System.out.println(t.getPriority());
		t.setPriority(Thread.MAX_PRIORITY-4);
		System.out.println(t.getPriority());
		t.setPriority(Thread.MIN_PRIORITY+Thread.NORM_PRIORITY);
		System.out.println(t.getPriority());
		System.out.println();
		
		Thread t2 = new Thread();
		t2.start();
		System.out.println(Thread.activeCount());
		Thread t3 = new Thread();
		t3.start();
		System.out.println(Thread.activeCount());
		Thread t4 = new Thread();
		t4.start();
		System.out.println(Thread.activeCount());
	}

}
