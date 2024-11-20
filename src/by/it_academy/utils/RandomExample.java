package by.it_academy.utils;

public class RandomExample {
    static java.util.Random rang = new java.util.Random();


    public static Integer generateRandomInt(int from, int to) {
        return rang.nextInt(from, to);
    }
}
