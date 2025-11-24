package com.multiThreading;

class GarbageCollector extends Thread{
	@Override
	public void run() {
		for(int i = 1; ; i++) {
			System.out.println("This is Garbage Collector : "+i);
		}
	}
}
public class MultiThreading_11 {

	public static void main(String[] args) {
		GarbageCollector gc = new GarbageCollector();
		gc.setDaemon(true);
		gc.start();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("JVM Thread"+i);
		}
		System.out.println(gc.isDaemon());
	}

}
