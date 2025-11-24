package self.study.dsa.basic;

import java.util.Scanner;

public class IsPrime {

	public static boolean isPrime(int number) {
		int count = 0;
		for(int i = 2; i <= (int) Math.sqrt(number);i++) {
			if(number % i == 0) {
				count++;
			}
		}
		return count == 0;
	}
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Which Number do you want check : ");
			int input = sc.nextInt();
			System.out.println(isPrime(input));
		}

	}

}
