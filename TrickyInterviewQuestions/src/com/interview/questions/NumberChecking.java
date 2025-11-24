package com.interview.questions;

public class NumberChecking {
	public static boolean isNumber(String number) {
		try {
			Long.parseLong(number);
			System.out.println("This is a valid number : "+number);
		} catch (NumberFormatException e) {
			System.out.println("This is not valid number : "+number);
			return false;
		}
		return true;
	}
	
	public static boolean isValidPhoneNumber(String number) {
		if(number.length() == 10 && isNumber(number)) {
			System.out.println("Valid phone Number : "+number);
			return true;
		}
		else {
			System.out.println("Not valid phone Number  :" +number);
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.println(isValidPhoneNumber("9989911419"));

	}

}
