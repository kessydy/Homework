package by.it_academy.homework11.phoneBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class PhoneBook {
    private HashMap<String, List<String>> phoneBook = new HashMap<>();

    public void addContact(String name, String number) {
        List<String> numbers = phoneBook.get(name);
        if (numbers == null) {
            List<String> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(number);
            phoneBook.put(name, phoneNumbers);
        } else if (!numbers.contains(number)) {
            numbers.add(number);
        }
    }

    public void printBook() {
        for (String name : phoneBook.keySet()) {
            List<String> numbers = phoneBook.get(name);
            System.out.println(name + ": " + numbers);
        }
    }
}
