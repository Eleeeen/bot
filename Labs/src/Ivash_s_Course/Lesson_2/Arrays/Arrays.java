package Ivash_s_Course.Lesson_2.Arrays;

import java.util.Scanner;

public class Arrays {
    int[] arr1; //создала
    int[] arr2 = new int[7]; //объявила

    int[] arr3 = new int[3];

    public Arrays() {

    }

    void fillArr() {
        for (int i = 0; i < arr3.length; i++)
            arr3[i] = i + 1;
    }

    void printArr() {
        for (int i = 0; i < arr3.length; i++)
            System.out.print(arr3[i] + " ");
    }

    int[] arr6 = new int[]{5, 6, 7};

    // public Arrays(int[] arr) {
    //   Arr = arr;
    //}


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        int[] arr4 = new int[] {1,2,3,4};
//        System.out.println(arr4.length);
//        System.out.println();
//
//        int[] arr5;
//        arr5 = new int[]{1,2,3};
//
        Arrays a = new Arrays();
        a.fillArr();
        a.printArr();


    }


    private int Arr[];
    int positive = 0;
    int negative = 0;
    int Null = 0;

    public Arrays(int a) {
        this.Arr = new int[a];
    }

    public void fillArr(int n) {

        for (int i = 0; i < Arr.length; i++) { //почему массив заполняется нулями????
            Arr[i] = (int) (Math.random() * (2 * n) - n);
        }
    }

    public void printArray() {
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + " ");
        }
    }

    void foo() {

        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] > 0) {
                positive++;
            } else if (Arr[i] < 0) {
                negative++;
            } else {
                Null++;
            }
        }

    }

    void showInfo() {
        System.out.println("amount of positive numbers: " + positive);
        System.out.println("amount of negative numbers: " + negative);
        System.out.println("amount of nulls: " + Null);
    }

}
