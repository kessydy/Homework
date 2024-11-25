package by.it_academy.homework14.book;

import java.io.Serializable;

//Управление списком книг.
//Файл books.txt содержит список книг в бинарном формате. Необходимо прочитать этот список книг из файла в классе BookManager и добавить в этот класс следующие методы:
//фильтрация книг по определенным критериям (по автору, по количеству страниц)
//сортировка книг по различным параметрам (по названию, по автору, по количеству страниц)
//создание подсписков книг (например, список книг определенного автора или список книг с количеством страниц больше определенного значения)
public class Book implements Serializable {
    private String author;
    private String title;
    private int year;
    private int pages;

    public Book(String author, String title, int year, int pages) {
        this.author = author;
        this.title = title;
        this.year = year;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

      public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return "Author: " + author +
                ", title: '" + title + '\'' +
                ", year: " + year +
                ", pages: " + pages + "|";
    }
}
