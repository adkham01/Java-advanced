package com.interview.questions;

public class StringToInteger {

	public static int stringToNumber(String str) {
		int number = 0;

		for (int i = 0; i < str.length(); i++) {
			number = number * 10 + ((int) str.charAt(i) - 48);
		}
		return number;
	}

	public static int convertToInt(String str) {
		char[] ch = str.toCharArray();
		int sum = 0;

		for (char c : ch) {
			int ascVal = (int) c - 48;
			sum = sum * 10 + ascVal;
		}
		return sum;

	}

	public static void main(String[] args) {
		System.out.println(stringToNumber("54") + 6);
		System.out.println(convertToInt("12345") + 10);

	}

}
