package by.it_academy.homework11.phoneBook;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
//    Реализуйте структуру телефонной книги с помощью HashMap.
//    Программа также должна учитывать, что во входной структуре будут
//    повторяющиеся имена с разными телефонами, их необходимо считать, как одного человека с разными телефонами.

public class Main {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("Ivanov", "123");
        phoneBook.addContact("Ivanov", "1234");
        phoneBook.addContact("Petrov", "546685");
        phoneBook.addContact("Sidorov", "8956477");
        phoneBook.addContact("Ivanov", "12356233");
        phoneBook.addContact("Petrov", "787897");
        phoneBook.addContact("Petrov", "787897");
        phoneBook.printBook();

    }



}


