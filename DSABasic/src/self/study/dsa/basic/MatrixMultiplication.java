package self.study.dsa.basic;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number of rows in the first matrix: ");
		int rowsFirst = scanner.nextInt();
		System.out.print("Enter number of columns in the first matrix and number of rows in the second matrix: ");
		int colSecondRowFirst = scanner.nextInt();
		System.out.print("Enter number of columns in the second matrix: ");
		int colSecond = scanner.nextInt();

		int[][] matrix1 = new int[rowsFirst][colSecondRowFirst];
		int[][] matrix2 = new int[colSecondRowFirst][colSecond];
		int[][] productMatrix = new int[rowsFirst][colSecond];

		System.out.println("Enter data for Matrix 1:");
		for (int i = 0; i < rowsFirst; i++) {
			for (int j = 0; j < colSecondRowFirst; j++) {
				matrix1[i][j] = scanner.nextInt();
			}
		}

		System.out.println("Enter data for Matrix 2:");
		for (int i = 0; i < colSecondRowFirst; i++) {
			for (int j = 0; j < colSecond; j++) {
				matrix2[i][j] = scanner.nextInt();
			}
		}

		System.out.println("Data of Matrix 1:");
		for (int i = 0; i < rowsFirst; i++) {
			for (int j = 0; j < colSecondRowFirst; j++) {
				System.out.print(matrix1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Data of Matrix 2:");
		for (int i = 0; i < colSecondRowFirst; i++) {
			for (int j = 0; j < colSecond; j++) {
				System.out.print(matrix2[i][j] + " ");
			}
			System.out.println();
		}
		for(int i = 0; i < rowsFirst; i++) {
			for(int j = 0; j < colSecond; j++) {
				for(int k = 0; k < colSecondRowFirst; k++) {
					productMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}
		System.out.println("Data of product MAtrix:");
		for (int i = 0; i < rowsFirst; i++) {
			for (int j = 0; j < colSecond; j++) {
				System.out.print(productMatrix[i][j] + " ");
			}
			System.out.println();
		}
		scanner.close();
	}

}
