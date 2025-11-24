package self.study.dsa.basic;

import java.util.Scanner;

public class PrintAllDivisors {
	
	public static void printDivisors1(int n) {
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				System.out.print(i+"\t");				
			}
		}
	}
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the number you want to know devisors : ");
			int input = sc.nextInt();
			printDivisors1(input);
			System.out.println();
			
		}
		
	}

}
