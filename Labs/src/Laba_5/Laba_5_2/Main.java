package Laba_5.Laba_5_2;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(120, 90, 30);
        triangle.getInfo();
        triangle.findMedian("a");
        triangle.changeSide(20, "AB");
        triangle.getInfo();


    }
}
