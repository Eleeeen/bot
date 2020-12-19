package Fibonacci;

import java.util.Scanner;

public class Fibonacci_riddle {

    public static int nthFibonacciTerm(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int n0 = 0, n1 = 1;
        int tempNthTerm;
        for (int i = 2; i <= n; i++) {
            tempNthTerm = n0 + n1;
            n0 = n1;
            n1 = tempNthTerm;
        }

        return n1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //int i = 1;
        int temple = 0;
        int next = 1;
        int prev = 1;

        for (int i = 1; i < 10; i++) {
            temple = next;
            next = prev + next;
            prev = temple;
            //System.out.println(prev);
        }

        int b = 1;
        int a = 1;
        int t = 0;
        int t2 = 0;

        for (int i = 1; i < 10; i++) {
            t = a + b;
            t2 = t + b;
            b = t;
            t = 0;


            System.out.println("temp: " + t);
            System.out.println("temp2: " + t2);
            System.out.println("b: " + b);
        }

    }

}
