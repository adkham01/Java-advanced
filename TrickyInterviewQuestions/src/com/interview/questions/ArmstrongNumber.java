package com.interview.questions;

public class ArmstrongNumber {

	public static boolean isArmStrongNumber(int number) {
		if (number < 0) {
			return false;
		}
		if (number >= 0 && number <= 9) {
			return true;
		}
		int power = power(number);
		int copyNum = number;
		int sum = 0;
		while (copyNum != 0) {
			int lastDigit = copyNum % 10;
			int factor = 1;
			for (int i = 0; i < power; i++) {
				factor *= lastDigit;
			}
			sum += factor;
			copyNum /= 10;
		}
		if (sum == number) {
			return true;
		}

		return false;

	}

	private static int power(int number) {
		int count = 0;
		int copyNumber = number;
		while (copyNumber != 0) {
			count++;
			copyNumber /= 10;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(isArmStrongNumber(0));
		System.out.println(isArmStrongNumber(1));
		System.out.println(isArmStrongNumber(-15));
		System.out.println(isArmStrongNumber(153));
		System.out.println(isArmStrongNumber(9474));
		System.out.println(isArmStrongNumber(7985));

	}

}
