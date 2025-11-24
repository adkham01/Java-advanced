package com.java.concurency;

class FieldVisiblity {
	int x = 0;

	public void writeThread() {
		x = 1;
		System.out.println(x);
	}

	public void readThread() {
		int r = x;
		System.out.println(r);
	}
}

class WriteThread extends Thread {
	FieldVisiblity f;

	public WriteThread(FieldVisiblity f) {
		this.f = f;
	}

	@Override
	public void run() {
		f.writeThread();
	}
}

class ReadThread extends Thread {
	FieldVisiblity f;

	public ReadThread(FieldVisiblity f) {
		this.f = f;
	}

	@Override
	public void run() {
		f.readThread();
	}
}

public class FieldVisiblityIssue {

	public static void main(String[] args) {
		FieldVisiblity f = new FieldVisiblity();
		WriteThread wt = new WriteThread(f);
		ReadThread rt = new ReadThread(f);
		wt.start();
		rt.start();
		System.out.println("Done.....");
	}

}
