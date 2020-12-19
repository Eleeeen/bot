package Laba_4.Laba_4_1;

public class Array {

    private int[] array; //поле класса, которое используется в методах

    public Array(int n) {
        array = new int[n];
    }

    public void fillArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 9);
        }
    }

    public void PrintArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public Array PlusArray(Array arr) {  // Array arr - это переменная сощданного типа Array, и он исполняет роль второго массива mas2,который прибавляетс к первому mas1
        if (array.length == arr.array.length) {
            Array newArr = new Array(array.length); //массив, в который запишется результат сложения
            for (int i = 0; i < array.length; i++) {
                newArr.array[i] = array[i] + arr.array[i];
            }
            return newArr;
        } else {
            return null;
        }

    }

}
