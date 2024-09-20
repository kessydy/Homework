package by.it_academy.homework3;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        int numberInput1 = scanNumber("Please, enter positive three-digit number:");
        exercise1(numberInput1);
        int numberInput2 = scanNumber("Please, enter positive three-digit number:");
        exercise2(numberInput2);
        int numberInput3 = scanNumber("Please, enter positive three-digit number:");
        exercise3(numberInput3);
        int numberInput4 = scanNumber("Please, enter positive number:");
        int numberInput5 = scanNumber("Please, enter positive number:");
        int numberInput6 = scanNumber("Please, enter positive number:");
        exercise4(numberInput4, numberInput5, numberInput6);
        int numberInput7 = scanNumber("Please, enter positive number from 1 to 12:");
        exercise5(numberInput7);

    }
    private static int scanNumber(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextInt();
    }

    private static boolean checkNumber(int number) {
        return number >= 100 && number <= 999;
    }

    private static int[] massiveOfNumber(int number) {
        int hundreds = number / 100;
        int tens = number % 100 / 10;
        int units = number % 10;
        int n = 3;
        int[] fullNumber = new int[n];
        fullNumber[0] = hundreds;
        fullNumber[1] = tens;
        fullNumber[2] = units;
        return fullNumber;
    }

    /*Напишите класс, который принимает с клавиатуры целое положительное
    трехзначное число и выводит его на экран в «полном виде»:
    например, для числа 364 это будет выглядеть как 300+60+4.*/
    private static void exercise1(int numberEx1) {
        if (!checkNumber(numberEx1)) {
            System.out.println("Incorrect number");
        } else {
            int[] fullNumber = massiveOfNumber(numberEx1);
            System.out.println("The full number is: " + (fullNumber[0] * 100) + "+" + (fullNumber[1] * 10) + "+" + fullNumber[2]);
        }
    }

    /*Назовем «степенью четности» числа количество четных цифр в нем. Например,
    для числа 4612 степень четности равна 3 (в его составе три четных цифры - 4, 6 и 2).
    Напишите класс, который принимает с клавиатуры положительное трехзначное
    число, а затем вычисляет и выводит на экран его «степень четности».*/
    private static void exercise2(int numberEx2) {
        if (!checkNumber(numberEx2)) {
            System.out.println("Incorrect number");
        } else {
            int[] fullNumber = massiveOfNumber(numberEx2);
            int count = 0;
            for (int i = 0; i < 3; i++) {
                if (fullNumber[i] % 2 == 0) {
                    count++;
                }
            }
            System.out.println("The parity of number " + numberEx2 + " is " + count);
        }
    }

    /*  Трехзначное число называется «симметричным», если первая и последняя его цифры одинаковы.
    Напишите класс, который принимает с клавиатуры трехзначное положительное число и
    проверяет, является ли оно «симметричным». В соответствии с результатом проверки
    надо вывести на экран соответствующее текстовое сообщение.*/
    private static void exercise3(int numberEx3) {
        if (!checkNumber(numberEx3)) {
            System.out.println("Incorrect number");
        } else {
            int[] fullNumber = massiveOfNumber(numberEx3);
            if (fullNumber[0] == fullNumber[2]) {
                System.out.println("The number is symmetry");
            } else {
                System.out.println("The number isn't symmetry");
            }
        }
    }

    /* Напишите класс, который принимает с клавиатуры три положительных числа и
    проверяет, могут ли они являться длинами сторон треугольника.
    По результатам проверки следует вывести на экран соответствующее текстовое сообщение.*/

    private static boolean checkPositiveNumber(int number1, int number2, int number3) {
        return  (number1 > 0 || number2 > 0 || number3 > 0);
    }

    private static void exercise4(int number1Ex4, int number2Ex4, int number3Ex4) {
        if (!checkPositiveNumber(number1Ex4, number2Ex4, number3Ex4)){
            System.out.println("Incorrect number");
        } else if ((number1Ex4 < number2Ex4 + number3Ex4) && (number2Ex4 < number1Ex4 + number3Ex4) && (number3Ex4 < number1Ex4 + number2Ex4)) {
            System.out.println("The triangle exists");
        } else {
            System.out.println("The triangle doesn't exists");
        }
    }

    /*  (switch) Напишите класс, который принимает с клавиатуры целое число, которое
    должно означать порядковый номер месяца. В случае если полученное значение
    действительно соответствует порядковому номеру одного из месяцев, следует вывести
    сезон (лето, осень, зима, весна), к которому относится месяц. В случае если введенное
    значение не является порядковым номером месяца, следует вывести на экран соответствующее
    текстовое сообщение.*/
    private static void exercise5(int numberOfMonth) {
         String message = switch (numberOfMonth) {
            case 1, 2, 12 -> "The season is winter";
            case 3, 4, 5 -> "The season is spring";
            case 6, 7, 8 -> "The season is summer";
            case 9, 10, 11 -> "The season is autumn";
            default -> "Invalid number of month";
        };
        System.out.println(message);
    }
}



