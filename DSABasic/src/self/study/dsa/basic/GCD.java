package self.study.dsa.basic;

import java.util.Scanner;

public class GCD {

	public static int findGCD1(int fn, int sn) {
		int n = Math.min(fn, sn);
		int gcd = 1;
		for (int i = 1; i <= n; i++) {
			if (fn % i == 0 && sn % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}

	public static int findGCD2(int fn, int sn) {
		while (fn > 0 && sn > 0) {
			if (fn > sn) {
				fn = fn % sn;
			} else {
				sn = sn % fn;
			}

		}
		if (fn == 0) {
			return sn;
		} else {
			return fn;
		}
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the first Number : ");
			int firstNum = sc.nextInt();
			System.out.print("Enter the second Number : ");
			int secondNum = sc.nextInt();
			System.out.println(findGCD1(firstNum, secondNum));
		}

	}

}
