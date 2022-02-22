package com.aca.homework.week3.stack.strings;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("main");
        stack.push("push1");
        stack.push("push2");
        stack.push("push3");
        stack.push("push4");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }

}
