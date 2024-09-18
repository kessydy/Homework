package by.it_academy.homework3;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        int number = getThreeDigitNumber();

        if ((number > 999) || number < 100) {
            System.out.println("Incorrect number");
        } else {

            int[] fullNumber = getFullThreeDigitNumber(number);
            System.out.println("The full number is: " + (fullNumber[0] * 100) + "+" + (fullNumber[1] * 10) + "+" + fullNumber[2]);

            int parityOfNumber = getParityOfNumber(fullNumber);
            System.out.println("The parity of number " + number + " is " + parityOfNumber);

            String symmetry = getSymmetryOfNumber(fullNumber);
            System.out.println("The number " + symmetry);
        }

        int number1 = scanNumber();
        int number2 = scanNumber();
        int number3 = scanNumber();

        if (number1 <= 0 || number2 <= 0 || number3 <= 0) {
            System.out.println("Incorrect number");
        } else {
            String checkTriangle = getCheckTriangle(number1, number2, number3);
            System.out.println("The triangle " + checkTriangle);
        }
        int numberOfMonth = scanNumber();
        String checkMonth = getCheckMonth(numberOfMonth);
        System.out.println(checkMonth);
    }

    private static int getThreeDigitNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter positive three-digit number:");
        return sc.nextInt();
    }

    /*Напишите класс, который принимает с клавиатуры целое положительное
    трехзначное число и выводит его на экран в «полном виде»:
    например, для числа 364 это будет выглядеть как 300+60+4.*/
    private static int[] getFullThreeDigitNumber(int number) {
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

    /*Назовем «степенью четности» числа количество четных цифр в нем. Например,
    для числа 4612 степень четности равна 3 (в его составе три четных цифры - 4, 6 и 2).
    Напишите класс, который принимает с клавиатуры положительное трехзначное
    число, а затем вычисляет и выводит на экран его «степень четности».*/
    private static int getParityOfNumber(int[] fullNumber) {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            if (fullNumber[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    /*  Трехзначное число называется «симметричным», если первая и последняя его цифры одинаковы.
    Напишите класс, который принимает с клавиатуры трехзначное положительное число и
    проверяет, является ли оно «симметричным». В соответствии с результатом проверки
    надо вывести на экран соответствующее текстовое сообщение.*/
    private static String getSymmetryOfNumber(int[] fullNumber) {
        if (fullNumber[0] == fullNumber[2]) {
            return "is symmetry";
        } else {
            return "isn't symmetry";
        }
    }

    /* Напишите класс, который принимает с клавиатуры три положительных числа и
    проверяет, могут ли они являться длинами сторон треугольника.
    По результатам проверки следует вывести на экран соответствующее текстовое сообщение.*/
    private static int scanNumber() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Please, enter positive number:");
        return sc1.nextInt();
    }

    private static String getCheckTriangle(int number1, int number2, int number3) {
        if ((number1 < number2 + number3) && (number2 < number1 + number3) && (number3 < number1 + number2)) {
            return "exists";
        } else {
            return "doesn't exists";
        }
    }

    /*  (switch) Напишите класс, который принимает с клавиатуры целое число, которое
    должно означать порядковый номер месяца. В случае если полученное значение
    действительно соответствует порядковому номеру одного из месяцев, следует вывести
    сезон (лето, осень, зима, весна), к которому относится месяц. В случае если введенное
    значение не является порядковым номером месяца, следует вывести на экран соответствующее
    текстовое сообщение.*/
    private static String getCheckMonth(int numberOfMonth) {
        String message;
        switch (numberOfMonth) {
            case 1:
                message = "The season is winter";
                break;
            case 2:
                message = "The season is winter";
                break;
            case 3:
                message = "The season is spring";
                break;
            case 4:
                message = "The season is spring";
                break;
            case 5:
                message = "The season is spring";
                break;
            case 6:
                message = "The season is summer";
                break;
            case 7:
                message = "The season is summer";
                break;
            case 8:
                message = "The season is summer";
                break;
            case 9:
                message = "The season is autumn";
                break;
            case 10:
                message = "The season is autumn";
                break;
            case 11:
                message = "The season is autumn";
                break;
            case 12:
                message = "The season is winter";
                break;
            default:
                message = "Invalid number of month";
        }
        return message;
    }
}


