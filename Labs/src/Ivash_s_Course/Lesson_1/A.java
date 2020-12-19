package Ivash_s_Course.Lesson_1;

import Ivash_s_Course_too.*;

public class A {

    public static void main(String[] args) {

        B newName = new B("Zaur", 29, 56.3);
        //как задать ему значение
        System.out.println(newName);

        //B newName_1 = new B("Zaur", 29); //error
        //B newName_2 = new B(56.3); // error

        Ivash_s_Course_too.B NAME = new Ivash_s_Course_too.B("Still Eleeeen", 43, 765);
        System.out.println(NAME.name);

        //System.out.println(name);

        B object = new B();
        object.name = "eleen";
        System.out.println(object.name);

    }
}
