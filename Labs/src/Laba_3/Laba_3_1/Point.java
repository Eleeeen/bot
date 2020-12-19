package Laba_3.Laba_3_1;

public class Point {

    public int x; //поля класса
    public int y;

    public Point(int x, int y) { //constructor
        this.x = x;  //инициализация переменных. this использую, чтобы компилятор не перепутал его с параметром
        this.y = y;
    }
}
