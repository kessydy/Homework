package by.it_academy.homework5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
//        exercise1();
//        exercise2();
//        exercise3();
//        exercise4();
//        exercise5();
        exercise6();
//        exercise7();
//        exercise8();
//        exercise9();

    }

    /* Задача 1
    Продолжи последовательность:
    1. Определить закономерность, согласно которой формируется та или иная числовая последовательность.
    2. Написать функцию, которая формирует первые N элементов данной последовательности в виде целочисленного
    массива и выводит элементы массива на экран:
    1, -2,  3,  -4,   5,  -6…
    1,  0,  2,   0,   3,   0,  4....*/
    private static void exercise1() {
        int arrayLength = scanNumber("Please input array length: ");
        int[] array = new int[arrayLength];
        int counter = 1;
        int counter1 = 1;
        for (int i = 0; i < arrayLength; i++) {
            array[i] = counter;
            if (counter > 0) {
                counter = (counter + 1) * (-1);
            } else {
                counter = (counter - 1) * (-1);
            }
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < arrayLength; i++) {
            if (i % 2 == 0) {
                array[i] = counter1;
                counter1++;
            } else {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    /* Задача 2
    Заменить каждый элемент массива с нечетным индексом на ноль. */
    private static void exercise2() {
        int[] array = generateAray(8);
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    /* Задача 3
    Является ли массив возрастающей последовательностью: создайте массив из 4 случайных целых чисел
    из отрезка [10;99], выведите его на экран в строку. Далее определите и выведите на экран сообщение
    о том, является ли массив строго возрастающей последовательностью. */
    private static void exercise3() {
        int[] array = generateAray(4);
        System.out.println(Arrays.toString(array));
//        if (array[0] < array[1] && array[1] < array[2] && array[2] < array[3]) {
//            System.out.println("Array is increasing");
//        } else
//            System.out.println("Array isn't increasing");
        boolean check = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i + 1]) {
                System.out.println("Array isn't increasing");
                check = false;
                break;
            }
        }
        if (check == true) {
            System.out.println("Array is increasing");
        }
    }

    /* Задача 4
    Напишите класс, который заполняет случайными двузначными числами массив, размер которого при инициализации
    вводится с клавиатуры. После заполнения класс должен вывести на экран значения массива следующим образом:
    в первой строке - значения из четных ячеек массива;
    во второй строке - значения из нечетных ячеек массива. */
    private static void exercise4() {
        int arrayLength = scanNumber("Please input array1 length: ");
        int[] array = generateAray(arrayLength);
        System.out.println(Arrays.toString(array));
        System.out.println();
        for (int i = 0; i < arrayLength; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < arrayLength; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    /* Задача 5
    Напишите метод, который принимает два параметра: массив целых чисел М и еще одно целое число Х.
    Метод проверяет, находится ли число Х в массиве. */
    private static void exercise5() {

    }


    /* Задача 6*
    Создать второй массив из четных элементов первого массива.
    Условие задачи:
    1. Пользователь должен ввести с клавиатуры размер массива - натуральное число больше 3.
    Введенное пользователем число сохраняется в переменную n.
    2. Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
    3. Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
    4. Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.*/
    private static void exercise6() {
        int n = scanNumber("Please input array length: ");
        int array2Length = 0;
        if (n < 3) {
            exercise6();
        } else {
            int[] array = new int[n];
            Random r = new Random();
            for (int i = 0; i < n; i++) {
                array[i] = r.nextInt(n + 1);
                if (array[i] % 2 == 0) {
                    array2Length++;
                }
            }
            System.out.println(Arrays.toString(array));

            int[] array2 = new int[array2Length];
            int evenIndex = 0;
            for (int element : array) {
                if (element % 2 == 0 && element != 0) {
                    array2[evenIndex] = element;
                    evenIndex++;
                }
            }
            System.out.println(Arrays.toString(array2));
        }
    }



    /* Задача 7*
    Напишите метод, который получает в качестве параметра массив и заполняет его положительными
    случайными двузначными числами так, чтобы первая и вторая половины массива были идентичными.*/


    private static int scanNumber(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextInt();
    }

    private static int[] generateAray(int arrayLength) {
        int[] array = new int[arrayLength];
        Random r = new Random();
        for (int i = 0; i < arrayLength; i++) {
            array[i] = r.nextInt(10, 100);
        }
        return array;
    }
}