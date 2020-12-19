package Ivash_s_Course.Lesson_2.MagicMatrix;

import java.util.Scanner;

public class MagicMatrix {

    private int[][] matrix;
    private int[] rowSum;
    private int[] colSum;


    MagicMatrix(int matrixSize) {
        matrix = new int[matrixSize][matrixSize];
        rowSum = new int[matrixSize];
        colSum = new int[matrixSize];

    }

    public void fill() {
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = in.nextInt();
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

    public void rowSum() {
        int rowsSum;
        for (int i = 0; i < matrix.length; i++) {
            rowsSum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                rowsSum += matrix[i][j];
            }
            rowSum[i] = rowsSum;
            System.out.print(rowSum[i] + " ");
        }
    }

    public void colSum() {
        int colsSum;
        for (int j = 0; j < matrix[0].length; j++) {
            colsSum = 0;
            for (int i = 0; i < matrix.length; i++) {
                colsSum += matrix[i][j];
            }
            colSum[j] += colsSum;
            System.out.print(colSum[j] + " ");
        }
    }

    public void Diagonal() {
        int diagsSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) { //[0]==[i]?
                if (i == j) {
                    diagsSum += matrix[i][j];
                }
            }
        }
        System.out.print(diagsSum + " ");

    }

}
