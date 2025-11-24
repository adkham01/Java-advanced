package com.java.concurency;

class VolatileVisiblityEx {
	int a = 0, b = 0, c = 0;
	volatile int x = 0;

	public void writeThread() {
		a = 1;
		b = 1;
		c = 1;

		x = 1;
		System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", x = " + x);
	}

	public void readThread() {
		int r2 = x;

		int d1 = a;
		int d2 = b;
		int d3 = c;
		System.out.println("r2 = " + r2 + ", d1 = " + d1 + ", d2 = " + d2 + ", d3 = " + d3);
	}
}

class WriteThreadVolatile extends Thread {
	VolatileVisiblityEx f;

	public WriteThreadVolatile(VolatileVisiblityEx f) {
		this.f = f;
	}

	@Override
	public void run() {
		f.writeThread();
	}
}

class ReadThreadVolatile extends Thread {
	VolatileVisiblityEx f;

	public ReadThreadVolatile(VolatileVisiblityEx f) {
		this.f = f;
	}

	@Override
	public void run() {
		f.writeThread();
	}
}

public class VolatileVisiblity {
	/**
	 * Happens before relationship Not only volatile Also 
	 * 1.Synchronized 
	 * 2.Locks
	 * 3.Concurent collections 
	 * 4.Thread operations(Join,start)
	 * 
	 * @param args Final fields(Special Behavior)
	 */
	public static void main(String[] args) {
		VolatileVisiblityEx vex = new VolatileVisiblityEx();
		WriteThreadVolatile wt = new WriteThreadVolatile(vex);
		ReadThreadVolatile rt = new ReadThreadVolatile(vex);
		wt.start();
		rt.start();
		System.out.println("Done...");
	}

}
