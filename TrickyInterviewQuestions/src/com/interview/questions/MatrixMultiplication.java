package com.interview.questions;

public class MatrixMultiplication {
	public static void main(String[] args) {
		int[][] matrix1 = { { 2, 3, 4, 5 }, { 4, 5, 9, 3 }, { 4, 5, 6, 8 } };

		int[][] matrix2 = { { 7, 8 }, { 6, 5 }, { 3, 5 }, { 3, 9 } };

		int rowsMatrix1 = matrix1.length;
		int colsMatrix1 = matrix1[0].length;
		int colsMatrix2 = matrix2[0].length;

		int[][] resultMatrix = new int[rowsMatrix1][colsMatrix2];

		for (int i = 0; i < rowsMatrix1; i++) {
			for (int j = 0; j < colsMatrix2; j++) {
				for (int k = 0; k < colsMatrix1; k++) {
					resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}

		// Display the result matrix
		for (int i = 0; i < rowsMatrix1; i++) {
			for (int j = 0; j < colsMatrix2; j++) {
				System.out.print(resultMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
