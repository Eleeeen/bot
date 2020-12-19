package Ivash_s_Course.Lesson_2.MatrixCol;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(2, 2);
        matrix.fill();
        matrix.print();
        System.out.println();
        System.out.println(matrix.findMaxColSum());

    }
}
