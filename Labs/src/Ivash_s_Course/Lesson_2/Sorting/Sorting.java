package Ivash_s_Course.Lesson_2.Sorting;

import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int a = in.nextInt();
        int[] Arr = new int[a];

        int n = in.nextInt();
        int template = 0;

        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = (int) (Math.random() * (2 * n) - n);
        }

        for (int i = 0; i < Arr.length - 1; i++) {
            if (Arr[i + 1] > Arr[i]) {

                template = Arr[i];
                Arr[i] = Arr[i + 1];
                Arr[i + 1] = template;

            }
        }

        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + " ");
        }

        System.out.println();

        /*for (int i = Arr.length-1; i>=0; i--){
            System.out.print(Arr[i] + " ");
        }*///вывод массива в обратном порядке
    }
}
