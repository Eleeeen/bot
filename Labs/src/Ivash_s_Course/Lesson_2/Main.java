package Ivash_s_Course.Lesson_2;

import java.util.Scanner;

import static Ivash_s_Course.Lesson_2.Politics.Pidoras;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Pidoras();

        Politics people = new Politics();

        System.out.println("Who is naebal us?");
        people.whoNaebalUs();

        System.out.println("How is he naebal us now? " + "\n" + "Your Salary: ");
        int yourSalary = in.nextInt();
        people.Naebalovo(yourSalary);
        System.out.print(yourSalary + "? No: ");

        System.out.println(people.salary);
        System.out.println("Ny kak? s'yel?");
    }
}
