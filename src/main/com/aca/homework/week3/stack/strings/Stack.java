package com.aca.homework.week3.stack.strings;

public class Stack {
    private String[] stack = new String[10];
    private int index = 0;

    public void push(String string) {
        this.stack[index]=string;
        System.out.println(string);
        index++;
    }

    public String  pop() {
        index--;
        if(index<0){
            return "stack is empty";
        }
        return this.stack[index];
    }
}
