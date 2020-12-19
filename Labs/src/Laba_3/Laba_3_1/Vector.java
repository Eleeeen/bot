package Laba_3.Laba_3_1;

public class Vector {
    public int x;   //поля класса
    public int y;

    Vector(Point p1, Point p2) { //конструктор для инициализации. поля класса использую для того, чтобы применить экземпляры класса поинт в качестве параметров для вычисления координат векторов
        x = p2.x - p1.x;
        y = p2.y - p1.y;
    }

    public void getInfo() {
        System.out.println("X: " + x + "\t" + "Y: " + y);
    }
}
