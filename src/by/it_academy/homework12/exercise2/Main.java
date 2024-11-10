package by.it_academy.homework12.exercise2;

public class Main {
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();
        System.out.println("Removed element is: " + stack.pop());
        System.out.println(stack);
        stack.push("CORPUS");
        stack.push("SINE");
        stack.push("SPIRITU");
        stack.push("CADAVER");
        System.out.println(stack);
        stack.push("EST");
        stack.push("EST");
        stack.push("EST");
        stack.push("EST");
        stack.push("EST");
        stack.push("CADAVER");
        System.out.println(stack);
        System.out.println("Removed element is: " + stack.pop());
        System.out.println(stack);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("Removed element is: " + stack.pop());
        stack.pop();
        System.out.println("Removed element is: " + stack.pop());
        stack.pop();


    }
}
