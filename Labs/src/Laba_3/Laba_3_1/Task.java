package Laba_3.Laba_3_1;

import static java.lang.Math.*;

public class Task {
    public static void main(String[] args) {

        Point p1 = new Point(0, 0); //создаю экземпляры класса Point
        Point p2 = new Point(0, 3);
        Point p3 = new Point(5, 0);

        Vector v1 = new Vector(p2, p1);
        Vector v2 = new Vector(p3, p2);
        Vector v3 = new Vector(p1, p3);

        System.out.println("Vector's coordinates: ");
        v1.getInfo();
        v2.getInfo();
        v3.getInfo();
        System.out.println();

        double e1 = findEdge(v1, v2);
        System.out.println("The first edge: " + e1);
        double e2 = findEdge(v2, v3);
        System.out.println("The second edge: " + e2);
        double e3 = findEdge(v1, v3);
        System.out.println("The third edge: " + e3);
        System.out.println();


        if (e1 + e3 + e3 >= 180) {
            if (e1 > e3 && e1 > e3) {
                System.out.println("The largest one is: " + e1);
            } else if (e3 > e1 && e3 > e3) {
                System.out.println("The largest one: " + e3);
            } else {
                System.out.println("The largest one is: " + e3);
            }
        } else {
            System.out.println("Error");
        }

    }

    public static double findEdge(Vector v1, Vector v2) {
        return toDegrees(acos(abs(((v1.x * v2.x) + (v1.y * v2.y))) / (sqrt(pow(v2.x, 2) + pow(v2.y, 2)) * (sqrt(pow(v1.x, 2) + pow(v1.y, 2))))));
    }
}
