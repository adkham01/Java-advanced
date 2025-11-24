package com.interview.questions;

import java.io.IOException;

public class AppRun {

	public static void main(String[] args) throws InterruptedException {
		Runtime runtime = Runtime.getRuntime();
		try {
			Process pr = runtime.exec("notepad.exe");
			Thread.sleep(4000);
			pr.destroy();
			System.out.println("Done.....");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
