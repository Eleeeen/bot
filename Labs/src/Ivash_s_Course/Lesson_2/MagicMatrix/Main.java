package Ivash_s_Course.Lesson_2.MagicMatrix;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int matrixSize = in.nextInt();
        MagicMatrix matrix = new MagicMatrix(matrixSize);

        matrix.fill();
        matrix.print();
        System.out.println();
        matrix.rowSum();
        System.out.println();
        matrix.colSum();
        System.out.println();
        matrix.Diagonal();
        System.out.println();
    }
}
