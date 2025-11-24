package self.study.dsa.basic;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Parralelism {
	static int ticketAvailable = 100;

	public static void main(String[] args) throws InterruptedException {
		Lock lock = new ReentrantLock();
		new Thread(() -> {
			lock.lock();
			if (ticketAvailable > 0) {
				bookTicket();
				ticketAvailable--;
			}
			lock.unlock();
		}).start();

		new Thread(() -> {
			lock.lock();
			if (ticketAvailable > 0) {
				bookTicket();
				ticketAvailable--;
			}
			lock.unlock();
		}).start();

		Thread.sleep(1000);

	}

	public static void bookTicket() {
		System.out.println("Ticked booked");
	}

}
