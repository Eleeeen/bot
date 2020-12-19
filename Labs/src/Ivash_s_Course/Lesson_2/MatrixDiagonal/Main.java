package Ivash_s_Course.Lesson_2.MatrixDiagonal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Type the matrix size: ");
        int matrixSize = in.nextInt();
        Matrix matrix = new Matrix(matrixSize);

        System.out.println("Type the value to fill matrix: ");
        int value = in.nextInt();
        matrix.fill(value);
        matrix.print();
        matrix.Diagonal();
    }

}
