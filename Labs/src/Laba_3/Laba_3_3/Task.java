package Laba_3.Laba_3_3;

import static java.lang.Math.*;

public class Task {
    public static void main(String[] args) {
        int n = 1;  // num член ряда, n - изменящаяся переменная(итератор)
        double num = 1;
        double num2 = 1;
        double sum = 0;

        do {
            num = pow(-1, n + 1) * (1 / (3 * pow(n, 2)));
            num2 = pow(-1, n + 2) * (1 / (3 * pow(n, 2)));
            sum += num;
            n++;
            //System.out.println(num);
        }
        while (abs(num - num2) > 0.0001);
        System.out.println(sum);


    }
}
