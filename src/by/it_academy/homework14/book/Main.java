package by.it_academy.homework14.book;

import java.io.*;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//Управление списком книг.
//Файл books.txt содержит список книг в бинарном формате. Необходимо прочитать этот список книг из
//файла в классе BookManager и добавить в этот класс следующие методы:
//фильтрация книг по определенным критериям (по автору, по количеству страниц)
//сортировка книг по различным параметрам (по названию, по автору, по количеству страниц)
//создание подсписков книг (например, список книг определенного автора или список книг с количеством страниц
//больше определенного значения)
public class Main {
    static final String FILE_PATH = "resources/books.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Оруэлл", "1984", 2021, 231));
        books.add(new Book("Оруэлл", "Не хочу гуглить", 2020, 231));
        books.add(new Book("Толкиен", "Хоббит", 2024, 534));
        books.add(new Book("Толкиен", "Властелин колец", 2020, 324));
        books.add(new Book("Толкиен", "Властелин колец2", 2023, 231));
        writeBooksToFile(books);
/*        List<Book> bookList = readBooksToFile(FILE_PATH);
        System.out.println(bookList);
        //фильтрация книг по определенным критериям (по автору, по количеству страниц)
        Predicate<Book> filterByAuthor = book -> book.getAuthor().equals("Оруэлл");
        Predicate<Book> filterByYear = book -> book.getYear() <= 2021;
        List<Book> bookByAuthor = filterBook(FILE_PATH, filterByAuthor);
        System.out.println("Filtered by author: " + bookByAuthor);
        List<Book> bookByYear = filterBook(FILE_PATH, filterByYear);
        System.out.println("Filtered by year: " + bookByYear);*/
        //сортировка книг по различным параметрам (по названию, по автору, по количеству страниц)
        Comparator<Book> comparatorTitle = (book1, book2) -> book1.getTitle().compareTo(book2.getTitle());
        Comparator<Book> comparatorAuthor = (book1, book2) -> book1.getAuthor().compareTo(book2.getAuthor());
        Comparator<Book> comparatorPages = (book1, book2) -> book1.getPages() - (book2.getPages());
        List<Book> sortedByTitle = sortBook(FILE_PATH, comparatorTitle);
        System.out.println("Sorted by title: " + sortedByTitle);
        List<Book> sortedByAuthor = sortBook(FILE_PATH, comparatorAuthor);
        System.out.println("Sorted by Author: " + sortedByAuthor);
        List<Book> sortedByPages = sortBook(FILE_PATH, comparatorPages);
        System.out.println("Sorted by year: " + sortedByPages);
        //создание подсписков книг (например, список книг определенного автора или список книг с количеством страниц
        // больше определенного значения)
        System.out.println("Groups by author: " + groupBookByAutor(FILE_PATH));
        System.out.println("Groups by pages: " + groupBookByPages(FILE_PATH));
    }

    private static void writeBooksToFile(List<Book> books) throws IOException {
        FileOutputStream outputStream = new FileOutputStream(FILE_PATH);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(books);
        objectOutputStream.close();
    }

    private static List<Book> readBooksToFile(String filePath) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(filePath);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        List<Book> readBooks = (List<Book>) objectInputStream.readObject();
        return readBooks;
    }

    private static List<Book> filterBook(String filePath, Predicate<Book> predicate) throws IOException,
            ClassNotFoundException {
        List<Book> bookList = readBooksToFile(filePath);
        return bookList.stream()
                .filter(predicate)
                .toList();
    }

    private static List<Book> sortBook(String filePath, Comparator<Book> comparator) throws IOException,
            ClassNotFoundException {
        List<Book> bookList = readBooksToFile(filePath);
        return bookList.stream()
                .sorted(comparator)
                .toList();
    }

    private static Map<String, List<Book>> groupBookByPages(String filePath) throws IOException,
            ClassNotFoundException {
        List<Book> bookList = readBooksToFile(filePath);
        Map<String, List<Book>> booksByPages = bookList.stream()
                .collect(Collectors.groupingBy(book -> String.valueOf(book.getPages())));
        return booksByPages;
    }

    private static Map<String, List<Book>> groupBookByAutor(String filePath) throws IOException,
            ClassNotFoundException {
        List<Book> bookList = readBooksToFile(filePath);
        Map<String, List<Book>> booksByAuthor = bookList.stream()
                .collect(Collectors.groupingBy(book -> book.getAuthor()));
        return booksByAuthor;
    }
}
