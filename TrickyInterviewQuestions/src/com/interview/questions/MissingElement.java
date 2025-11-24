package com.interview.questions;

/**
 * Find out the missing element in an integer array
 * 
 * @author Adham
 *
 */

public class MissingElement {

	public static void main(String[] args) {
		int[] arry = { 1, 2, 3, 4, 5, 7, 8, 9 };
		int missingNumber = findMissingNumber(arry, 9);
		System.out.println(missingNumber);
	}

	public static int findMissingNumber(int[] arry, int totalCount) {
		int expSum = totalCount * ((totalCount + 1) / 2);
		System.out.println(expSum);
		int actualSum = 0;
		for (int i : arry) {
			actualSum += i;
		}

		return expSum - actualSum;
	}
}
