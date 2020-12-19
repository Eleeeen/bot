package Laba_5.Laba_5_1;

public class Book {

    public int bo = 47; //udalit

    private String name;
    private String author;
    private int rate;
    private int pages;

    public Book(String name, String author, int rate, int pages) {
        this.name = name;
        this.author = author;
        this.rate = rate;
        this.pages = pages;
    }

    public Book() {
        this.name = "Inferno";
        this.author = "Den Brown";
        this.rate = 9;
        this.pages = 631;
    }

    public String getName() {
        return name;
    }


    @Override //Переопределяем метод toString
    public String toString() {
        return "\nНазвание: " + name +
                "\nАвтор: " + author +
                "\nСредняя оценка читателей: " + rate +
                "\nКоличество страниц: " + pages + "\n";
    }
}
