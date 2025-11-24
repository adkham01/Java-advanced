package com.interview.questions;

public class ReveerseNumber {
	public static void reverse(int number) {
		if (number < 10) {
			System.out.print(number);
			return;
		} else {
			System.out.print(number % 10);
			reverse(number / 10);
		}
	}

	public static void main(String[] args) {
		int num = 1234;
		reverse(num);
		System.out.println();

		while (num > 0) {
			int rev = num % 10;
			System.out.print(rev);
			num /= 10;
		}
	}

}
