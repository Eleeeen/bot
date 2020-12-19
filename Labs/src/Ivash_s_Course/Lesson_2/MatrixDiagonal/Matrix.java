package Ivash_s_Course.Lesson_2.MatrixDiagonal;

import java.util.Scanner;

public class Matrix {

    private int[][] matrix;
    int sum = 0;

    Matrix(int matrixSize) {
        matrix = new int[matrixSize][matrixSize];
    }

    public void fill(int diagonalElement) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * (2 * diagonalElement) - diagonalElement);
            }
        }
    }

    public void print() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void Diagonal() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j && matrix[i][j] > 0) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println("The sum of positive diagonal element's is " + sum);
    }
}
