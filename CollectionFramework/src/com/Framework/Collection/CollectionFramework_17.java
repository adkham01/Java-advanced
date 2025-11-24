package com.Framework.Collection;
class MyThread implements Runnable{
	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println("My Thread : "+i);
		}
		
	}
}
public class CollectionFramework_17 {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		Thread t = new Thread(mt);
		t.start();
		for(int i = 1; i <= 10; i++) {
			System.out.println("Main Thread : "+i);
		}

	}

}
