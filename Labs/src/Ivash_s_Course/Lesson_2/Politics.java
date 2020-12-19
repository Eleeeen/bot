package Ivash_s_Course.Lesson_2;

public class Politics {
    final String PRESIDENT = "Also Luka";
    static String President = "Luka";
    final static String presidentOfBelarus = "NEVER";

    int Tax = 5000;
    int salary;

    int Naebalovo(int salary) {
        this.salary = salary - this.Tax;
        return this.salary;
    }

    void whoNaebalUs() {
        System.out.println(PRESIDENT);
    }

    static void Suuuka() {
        for (int i = 0; i < 100; i++) {
            System.out.println(presidentOfBelarus);
        }
    }

    static void Pidoras() {
        System.out.println("Your president is " + President);
        System.out.println("When will he leave us?");
        System.out.println(presidentOfBelarus);
        Suuuka();
    }

}
