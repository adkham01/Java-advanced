package com.multiThreading;
class A7 {
	String str1 = new String("Core");
	StringBuffer sb1 = new StringBuffer("Core");
	void modify() {
		String str2 = str1.concat(" Java");
		StringBuffer sb2 = sb1.append(" Java");
		System.out.println("str2 : "+Thread.currentThread().getName()+" "+str2);
		System.out.println("sb2  : "+Thread.currentThread().getName()+" "+sb2);
	}
			
}
class Thread6 extends Thread{
	A7 a;
	public Thread6(A7 a) {
		this.a = a;
	}
	@Override
	public void run() {
		a.modify();
	}
}
class Thread7 extends Thread{
	A7 a;
	public Thread7(A7 a) {
		this.a = a;
	}
	@Override
	public void run() {
		a.modify();
	}
}
public class MultiThreading_17 {
	
	public static void main(String[] args) {
		A7 a = new A7();
		Thread6 t1 = new Thread6(a);
		Thread7 t2 = new Thread7(a);
		
		t1.setName("Thread-1");
		t2.setName("Thread-2");
		
		t1.start();
		t2.start();
	}
}
