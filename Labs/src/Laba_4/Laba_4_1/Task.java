package Laba_4.Laba_4_1;

public class Task {
    public static void main(String[] args) {

        Array mas1 = new Array(5);
        Array mas2 = new Array(5);

        mas1.fillArray();
        mas2.fillArray();
        System.out.println();

        mas1.PrintArray();
        mas2.PrintArray();
        System.out.println();

        Array resultMas = mas1.PlusArray(mas2);
        resultMas.PrintArray();

    }
}
