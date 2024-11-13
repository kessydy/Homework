package by.it_academy.homework12.exercise2;

import java.util.Arrays;

public class MyStack<T> {
    private Object[] stack;
    private int lastIndex = -1;


    public MyStack(int size) {
        this.stack = new Object[size];
    }

    public void push(T elem) {
        if (lastIndex < 0) {
            lastIndex++;
            stack[lastIndex] = elem;
        } else if (lastIndex >= stack.length / 2) {
            stack = extension((T[]) stack);
            lastIndex++;
            stack[lastIndex] = elem;
        } else {
            lastIndex++;
            stack[lastIndex] = elem;
        }
    }

    public T[] extension(T[] stack) {
        return Arrays.copyOf(stack, stack.length * 3 / 2);
    }

    public T pop() {
        if (lastIndex < 0) {
            System.out.println("There are no elements in stack");
            return null;
        } else {
            Object removed = stack[lastIndex];
            stack[lastIndex] = null;
            lastIndex--;
            return (T) removed;
        }
    }

    @Override
    public String toString() {
        Object[] stack2;
        stack2 = new Object[lastIndex + 1];
        for (int i = 0; i < lastIndex + 1; i++) {
            stack2[i] = stack[i];
        }
        return Arrays.toString(stack2);
    }
}

