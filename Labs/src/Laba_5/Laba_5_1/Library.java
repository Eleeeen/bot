package Laba_5.Laba_5_1;

import java.util.TreeMap;

//import Laba_5.Laba_5_1.Reader.fullName;
import java.io.*;
import java.util.*;

public class Library {
    private final TreeMap<String, Book> books = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
    private final HashMap<String, Reader> readers = new HashMap<>();
    private int readerCount = 0;

    //private String password;

    public Library() {

        try {
            String filePath = "H:\\проекты java\\Labs\\src\\Laba_5\\Laba_5_1\\books.txt"; //прописываем путь до файла books.txt
            File file = new File(filePath); //создаем объект файла на основе filePath
            FileReader fr = new FileReader(file); //Класс File reader позволяет считывать посимвольно данные из файла, это конечно хорошо, но медленно,
            // поэтому используем BufferedReader, он позволяет считывать построчно
            BufferedReader reader = new BufferedReader(fr);

            String line = reader.readLine(); //считываем первую строку файла
            while (line != null) { //читаем файл, до того момента, пока не прочтем его до конца
                String[] temp = line.split(";"); //разделяем по ";" в результате получаем массив из кусочков строки
                String bookName = temp[0].substring(temp[0].indexOf("«") + 1, temp[0].lastIndexOf("»")); //достаем из массива название книги
                // (находим подстроку между первой и последней кавычкой)
                String bookAuthor = temp[0].substring(0, temp[0].indexOf("«")); //примерно та же логика с поиском автора
                // (берем подстроку от начала строки, до первой кавычки)

                //оставшиеся два элемента массива содержат в себе строки с рейтингом и количеством страниц соответственно
                int bookRate = Integer.parseInt(temp[1]); //Получаем из строкового значения числовое
                int bookPages = Integer.parseInt(temp[2]);

                //Закончив разрбор строки по кусочкам, на их основе создаем объект книги и помещаем его в HashMap, где
                //Название книги - ключ, объект класса Book - значение
                //Что это такое HashMap погугли сама (если совсем по-простому Hash-таблица)
                books.put(bookName, new Book(bookName, bookAuthor, bookRate, bookPages));
                line = reader.readLine(); //считываем следующую строку, а после цикл начнет свое выполнение заново
            }


        } catch (FileNotFoundException e) { //"ловим" ошибку отсутсвия файла и выводим ее в консоль
            System.out.println("Файл не найден");
        } catch (IOException e) { //"ловим" ошибку при чтении данных из файла и выводим ее в консоль
            e.printStackTrace();
        }
    }

    public TreeMap<String, Book> getBooks() {
        return new TreeMap<String, Book>(books);
    } //геттер, в котором передается не сама коллекция, а ее копия

    public Book findBook(String bookName) { //метод, который обеспечивает поиск по названию книги
        // в списке (таблице) имеющихся
        if (books.containsKey(bookName)) {
            return books.get(bookName);
        } else {
            return null;
        }
    }

    public void getBook(String bookName) {
        books.remove(bookName);
    } //метод "выдающий" книгу, т.е. книга удаляется из списка имеющихся

    public void addBook(Book book) {
        books.put(book.getName(), book);
    } //метод для добавления книги в список


    public void addReader(String fullName, Reader newReader) {
        readers.put(fullName, newReader);
    }

    public void removeReader(String fullName) {
        readers.remove(fullName);
    }

    public HashMap getReadersList() {
        return new HashMap<String, Reader>(readers);
    }

}
