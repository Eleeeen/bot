package Laba_5.Laba_5_1;

import java.util.LinkedList;
import java.util.List;

public class Reader {
    private final String fullName;
    private String phoneNumber;
    private String id;

    private String password;

    private final List<Book> activeBooks = new LinkedList<>();

    public Reader(Library library, String fullName, String phoneNumber, String id) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.id = id;
        library.addReader(this.fullName, this);
    }

//    public Reader(){
//        this.fullName = "Yulia";
//        this.phoneNumber = "565745647";
//        this.id = "R4F63776";
//    }

    public void takeBook(Library library, String bookName) { //Метод "получения" книги читателем
        Book book = library.findBook(bookName); //ищем книгу в библеотеке
        if (book != null) { //если находим то,
            library.getBook(bookName); //выдаем (из библиотеки удаляем)
            activeBooks.add(book);//получаем (добавляем в список активных книг читателя)
        }
    }

    public void takeBook(Library library, String... bookNames) { //Метод "получения" книги читателем
        for (String bookName : bookNames) {
            Book book = library.findBook(bookName);
            if (book != null) {
                library.getBook(bookName);
                activeBooks.add(book);
            }
        }
    }

    public void returnBook(Library library, Book book) { //Метод "возврата" книги в библиотеку
        activeBooks.remove(book);//удаляем книгу из "списка активных книг читателя"
        library.addBook(book);//добавляем книгу в список имещихся в библиотеке
    }

    public void returnAllBooks(Library library, List<Book> activeBooks) { //Метод "возврата" книги в библиотеку
        for (Book book : activeBooks) {
            returnBook(library, book);
        }
    }

    public List<Book> getActiveBooks() {
        return new LinkedList<>(activeBooks);
    } //геттер по логике аналогичный геттеру класса Library

    @Override
    public String toString() {
        return new String("\nFull Name: " + fullName +
                "\nPhone: " + phoneNumber +
                "\nID: " + id + "\n");
    }

    public String getPassword() {

        StringBuilder result = new StringBuilder();
        result.append(password.charAt(0));
        for (int i = 1; i < password.length(); i++) {
            result.append("*");
        }
        System.out.println(result);
        return result.toString();
    }

    public String getPassword(String key) {
        StringBuilder result = new StringBuilder();
        result.append(password.charAt(0));

        if (fullName.toLowerCase().equals(key)) {
            for (int i = 1; i < password.length(); i++) {
                result.append("*");
            }
            System.out.println(result);
        } else {
            System.out.println("Ошибка входа. Неверный логин");
        }
        return result.toString();

    }

    public void setPassword(String password, String password1) {
        if (password1.equals(password)) {
            this.password = password;
        } else {
            System.out.println("Пароли не совпадают");
        }
    }

    public String setPassword(String password, String password1, String key) {
        if (password1.equals(password) && fullName.toLowerCase().equals(key)) {
            this.password = password;
        } else {
            System.out.println("Пароли не совпадают");
        }

        return password;
    }

}
