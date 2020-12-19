package Ivash_s_Course.Lesson_2.MatrixCol;

import java.util.Arrays;

public class Matrix {

    private int[][] matrix;
    private int[] colSumMatrix;

    Matrix(int row, int col) {
        matrix = new int[row][col];
        colSumMatrix = new int[col];
    }

    public void fill() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * 9);
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

    public int findMaxColSum() {
        findColSum();
        Arrays.sort(colSumMatrix);
        return colSumMatrix[colSumMatrix.length - 1];
    }

    private void findColSum() {
        int sum;
        for (int j = 0; j < matrix[0].length; j++) {
            sum = 0;
            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][j];
            }
            colSumMatrix[j] = sum;
        }
    }

}
