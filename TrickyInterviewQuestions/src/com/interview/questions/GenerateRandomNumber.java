package com.interview.questions;

import java.util.Random;

/**
 * Generate Random Number in Java
 * 1.Random Class
 * 2.Math.random();
 * 3.ThreadLocalRandom
 * @author Adham
 *
 */
public class GenerateRandomNumber {

	public static void main(String[] args) {
		Random random = new Random();
		for(int i = 0; i < 10; i++) {
			System.out.println(random.nextInt());
		}
	}

}
