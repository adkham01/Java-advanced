package com.java.concurency;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadSafeFormatter {
	public static ThreadLocal<SimpleDateFormat> adteFormatter = new ThreadLocal<SimpleDateFormat>() {
		@Override
		protected SimpleDateFormat initialValue() {
			return new SimpleDateFormat("yyyy-MM-dd");
		}

		@Override
		public SimpleDateFormat get() {
			return super.get();
		}
	};
}

public class ThreadLocalEx {

	private static ExecutorService threadPool = Executors.newFixedThreadPool(10);

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			int id = i;
			threadPool.submit(() -> {
				String birthDate = new ThreadLocalEx().birthDate(id);
				System.out.println(birthDate);
			});
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

	public String birthDate(int userId) {
		Date bd = new Date(userId);
		final SimpleDateFormat df = ThreadSafeFormatter.adteFormatter.get();
		return df.format(bd);
	}

}
