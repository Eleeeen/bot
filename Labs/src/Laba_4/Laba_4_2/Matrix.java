package Laba_4.Laba_4_2;

import java.util.Scanner;

public class Matrix {

    private Scanner in = new Scanner(System.in);

    private int matrix[][];

    public Matrix(int n) {
        matrix = new int[n][n];
    }

    public Matrix(int n, int m) {
        matrix = new int[n][m];
    }

    public void fill() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("Element: " + i + " " + j + " ");
                matrix[i][j] = in.nextInt();
            }
        }
    }

    public void fillRand(int minNumber, int maxNumber) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * (maxNumber - minNumber) + minNumber);
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

    public Matrix plus(Matrix other) {
        if (matrix.length == other.matrix.length && matrix[0].length == other.matrix[0].length) { //если матрицы одинаковые
            Matrix newMatrix = new Matrix(matrix.length, matrix[0].length); //создается новая матрица
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    newMatrix.matrix[i][j] = matrix[i][j] + other.matrix[i][j];
                }
            }
            return newMatrix;
        } else {
            return null;
        }
    }
}
