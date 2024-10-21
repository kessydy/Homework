package by.it_academy.homework9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework9 {
    public static void main(String[] args) {
//        exercise1();
//        exercise2();
//        exercise3();
//        exercise4();
        exercise5();
    }

    //1. Введите строку (текст). Показать номера символов, совпадающих с последним символом строки.
    private static void exercise1() {
        String str = scanString();
        int index = str.length() - 1;
        for (int i = 0; i < index; i++) {
            if (str.charAt(i) == str.charAt(index)) {
                System.out.println(str.lastIndexOf(str.charAt(index), i));
            }
        }
    }

    //2. Напишите класс, который принимает с клавиатуры строковое значение и определяет,
    // является ли оно палиндромом (симметричным).
//    i am anna ma i
    private static void exercise2() {
        String str = scanString();
        int count = 0;
        String lowerCaseStr = str.toLowerCase();
        System.out.print("The text ");
        for (int i = 0; i < str.length() / 2; i++) {
            if (lowerCaseStr.charAt(i) != lowerCaseStr.charAt(str.length() - 1 - i)) {
                System.out.print("isn't ");
                break;
            }
        }
            System.out.println("symmetrical.");
    }

    //3. Найдите количество вхождения слова 'test' в строке.
    private static void exercise3() {
        String str = scanString();
        String lowerCaseStr = str.toLowerCase();
        String testPattern = "test";
        Pattern pattern = Pattern.compile(testPattern);
        Matcher matcher = pattern.matcher(lowerCaseStr);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println(count);
    }

    //4. Напишите регулярное выражение чтобы найти все годы между 1977 и 1982
    //1975 1976 1977 1978 1979 1980 1981 1982 1983 1984
    private static void exercise4() {
        String years = "1975 1976 1977 1978 1979 1980 1981 1982 1983 1984";
        String yearsPattern = "197[89]|198[01]";
        Pattern pattern = Pattern.compile(yearsPattern);
        Matcher matcher = pattern.matcher(years);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    //5.  Напишите регулярное выражение для  IP адреса. 4 группы цифр (от 1 до 3 цифр в каждой)
    // разделены точками. Группа содержит число в диапазоне от 1 до 255
    //Пример: 127.0.0.1  255.255.255.253   100.99.44.2
    private static void exercise5() {
        String ip = "127.0.0.1  255.255.255.253  100.99.44.2  260.124.245.0  2.123.242.212    2.2.265.2  " +
                "001.1.000.1    1.1.1.01   210.138.12.1  0.0.0.0";
        String ipPattern = "(^[1-9]?[0-9]|\\D[1-9]?[0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\." +
                "(([1-9]?[0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){2}" +
                "([1-9]?[0-9]\\D|1[0-9][0-9]|2[0-4][0-9]|25[0-5]|[1-9]?[0-9]$)";

        Pattern pattern = Pattern.compile(ipPattern);
        Matcher matcher = pattern.matcher(ip);
        while (matcher.find()) {
            String rightIp = matcher.group()
                    .replaceAll(" ", "");
            System.out.println("Right IP is: " + rightIp);
        }
    }

    private static String scanString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the text: ");
        return scanner.nextLine();
    }
}

