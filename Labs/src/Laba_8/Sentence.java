//package Laba_8;
//
//import Laba_5.Laba_5_1.Book;
//
//import java.io.*;
//
//public class Sentence extends Text {
//    private String line;
//
//    public Sentence(){
//
//        try {
//            String filePath = "H:\\проекты java\\Labs\\src\\Laba_8\\Text.txt"; //прописываем путь до файла Text.txt
//            File file = new File(filePath); //создаем объект файла на основе filePath
//            FileReader fr = new FileReader(file); //Класс File reader позволяет считывать посимвольно данные из файла, это конечно хорошо, но медленно,
//            // поэтому используем BufferedReader, он позволяет считывать построчно
//            BufferedReader reader = new BufferedReader(fr);
//
//            String line = reader.readLine(); //считываем первую строку файла
//            while(line !=null) { //читаем файл, до того момента, пока не прочтем его до конца
//                String [] temp = line.split("\\."); //разделяем по "." в результате получаем массив из кусочков строки
//
//                line = reader.readLine(); //считываем следующую строку, а после цикл начнет свое выполнение заново
//            }
//
//        } catch (FileNotFoundException e) { //"ловим" ошибку отсутсвия файла и выводим ее в консоль
//            System.out.println("Файл не найден");
//        } catch (IOException e) { //"ловим" ошибку при чтении данных из файла и выводим ее в консоль
//            e.printStackTrace();
//        }
//    }
//}
