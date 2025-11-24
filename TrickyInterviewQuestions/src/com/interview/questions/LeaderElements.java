package com.interview.questions;

public class LeaderElements {

	public static void finLeaderElements(int[] array) {
		int max = array[array.length-1];
		System.out.print(max);
		
		for(int i = array.length - 2; i >= 0; i--) {
			if(array[i] > max) {
				max = array[i];
				System.out.print(", "+max);
			}			
		}
	}
	
	public static void main(String[] args) {
		int[] array = {92,7,12,9,8,3};
		finLeaderElements(array);
		System.out.println();
		
		int[] array2 = {92,14,12,11,8,15};
		finLeaderElements(array2);
		System.out.println();
		
		int[] array3 = {7,5,12,9,3,3};
		finLeaderElements(array3);

	}

}
