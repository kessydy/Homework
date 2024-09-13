package by.it_academy.homework2;

public class Task5 {
    public static void main (String [] args) {
        int abcd = 2435;
        int ab = abcd / 100;
        int cd = abcd - ab * 100;
        int sum = ab + cd;
        System.out.println("ab + cd = " + ab + " + " + cd + " = " + sum);
    }
}
