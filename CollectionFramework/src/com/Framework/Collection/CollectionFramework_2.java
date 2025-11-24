package com.Framework.Collection;

public class CollectionFramework_2 {

	public static void main(String[] args) {
		int[][] a = {{1,2,3},{2,3,4},{3,4,5},{4,5,6}};
		for(int[] row : a) {
			for(int val : row) {
				System.out.print(val+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		displayBankNames(new String[]{"AAA","BBB","CCC","DDD"});
	}
	public static void displayBankNames(String[] banks) {
		for(String names : banks) {
			System.out.println(names);
		}
	}

}
