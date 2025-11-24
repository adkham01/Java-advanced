package com.Framework.Collection;

public class CollectionFramework_1 {

	public static void main(String[] args) {
		int[][] a = {{1,2,3},{2,3,4},{3,4,5},{4,5,6}};
		
		for(int row = 0; row < a.length; row++) {
			for(int col = 0; col < a[row].length; col++) {
				System.out.print(a[row][col]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		 int row = 0;
		 while (row < a.length) {
			int col = 0;
			while(col < a[row].length) {
				System.out.print(a[row][col]+" ");
				col += 1;
			}
			row += 1;
			System.out.println();
		}
		System.out.println();
		
		 int rowIndex = 0;
		 do {
			int colIndex = 0;
			do {
				System.out.print(a[rowIndex][colIndex]+" ");
				colIndex += 1;
			} while (colIndex < a[rowIndex].length);
			rowIndex += 1;
			System.out.println();
		} while (rowIndex < a.length);
			 
	}

}
