package Ivash_s_Course.Lesson_2.Arrays;

import Ivash_s_Course.Lesson_2.Arrays.Arrays;

import java.util.Scanner;

public class MainArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        Arrays array = new Arrays(a);

        int n = in.nextInt();
        array.fillArr(n);
        array.printArray();
        array.foo();

        System.out.println();

        array.showInfo();

    }
}
