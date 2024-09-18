package by.it_academy.homework2;

import java.util.Scanner;

public class Task3 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int a = sc.nextInt();
        int lastdigit = a % 10;
        System.out.println("Последняя цифра = " + lastdigit);
    }
}
