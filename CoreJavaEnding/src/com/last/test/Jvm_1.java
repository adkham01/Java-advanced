package com.last.test;

import java.util.Date;

public class Jvm_1 {

	public static void main(String[] args) {
		for(int i = 0; i < 1000; i++) {
			new Date();
		}
		Runtime rt = Runtime.getRuntime();
		System.out.println(rt.maxMemory()/(1024 * 1024));
		System.out.println(rt.totalMemory()/(1024 * 1024));
		System.out.println(rt.freeMemory()/(1024 * 1024));
		System.out.println(rt.totalMemory() - rt.freeMemory()/(1024 * 1024));
	}

}
