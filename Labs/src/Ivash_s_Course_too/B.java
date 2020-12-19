package Ivash_s_Course_too;

public class B {
    public String name;
    private int age;
    protected double id;

    public B() {

    }

    public B(String name, int age, double id) {

        this.name = name;
        this.age = age;
        this.id = id;
    }

    private B(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected B(double id) {
        this.id = id;
    }

    public static void main(String[] args) {
        B object = new B("Eleeeen", 19, 456.7);
        System.out.println(object.name);
        System.out.println(object.age);
        System.out.println(object.id);
    }
}
