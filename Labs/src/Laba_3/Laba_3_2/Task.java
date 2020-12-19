package Laba_3.Laba_3_2;

public class Task {
    public static void main(String[] args) {

        double sum = 0;
        double num = 1;

        for (int n = 1; num > 0.000001; n++) {  //num - дробь(член ряда), n - изменяющаяся переменная
            num = 1 / (double) ((3 * (n - 1) + 1) * (3 * n + 1));
            sum += num;
        }
        System.out.println(sum);
    }
}
