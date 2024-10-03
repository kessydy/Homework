package by.it_academy.homework5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
        exercise6();
        exercise7();
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

        for (int i = 0; i < arrayLength; i++) {
            array[i] = i + 1;
            if (array[i] % 2 == 0) {
                array[i] *= -1;
            }
        }
        System.out.println(Arrays.toString(array));
        int counter = 1;
        for (int i = 0; i < arrayLength; i++) {
            if (i % 2 == 0) {
                array[i] = counter;
                counter++;
            } else {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    /* Задача 2
    Заменить каждый элемент массива с нечетным индексом на ноль. */
    private static void exercise2() {
        int[] array = generateArray(8);
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
        int[] array = generateArray(4);
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
        int arrayLength = scanNumber("Please input array length: ");
        int[] array = generateArray(arrayLength);
        System.out.println(Arrays.toString(array));
        int lengthOdd = arrayLength / 2;
        int lengthEven = arrayLength - lengthOdd;
        int[] evenArray = new int[lengthEven];
        int[] oddArray = new int[lengthOdd];
        int evenIndex = 0;
        int oddIndex = 0;
        for (int i = 0; i < arrayLength; i++) {
            if (i % 2 == 0) {
                evenArray[evenIndex] = array[i];
                evenIndex++;
            } else {
                oddArray[oddIndex] = array[i];
                oddIndex++;
            }
        }
        System.out.println(Arrays.toString(evenArray));
        System.out.println(Arrays.toString(oddArray));
    }

    /* Задача 5
    Напишите метод, который принимает два параметра: массив целых чисел М и еще одно целое число Х.
    Метод проверяет, находится ли число Х в массиве. */
    private static void exercise5() {
        int[] newArray = {13, 13, 15, 65, 356, 32, 67, 88};
        int number = 356;
        System.out.println(checkArray(newArray, number));
    }

    private static String checkArray(int[] M, int X) {
//        boolean find = false;
//        for (int i = 0; i < M.length; i++) {
//            if (M[i] == X) {
//                find = true;
//            }
//        }
//        if (find == true) {
//            return "Number is in array";
//        } else {
//            return "Number isn't in array";
//        }

        Arrays.sort(M);
        int find = Arrays.binarySearch(M, X);
        if (find > 0) {
            return "Number is in array";
        } else {
            return "Number isn't in array";
        }
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
        int n = scanNumber("Please input array length more than 3: ");
        int array2Length = 0;
        if (n <= 3) {
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
                if (element % 2 == 0) {
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
    private static void exercise7() {
        int[] emptyArray = new int[9];
        System.out.println(Arrays.toString(newArray(emptyArray)));
    }

    private static int[] newArray(int[] fullArray) {
        Random r = new Random();
        int myLength = fullArray.length;
        for (int i = 0; i < myLength / 2; i++) {
            if (myLength % 2 == 0) {
                fullArray[i] = fullArray[(myLength / 2 + i)] = r.nextInt(10, 100);
            } else {
                fullArray[i] = fullArray[(myLength / 2 + 1 + i)] = r.nextInt(10, 100);
                fullArray[(myLength / 2)] = r.nextInt(10, 100);
            }
        }
        return fullArray;
    }

    private static int scanNumber(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextInt();
    }

    private static int[] generateArray(int arrayLength) {
        int[] array = new int[arrayLength];
        Random r = new Random();
        for (int i = 0; i < arrayLength; i++) {
            array[i] = r.nextInt(10, 100);
        }
        return array;
    }
}