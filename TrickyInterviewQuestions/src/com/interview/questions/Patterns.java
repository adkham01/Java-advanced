package com.interview.questions;

public class Patterns {

	public static void main(String[] args) {
		System.out.println("Pattern 1");
		print1(5);
		System.out.println();
		System.out.println("Pattern 2");
		print2(5);
		System.out.println();
		System.out.println("Pattern 3");
		print3(5);
		System.out.println();
		System.out.println("Pattern 4");
		print4(5);
		System.out.println();
		System.out.println("Pattern 5");
		print5(5);
		System.out.println();
		System.out.println("Pattern 6");
		print6(5);
		System.out.println();
		System.out.println("Pattern 7");
		print7(5);
		System.out.println();
		System.out.println("Pattern 8");
		print8(5);
		System.out.println();
		System.out.println("Pattern 9");
		print9(5);
		System.out.println();
		System.out.println("Pattern 10");
		print10(5);
		System.out.println();
		System.out.println("Pattern 11");
		print11(5);
		System.out.println();
		System.out.println("Pattern 12");
		print12(4);
		System.out.println();

	}

	public static void print1(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void print2(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= n * 2 - (i * 2 - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void print3(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void print4(int n) {
		int star = 0;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0)
				star = 1;
			else
				star = 0;
			for (int j = 0; j <= i; j++) {
				System.out.print(star);
				star = 1 - star;
			}
			System.out.println();
		}
	}

	public static void print5(int n) {
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int k = 1; k <= 2 * (n - 1) - (i * 2); k++) {
				System.out.print(" ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

	public static void print6(int n) {
		int number = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(number + " ");
				number += 1;
			}
			System.out.println();
		}
	}

	public static void print7(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (65 + i) + " ");
			}
			System.out.println();
		}
	}

	public static void print8(int n) {
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= (n - 1) - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print((char) (65 + j));
			}
			for (int j = i; j > 1; j--) {
				System.out.print((char) (63 + j));
			}
			System.out.println();
		}

	}

	public static void print9(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 69 - i; j <= 69; j++) {
				System.out.print((char) j + " ");

			}
			System.out.println();
		}
	}

	public static void print10(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print("*");
			}
			for (int j = 0; j < (i * 2) - 2; j++) {
				System.out.print(" ");
			}
			for (int j = n; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = (n - i) * 2; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void print11(int n) {
		byte space = 8;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			space -= 2;
			System.out.println();

		}
		byte initialspace = 2;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < initialspace; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print("*");
			}
			initialspace += 2;
			System.out.println();

		}
	}

	public static void print12(int n) {
		for (int i = 0; i < n; i++) {
			if (i == 0 || i == n - 1) {
				for (int j = 0; j < n; j++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for (int j = i; j <= i; j++) {
					System.out.print("*");
				}
				for (int j = i; j <= i + 1; j++) {
					System.out.print(" ");
				}
				for (int j = i; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

}
