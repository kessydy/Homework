package by.it_academy.homework4;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
        exercise55();
        exercise6();
        exercise7();
        exercise8();
        exercise9();
    }

    // Напишите программу, которая выводит на консоль таблицу умножения
    private static void exercise1() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i * j);
                if (j * i < 10) {
                    System.out.print("     ");
                } else {
                    System.out.print("    ");
                }
            }
            System.out.println(" ");
        }
    }

    /*В цикле программа просит у пользователя ввести два числа и выводит результат их умножения.
    После вывода результата умножения программа спрашивает, надо ли завершить выполнение.
    И если пользователь введет число 1, то программа завершает цикл. Если введено любое другое число,
    то программа продолжает спрашивать у пользователя два числа и умножать их.*/

    private static void exercise2() {
        int inputNumber1 = scanNumber("Please input number a: ");
        int inputNumber2 = scanNumber("Please input number b: ");
        System.out.println("a x b = " + (inputNumber1 * inputNumber2));
        int inputNumber3 = scanNumber("Let's one more time? (Please, input some number. 1 = no)");
        if (inputNumber3 != 1) {
            exercise2();
        } else System.out.println("Thank you");
    }

    /* Последовательность Фибоначчи - последовательность целых чисел, построенная по следующему правилу:
    каждый член последовательности, начиная с 3-го, равен сумме двух предыдущих. Напишите класс,
    который получает с клавиатуры два первых члена последовательности и целое положительное число N.
    Класс подсчитает и выведет на экран сумму первых N членов последовательности Фибоначчи*/

    private static void exercise3() {
        int inputNumber1 = scanNumber("Please input first number: ");
        int inputNumber2 = scanNumber("Please input second number: ");
        int inputNumber3 = scanNumber("Please input quantity: ");
        int sum = inputNumber1 + inputNumber2;
        int[] A = new int[inputNumber3];
        A[0] = inputNumber1;
        A[1] = inputNumber2;
        for (int i = 2; i < (inputNumber3); i++) {
            A[i] = A[(i - 1)] + A[(i - 2)];
            sum += A[i];
        }
        System.out.println("The sum is " + sum);
    }
    /*Напишите класс, который принимает с клавиатуры числа, пока не будет введено значение 0.
    Для каждого введенного с клавиатуры положительного числа класс должен выводить на экран
    текст “Плюс”, для каждого отрицательного - “Минус”.
    */

    private static void exercise4() {
        int inputNumber = scanNumber("Please input number: ");
        if (inputNumber != 0) {
            if (inputNumber > 0) {
                System.out.println("Плюс");
            } else {
                System.out.println("Минус");
            }
            exercise4();
        } else System.out.println("Finish");
    }

    /* В городе N проезд в трамвае осуществляется по бумажным отрывным билетам. Каждую неделю
    трамвайное депо заказывает в местной типографии рулон билетов с номерами от 000001 до 999999.
    «Счастливым» считается билетик у которого сумма первых трёх цифр номера равна
    сумме последних трёх цифр, как, например, в билетах с номерами 003102 или 567576.
    Трамвайное депо решило подарить сувенир обладателю каждого счастливого билета и теперь
    раздумывает, как много сувениров потребуется. С помощью программы подсчитайте сколько
    счастливых билетов в одном рулоне?*/

    private static void exercise5() {
        int count = 0;
        for (int i = 1000; i < 1000000; i++) {
            int firstNumber = i / 100000;
            int secondNumber = (i - firstNumber * 100000) / 10000;
            int thirdNumber = (i % 10000) / 1000;
            int fourthNumber = (i % 1000) / 100;
            int fifthNumber = (i % 100) / 10;
            int sixthNumber = i % 10;
            if ((firstNumber + secondNumber + thirdNumber) == (fourthNumber + fifthNumber + sixthNumber)) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static void exercise55() {
        int count = 0;
        for (int sum = 1; sum <= 27; sum++) { //сумма чисел может быть от 1 (001) до 27 (999)
            int sumCount = 0;
            for (int i = 1; i < 1000; i++) {
                int firstNumber = (i % 1000) / 100;
                int secondNumber = (i % 100) / 10;
                int thirdNumber = i % 10;
                int firstPartSum = firstNumber + secondNumber + thirdNumber;
                if (firstPartSum == sum) {
                    sumCount++;
                }
            }
            count += sumCount * sumCount;
        /* каждая сумма даёт x^2 количество совпадений: н-р, сумма 1 встречается 3 раза (001, 010, 100),
        совпадений при этом 3^2 = 9: 001001, 001010, 001100, 010001, 010010, 010100, 100001, 100010, 100100.*/
        }
        System.out.println(count);
    }

    /*  Определим как “красивое” целое положительное трехзначное число X, для которого выполняется
    следующее условие: сумма квадратов первой и последней цифр равна квадрату средней цифры.
    Напишите класс, который выводит все “красивые” числа и их количество.*/

    private static void exercise6() {
        int count = 0;
        for (int i = 100; i < 1000; i++) {
            int firstNumber = (i % 1000) / 100;
            int secondNumber = (i % 100) / 10;
            int thirdNumber = i % 10;
            if (firstNumber * firstNumber + thirdNumber * thirdNumber == secondNumber * secondNumber) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("Quantity of 'pretty' numerous is " + count);
    }

    /*Напишите класс, который принимает с клавиатуры положительное целое число и выводит на экран все его
    делители. Кроме того, класс должен определять количество и сумму делителей и выводить результаты на экран.*/

    private static void exercise7() {
        int inputNumber = scanNumber("Please input positive number: ");
        if (inputNumber < 0) {
            System.out.print("Incorrect number");
        }
        System.out.print("For number " + inputNumber + " deliveries are: ");
        int count = 0;
        int sum = 0;
        for (int number = 1; number <= inputNumber; number++) {
            if (inputNumber % number == 0) {
                count++;
                sum = sum + number;
                System.out.print(number);
                if (number < inputNumber) {
                    System.out.print(", ");
                } else {
                    System.out.println(".");
                }
            }
        }
        System.out.println("Number of deliveries is " + count + ". The sum of deliveries is " + sum + ".");
    }

    /* Напишите класс, который принимает с клавиатуры оценки 30 учеников класса и выводит на экран:
    среднюю арифметическую оценку класса, число учеников, получивших неудовлетворительные оценки
     */

    private static void exercise8() {
        double sum = 0;//почему-то при int в числителе double average все равно считает целое число
        double average;
        int count = 0;
        for (int i = 1; i <= 30; i++) {
            int inputMark = scanNumber("Введите оценку:");
            System.out.println(i);//Чтобы ориентироваться в количестве введённых оценок
            sum = sum + inputMark;
            if (inputMark < 3) {
                count++;
            }
        }
        average = sum / 30;
        System.out.println("Средняя арифметическая оценка класса: " + average);
        System.out.println("Количество неудовлетворительных оценок: " + count);
    }

    /*Напишите класс, который принимает с клавиатуры три целых числа и проверяет, являются ли они
    тремя последовательными членами арифметической прогрессии. Если являются, то тогда нужно вывести
    еще 10 следующих членов этой прогрессии, если нет - вывести соответствующее сообщение.*/

    private static void exercise9() {
        int num1 = scanNumber("Please input first number: ");
        int num2 = scanNumber("Please input second number: ");
        int num3 = scanNumber("Please input third number: ");
        int nextNum = num3;
        if ((num2 - num1) != (num3 - num2)) {
            System.out.println("The numbers are not in progression");
        } else {
            System.out.print(num1 + " " + num2 + " " + num3 + " ");
            for (int i = 0; i < 10; i++) {
                nextNum = nextNum + (num3 - num2);
                System.out.print(nextNum + " ");
            }
        }
    }

    private static int scanNumber(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextInt();
    }
}