package com.interview.questions;

import java.util.Scanner;

public class CreateMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total rows : ");
		short rows = sc.nextShort(); 
		System.out.print("Enter total columns : ");
		short col = sc.nextShort();
		
		int[][] data = new int[rows][col];
		System.out.println("Please enter the matrix data : ");
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < col; j++) {
				data[i][j] = sc.nextInt();
			}
		}
		
		for(int[] r : data) {
			for(int c : r) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
		
		sc.close();
		
	}

}
