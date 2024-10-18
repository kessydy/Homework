package by.it_academy.homework9;

import java.util.Scanner;

public class Exercise1 {
    //1. Введите строку (текст). Показать номера символов, совпадающих с последним символом строки.
    private static void exercise1 () {
        String str = scanString();
        int index = str.length() - 1;
        while (str.lastIndexOf(str.charAt(str.length() - 1), index) > 0) {
            System.out.println(str.lastIndexOf(str.charAt(str.length() - 1), index));
            index = str.lastIndexOf(str.charAt(str.length() - 1), index) - 1;
        }
    }
    private static String scanString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the text: ");
        return scanner.nextLine();
    }
}
