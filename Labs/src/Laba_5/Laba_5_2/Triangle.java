package Laba_5.Laba_5_2;

import static java.lang.Math.*;

public class Triangle {
    private double a, b, c;
    private double edgeA, edgeB, edgeC;

    public Triangle(double a, double eA, double eB) {
        this.a = a;
        this.edgeA = eA;
        this.edgeB = eB;

        this.edgeC = 180 - eA - eB;
        this.b = a * (sin(toRadians(eA)) / sin(toRadians(edgeC)));
        this.c = a * (sin(toRadians(eB)) / sin(toRadians(edgeC)));
    }

    public void getInfo() {
        System.out.println("A: " + a + "\nB: " + b + "\nC: " + c);
        System.out.println("Edge A: " + edgeA + "\nEdge B: " + edgeB + "\nEdge C: " + edgeC);
    }

    public void changeSide(double percent, String side) {
        switch (side.toUpperCase()) {
            case "AB": {
                if (a * percent >= b + c) {
                    System.out.println("Треугольник с заданными параметрами не существует");
                } else {
                    this.a *= percent;
                    findEdges();
                }
                break;
            }
            case "BC": {
                if (b * percent >= a + c) {
                    System.out.println("Треугольник с заданными параметрами не существует");
                } else {
                    this.b *= percent;
                    findEdges();
                }
                break;
            }
            case "AC": {
                if (c * percent >= a + b) {
                    System.out.println("Треугольник с заданными параметрами не существует");
                } else {
                    this.c *= percent;
                    findEdges();
                }
                break;
            }
            default: {
                System.out.println("Заданной стороны не существует");
                break;
            }
        }
    }

    private void findEdges() {
        edgeC = findEdge(b, c, a);
        edgeB = findEdge(a, b, c);
        edgeA = findEdge(a, c, b);
    }

    private double findEdge(double a, double b, double c) {
        double edge = ((pow(a, 2) + pow(b, 2) - pow(c, 2))) / (2 * a * b);
        return toDegrees(acos(edge));
    }

    public double findMedian(String edge) {
        switch (edge.toUpperCase()) {
            case "A": {
                return calcMedian(a, c, b);
            }
            case "B": {
                return calcMedian(a, b, c);
            }
            case "C": {
                return calcMedian(b, c, a);
            }
            default: {
                System.out.println("Заданной стороны не существует");
                return -1;
            }
        }
    }


    private double calcMedian(double side1, double side2, double side3) {
        return (double) 1 / 2 * (sqrt(2 * pow(side1, 2) + 2 * pow(side2, 2) - pow(side3, 2)));
    }

    public boolean isSimilar(Triangle otherTriangle) {
        if (this.a / otherTriangle.getA() == this.b / otherTriangle.getB() && this.b / otherTriangle.getB() == this.c / otherTriangle.getC()) {
            return true;
        } else {
            return false;
        }
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}
