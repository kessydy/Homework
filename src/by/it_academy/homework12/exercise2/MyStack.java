package by.it_academy.homework12.exercise2;

import java.util.Arrays;

public class MyStack<T> {
    private Object[] stack;
    private int lastIndex = 0;
    private int stackSize = 0;

    public MyStack() {
        this.stack = new Object[10];
    }

    public void push(T elem) {
        if (stackSize == 0) {
            stack[lastIndex] = elem;
            stackSize++;
        } else if (stackSize >= stack.length / 2) {
            stack = extension((T[]) stack);
            lastIndex++;
            stack[lastIndex] = elem;
            stackSize++;
        } else {
            lastIndex++;
            stack[lastIndex] = elem;
            stackSize++;
        }
    }

    public T[] extension(T[] stack) {
        Object[] stack1;
        stack1 = new Object[stack.length * 3 / 2];
        for (int i = 0; i < stack.length; i++) {
            stack1[i] = stack[i];
        }
        return (T[]) stack1;
    }

    public T pop() {
        Object removed = stack[lastIndex];
        stack[lastIndex] = null;
        if (lastIndex == 0) {
            lastIndex = 0;
            stackSize = 0;
        } else {
            lastIndex--;
            stackSize--;
        }
            return (T) removed;
    }

    @Override
    public String toString() {
        Object[] stack2;
        stack2 = new Object[stackSize];
        for (int i = 0; i < stackSize; i++) {
            stack2[i] = stack[i];
            }
        return Arrays.toString(stack2);
    }
}

