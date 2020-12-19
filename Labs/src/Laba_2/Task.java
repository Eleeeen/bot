package Laba_2;

import static java.lang.Math.*;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Type the first value: ");
        double firstValue = in.nextDouble();
        System.out.print("Type the second value: ");
        double secondValue = in.nextDouble();
        System.out.print("Type the third value: ");
        double thirdValue = in.nextDouble();

        double resultValue = (2 * pow(secondValue, firstValue) + 3 * pow(firstValue, secondValue) - (secondValue * ((atan(thirdValue) - PI / 6) / abs(firstValue) + 1 / pow(secondValue, 2) + 1)));

        System.out.print("The answer is " + resultValue);

    }
}
