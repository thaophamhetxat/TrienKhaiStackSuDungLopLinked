package com.codegym;

public class Main {

    public static void main(String[] args) {
        System.out.println("1. Stack of interger: ");
        stackOfIntergers();
        System.out.println("2. stack of string: ");
        stackOfStrings();


    }

    public static void stackOfStrings() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("one");
        stack.push("two");
        stack.push("three");
        stack.push("for");
        stack.push("ten");

        System.out.println("1. Size of stack after push operations: " + stack.size());
        System.out.println("2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("  3. Size of stack after pop operations : " + stack.size());

    }

    private static void stackOfIntergers() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        System.out.println("1. Size of stack after push operations: " + stack.size());
        System.out.println("2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("  3. Size of stack after pop operations : " + stack.size());
    }

}
