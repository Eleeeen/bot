package Laba_4.Laba_4_2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("type the matrix's size: ");

        int a = in.nextInt();
        int b = in.nextInt();

        int[][] matrixA;
        matrixA = new int[a][b];

        System.out.println("First matrix: ");

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                matrixA[i][j] = (int) (Math.random() * 9);
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Second matrix: ");

        int[][] matrixB;
        matrixB = new int[a][b];

        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB.length; j++) {
                matrixB[i][j] = (int) (Math.random() * 9);
                System.out.print(matrixB[i][j] + " ");
            }
            System.out.println();
        }

        int[][] matrixC;
        matrixC = new int[a][b];

        System.out.println("The result matrix: ");

        for (int i = 0; i < a; i++) {

            for (int j = 0; j < b; j++) {

                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
                System.out.print(matrixC[i][j] + " ");
            }
            System.out.println();
        }
    }
}