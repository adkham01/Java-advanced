package com.interview.questions;

public class CheckBinaryNumber {

	public static void isBinary(int number) {
		if(String.valueOf(number).matches("[0-1]+")) {
			System.out.println(number+" : is binary number");
			System.out.println("-----------------------------");
		}
		else {
			System.out.println(number+" : is not binary number");
			System.out.println("-----------------------------");
		}
	}
	
	public static void isBinaryNuber(int number) {
		boolean isBinary = true;
		int copyNumber = number;
		
		while(copyNumber != 0) {
			int rem = copyNumber % 10;
			if(rem > 1) {
				isBinary = false;
				break;
			}
			else {
				copyNumber = copyNumber /10;
			}
		}
		
		if(isBinary) {
			System.out.println(number+" : is binary number");
			System.out.println("-----------------------------");
		}
		else {
			System.out.println(number+" : is not binary number");
			System.out.println("-----------------------------");
		}
	}
	
	
	public static void main(String[] args) {
		 isBinary(1010101);
		 isBinary(10102);
		 isBinary(0);
		 isBinary(850); 
		
		 isBinaryNuber(101010101);
		 isBinaryNuber(101010102);
		 isBinaryNuber(1);
		 isBinaryNuber(50);

	}

}
