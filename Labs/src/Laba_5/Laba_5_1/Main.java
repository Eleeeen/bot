package Laba_5.Laba_5_1;

import java.util.Scanner;

import Laba_5.Laba_5_1.Book;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Book booo = new Book();//удалить
        Main boo = new Main();
        System.out.println(booo.bo);


        Library library = new Library();
        Reader reader1 = new Reader(library, "Elen", "9687598430", "14A21B");

        System.out.println("Введите пароль");
        String p = in.nextLine();

        System.out.println("Введите пароль повторно");
        String p1 = in.nextLine();

        System.out.println("Введите логин");
        String l1 = in.nextLine();
        reader1.setPassword(p, p1, l1);

        reader1.getPassword(l1);

        //Тест на то, что книга удаляется и добавляется в списки

        reader1.takeBook(library, "1984");
        for (Book book : reader1.getActiveBooks()) {
            System.out.println(book);
        }

        System.out.println(library.findBook("1984"));

        reader1.returnBook(library, reader1.getActiveBooks().get(0));

        System.out.println(library.findBook("1984"));
    }
}
