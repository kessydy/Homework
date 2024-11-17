package by.it_academy.utils;

import java.util.Scanner;

public class ScamNumberMy {
    private static int scanNumber(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextInt();
    }
}
