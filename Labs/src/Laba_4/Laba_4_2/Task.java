package Laba_4.Laba_4_2;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("type the matrix's size: ");

        Matrix m1 = new Matrix(5);
        Matrix m2 = new Matrix(5);

        m1.fillRand(0, 9);
        m1.print();
        System.out.println();
        m2.fillRand(0, 9);
        m2.print();
        System.out.println();
        Matrix result = m1.plus(m2);

        try {
            result.print();
        } catch (NullPointerException e) {
            System.out.println("Нельзя складывать матрицы разных размерностей");
        }

    }
}
