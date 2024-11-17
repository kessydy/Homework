package by.it_academy.utils;

public class MathemRandom {

    public static int generateRandomInt(int min, int max) {
        return (int) (Math.random() * max + min);
    }
}
